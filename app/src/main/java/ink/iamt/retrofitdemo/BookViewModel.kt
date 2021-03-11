package ink.iamt.retrofitdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookViewModel: ViewModel() {
    var numberFound = MutableLiveData<Int>()

    init {
        numberFound.value = 0
    }

    fun searchBook(keyword: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.api.searchBook(keyword)
            numberFound.postValue(response.body()?.numFound)
        }
    }
}
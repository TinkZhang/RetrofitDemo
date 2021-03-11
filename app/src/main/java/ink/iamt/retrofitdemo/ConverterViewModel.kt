package ink.iamt.retrofitdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConverterViewModel: ViewModel() {
    var text = MutableLiveData<String>()

    init {
        text.value = "loading"
    }

    fun getRate(base: String, target: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.api.getRate(base, target)
            text.postValue(response.string())
        }
    }
}
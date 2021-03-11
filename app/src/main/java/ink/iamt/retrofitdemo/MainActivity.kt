package ink.iamt.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

const val TAG = "Tink"

class MainActivity : AppCompatActivity() {
    val viewModel: BookViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.numberFound.observe(this) {
            Log.d(TAG, "I found $it books. ")
        }
        viewModel.searchBook("hello")
    }
}
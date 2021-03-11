package ink.iamt.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels

const val TAG = "Tink"

class MainActivity : AppCompatActivity() {
    val viewModel: ConverterViewModel by viewModels()
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)

        viewModel.text.observe(this) {
            textView.text = it
        }
        viewModel.getRate("USD", "CNY")
    }
}
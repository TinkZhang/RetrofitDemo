package ink.iamt.retrofitdemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ConverterService by lazy {
        Retrofit.Builder()
                .baseUrl("https://api.exchangeratesapi.io")
                .build()
                .create(ConverterService::class.java)
    }
}
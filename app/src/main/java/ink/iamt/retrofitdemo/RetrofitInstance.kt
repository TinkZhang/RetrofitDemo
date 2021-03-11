package ink.iamt.retrofitdemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: BookApi by lazy {
        Retrofit.Builder()
                .baseUrl("http://openlibrary.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BookApi::class.java)
    }
}
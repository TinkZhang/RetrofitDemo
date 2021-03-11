package ink.iamt.retrofitdemo

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ConverterService {
    @GET("/latest")
    suspend fun getRate(
            @Query("base") base: String,
            @Query("symbols") symbols: String)
    : ResponseBody
}
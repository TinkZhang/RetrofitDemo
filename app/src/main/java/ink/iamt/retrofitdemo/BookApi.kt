package ink.iamt.retrofitdemo

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApi {
    @GET("/search.json")
    suspend fun searchBook(@Query("q") keyword: String): Response<OpenLibraryDto>
}
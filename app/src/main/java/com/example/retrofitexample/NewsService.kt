package com.example.retrofitexample

import android.graphics.pdf.PdfDocument
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://newsapi.org/"
const val API_KEY = "b3822ea79d9f41019d8c2f033c81450f"

interface NewsInterface  {
    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadline(@Query("country")country : String, @Query("page")page: Int): Call<News>
}
object NewsService{
    val newInstances:NewsInterface
    init {
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
        newInstances = retrofit.create(NewsInterface :: class.java)
    }

}


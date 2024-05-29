package eu.tutorials.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    val recipeService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("categories.php") // URL의 EndPoint (어떤 파일에서 데이터를 받아오는지)
    suspend fun getCategories():CategoriesResponse

}
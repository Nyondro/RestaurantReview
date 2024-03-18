package com.example.restaurantreview.data.retrofit

import com.example.restaurantreview.data.response.GithubResponse
import com.example.restaurantreview.data.response.PostReviewResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    fun getListUsers(@Query("q") q : String) : Call<GithubResponse>

    @GET

    @FormUrlEncoded
    @Headers("Authorization: token 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")
    @POST("review")
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}
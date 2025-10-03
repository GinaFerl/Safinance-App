package com.ginaf.safinance.data.remote.retrofit

import com.ginaf.safinance.data.remote.response.Transaction
import com.ginaf.safinance.data.remote.response.TransactionResponse
import com.ginaf.safinance.data.remote.response.UserResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @FormUrlEncoded
    @POST("login")
    suspend fun login (
        @Field("email") email: String,
        @Field("password") password: String
    ): UserResponse

    @GET("transactions")
    suspend fun getTransaction(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("size") size: Int
    ): TransactionResponse

    @Multipart
    @POST("transactions")
    suspend fun addTransaction (
        @Header("Authorization") token: String,
    ): TransactionResponse

    @PUT("transactions/{id}")
    suspend fun updateTransaction (
        @Header("Authorization") token: String,
        @Path("id") id: Int,
        @Body transaction: Transaction
    ): TransactionResponse

    @DELETE("transactions/{id}")
    suspend fun deleteTransaction (
        @Header("Authorization") token: String,
        @Path("id") id: Int,
        @Body transaction: Transaction
    ): TransactionResponse

    @GET("monthly-reports")
    suspend fun getMonthlyReport (
        @Header("Authorization") token: String,
        @Path("year") year: Int,
        @Path("month") month: Int
    ): TransactionResponse

}
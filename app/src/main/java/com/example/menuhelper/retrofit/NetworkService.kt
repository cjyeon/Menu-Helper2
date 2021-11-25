package com.example.chap18.retrofit

import com.example.chap18.model.MenuDescModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("/v2/everything")
    fun getList(
        //요구하는 기본인자를 @Query형태로
        @Query("q") q: String?,
        @Query("apiKey") apiKey: String?,
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int
    ): retrofit2.Call<MenuDescModel>    //서버로부터 받아 오는 데이터 PageListModel 형태로 반환
}
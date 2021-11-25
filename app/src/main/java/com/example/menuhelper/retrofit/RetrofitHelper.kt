package com.example.menuhelper.retrofit

import android.app.Application
import com.example.chap18.retrofit.NetworkService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofitHelper: Application() {

    companion object {
        val QUERY = "travel"
        val API_KEY = "079dac74a5f94ebdb990ecf61c8854b7"
        val BASE_URL = "https://newsapi.org"

        //add....................................
        var networkService: NetworkService
        val retrofit: Retrofit
            get() = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //Json데이터를 사용자가 정의한 Java 객채로 변환해주는 라이브러리
                .build()
        init {
            //retrofit 객체 생성
            networkService = retrofit.create(NetworkService::class.java)
        }
    }

}
package com.osmanboy.mvp.model.api

import retrofit2.http.GET
import com.osmanboy.mvp.model.pojo.EmployeeResponse
import io.reactivex.Observable

interface ApiService {
    @GET("testTask.json")
    fun employees(): Observable<EmployeeResponse>
}
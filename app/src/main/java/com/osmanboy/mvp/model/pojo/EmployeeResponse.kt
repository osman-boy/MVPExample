package com.osmanboy.mvp.model.pojo

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class EmployeeResponse {
    @SerializedName("response")
    @Expose
    var response: List<Employee> = emptyList()
}
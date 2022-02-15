package com.osmanboy.mvp.model.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Employee (
    @SerializedName("f_name")
    @Expose
    var name: String,

    @SerializedName("l_name")
    @Expose
    var lName: String,

    @SerializedName("birthday")
    @Expose
    var birthday: String,

    @SerializedName("avatr_url")
    @Expose
    var avatrUrl: String ,

    @SerializedName("specialty")
    @Expose
    var specialty: List<Speciality>
)
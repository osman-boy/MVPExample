package com.osmanboy.mvp.model.pojo

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Speciality {
    @SerializedName("specialty_id")
    @Expose
    var specialtyId = 0

    @SerializedName("name")
    @Expose
    var name: String? = null
}
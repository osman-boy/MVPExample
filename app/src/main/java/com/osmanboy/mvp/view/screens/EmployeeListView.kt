package com.osmanboy.mvp.view.screens

import com.osmanboy.mvp.model.pojo.Employee

interface EmployeeListView {

    fun showData(employees:List<Employee>)

    fun errorToast(message:String?)
}
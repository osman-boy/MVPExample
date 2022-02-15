package com.osmanboy.mvp.view.adapter

import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.osmanboy.mvp.model.pojo.Employee

class EmployeeDiffUtil : ItemCallback<Employee>() {

    override fun areItemsTheSame(oldItem: Employee, newItem: Employee): Boolean {
        return oldItem.name == newItem.name && oldItem.lName == newItem.lName
    }

    override fun areContentsTheSame(oldItem: Employee, newItem: Employee) = oldItem == newItem

}
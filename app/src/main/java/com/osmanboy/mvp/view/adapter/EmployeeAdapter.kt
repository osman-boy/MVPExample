package com.osmanboy.mvp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.osmanboy.mvp.databinding.EmployeeItemBinding
import com.osmanboy.mvp.model.pojo.Employee

class EmployeeAdapter : ListAdapter<Employee, EmployeeAdapter.EmployeeViewHolder>(EmployeeDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EmployeeViewHolder(EmployeeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = getItem(position)

        holder.binding.also {
            it.textViewName.text = employee.name
            it.textViewLastName.text = employee.lName
        }

    }


    class EmployeeViewHolder(val binding: EmployeeItemBinding) : RecyclerView.ViewHolder(binding.root)
}
package com.osmanboy.mvp.view.screens

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.osmanboy.mvp.R
import com.osmanboy.mvp.view.adapter.EmployeeAdapter
import com.osmanboy.mvp.model.pojo.Employee
import com.osmanboy.mvp.presenter.EmployeeListPresenter

class EmployeeListActivity : AppCompatActivity(), EmployeeListView {

    private val presenter = EmployeeListPresenter(this)
    private val adapter = EmployeeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)

        findViewById<RecyclerView>(R.id.recyclerViewEmployees).adapter = adapter
        presenter.loadData()


    }

    override fun showData(employees: List<Employee>) {
        adapter.submitList(employees)
    }

    override fun errorToast(message: String?) =Toast.makeText(this, message,LENGTH_SHORT).show()


    override fun onDestroy() {
        presenter.destroyDisposable()
        super.onDestroy()
    }
}
package com.osmanboy.mvp.presenter

import com.osmanboy.mvp.model.api.ApiFactory
import com.osmanboy.mvp.view.screens.EmployeeListView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class EmployeeListPresenter(private val view: EmployeeListView) {

    private val apiService = ApiFactory.getInstance().apiService
    private val disposableContainer = CompositeDisposable()

    fun loadData() {
        val disposable = apiService.employees()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ view.showData(it.response) }) { view.errorToast(it.message) }

        disposableContainer.add(disposable)
    }

    fun destroyDisposable() = disposableContainer.dispose()


}
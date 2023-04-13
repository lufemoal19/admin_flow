package com.luissapplication.app.modules.reportsadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.reportsadmin.`data`.model.ReportsAdminModel
import org.koin.core.KoinComponent

class ReportsAdminVM : ViewModel(), KoinComponent {
  val reportsAdminModel: MutableLiveData<ReportsAdminModel> = MutableLiveData(ReportsAdminModel())

  var navArguments: Bundle? = null
}

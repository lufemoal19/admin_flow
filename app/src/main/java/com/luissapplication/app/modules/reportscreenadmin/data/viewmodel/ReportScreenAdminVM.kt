package com.luissapplication.app.modules.reportscreenadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.reportscreenadmin.`data`.model.ReportScreenAdminModel
import org.koin.core.KoinComponent

class ReportScreenAdminVM : ViewModel(), KoinComponent {
  val reportScreenAdminModel: MutableLiveData<ReportScreenAdminModel> =
      MutableLiveData(ReportScreenAdminModel())

  var navArguments: Bundle? = null
}

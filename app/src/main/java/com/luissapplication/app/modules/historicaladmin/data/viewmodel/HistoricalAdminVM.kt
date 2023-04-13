package com.luissapplication.app.modules.historicaladmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.historicaladmin.`data`.model.HistoricalAdminModel
import org.koin.core.KoinComponent

class HistoricalAdminVM : ViewModel(), KoinComponent {
  val historicalAdminModel: MutableLiveData<HistoricalAdminModel> =
      MutableLiveData(HistoricalAdminModel())

  var navArguments: Bundle? = null
}

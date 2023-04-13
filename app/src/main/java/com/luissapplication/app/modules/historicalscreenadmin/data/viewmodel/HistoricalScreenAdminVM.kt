package com.luissapplication.app.modules.historicalscreenadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.historicalscreenadmin.`data`.model.HistoricalScreenAdminModel
import org.koin.core.KoinComponent

class HistoricalScreenAdminVM : ViewModel(), KoinComponent {
  val historicalScreenAdminModel: MutableLiveData<HistoricalScreenAdminModel> =
      MutableLiveData(HistoricalScreenAdminModel())

  var navArguments: Bundle? = null
}

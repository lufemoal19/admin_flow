package com.luissapplication.app.modules.notificationadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.notificationadmin.`data`.model.NotificationAdminModel
import org.koin.core.KoinComponent

class NotificationAdminVM : ViewModel(), KoinComponent {
  val notificationAdminModel: MutableLiveData<NotificationAdminModel> =
      MutableLiveData(NotificationAdminModel())

  var navArguments: Bundle? = null
}

package com.luissapplication.app.modules.homepageadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.homepageadmin.`data`.model.HomepageAdminModel
import org.koin.core.KoinComponent

class HomepageAdminVM : ViewModel(), KoinComponent {
  val homepageAdminModel: MutableLiveData<HomepageAdminModel> =
      MutableLiveData(HomepageAdminModel())

  var navArguments: Bundle? = null
}

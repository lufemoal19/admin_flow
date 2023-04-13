package com.luissapplication.app.modules.savedadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.savedadmin.`data`.model.SavedAdminModel
import org.koin.core.KoinComponent

class SavedAdminVM : ViewModel(), KoinComponent {
  val savedAdminModel: MutableLiveData<SavedAdminModel> = MutableLiveData(SavedAdminModel())

  var navArguments: Bundle? = null
}

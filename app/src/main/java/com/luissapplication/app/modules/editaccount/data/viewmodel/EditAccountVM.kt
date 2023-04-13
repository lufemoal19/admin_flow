package com.luissapplication.app.modules.editaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.editaccount.`data`.model.EditAccountModel
import org.koin.core.KoinComponent

class EditAccountVM : ViewModel(), KoinComponent {
  val editAccountModel: MutableLiveData<EditAccountModel> = MutableLiveData(EditAccountModel())

  var navArguments: Bundle? = null
}

package com.luissapplication.app.modules.assetsuniactivos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.assetsuniactivos.`data`.model.AssetsUniactivosModel
import org.koin.core.KoinComponent

class AssetsUniactivosVM : ViewModel(), KoinComponent {
  val assetsUniactivosModel: MutableLiveData<AssetsUniactivosModel> =
      MutableLiveData(AssetsUniactivosModel())

  var navArguments: Bundle? = null
}

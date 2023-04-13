package com.luissapplication.app.modules.assetinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.luissapplication.app.modules.assetinformation.`data`.model.AssetInformationModel
import org.koin.core.KoinComponent

class AssetInformationVM : ViewModel(), KoinComponent {
  val assetInformationModel: MutableLiveData<AssetInformationModel> =
      MutableLiveData(AssetInformationModel())

  var navArguments: Bundle? = null
}

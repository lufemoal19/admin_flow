package com.luissapplication.app.modules.assetinformation.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AssetInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLaptopDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laptop_11_avail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_11_available_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)

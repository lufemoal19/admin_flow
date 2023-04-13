package com.luissapplication.app.modules.assetsuniactivos.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AssetsUniactivosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAssets: String? = MyApp.getInstance().resources.getString(R.string.lbl_assets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDynamicAssets: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dynamic_assets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaptop: String? = MyApp.getInstance().resources.getString(R.string.lbl_laptop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_11_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemoteControl: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_remote_control)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_12_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpeaker: String? = MyApp.getInstance().resources.getString(R.string.lbl_speaker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_14_available)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarkers: String? = MyApp.getInstance().resources.getString(R.string.lbl_markers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_14_available)

)

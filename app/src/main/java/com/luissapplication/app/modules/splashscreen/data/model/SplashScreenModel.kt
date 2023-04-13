package com.luissapplication.app.modules.splashscreen.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUniActivos: String? = MyApp.getInstance().resources.getString(R.string.lbl_uniactivos)

)

package com.luissapplication.app.modules.logout.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouwantto: String? = MyApp.getInstance().resources.getString(R.string.msg_do_you_want_to)

)

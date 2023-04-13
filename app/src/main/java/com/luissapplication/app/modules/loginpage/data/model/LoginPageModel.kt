package com.luissapplication.app.modules.loginpage.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeythere: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_there)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotyourpas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLabelValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLabelOneValue: String? = null
)

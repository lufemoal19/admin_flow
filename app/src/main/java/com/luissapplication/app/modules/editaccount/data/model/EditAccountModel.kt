package com.luissapplication.app.modules.editaccount.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeythere: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_there)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdityourAccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_your_accou2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etUniversityValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCurrentPassworValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNewPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmPassworValue: String? = null
)

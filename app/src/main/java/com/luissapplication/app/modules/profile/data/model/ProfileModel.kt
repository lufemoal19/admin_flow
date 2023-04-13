package com.luissapplication.app.modules.profile.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuanPascal: String? = MyApp.getInstance().resources.getString(R.string.lbl_juan_pascal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudent: String? = MyApp.getInstance().resources.getString(R.string.lbl_student)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdityouraccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_your_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistorical: String? = MyApp.getInstance().resources.getString(R.string.lbl_historical)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopupNotifica: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pop_up_notifica)

)

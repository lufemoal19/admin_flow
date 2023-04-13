package com.luissapplication.app.modules.notifications.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_oops_an_issue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_about_1_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_oops_an_issue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_about_3_hours_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_oops_an_issue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_about_3_hours_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyIfinished: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_i_finished)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMayCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_may)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyeverything: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_everything)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAprilCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_april)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyIfinishedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_i_finished2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMayCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_may)

)

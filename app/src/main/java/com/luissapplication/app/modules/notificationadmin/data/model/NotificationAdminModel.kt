package com.luissapplication.app.modules.notificationadmin.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationAdminModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_class_2001_ste)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDynamicassets: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dynamic_assets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemotecontrol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remote_control)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStaticassetsr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_static_assets_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_pcs_x_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_conditioner2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComments: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)

package com.luissapplication.app.modules.reportscreenadmin.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReportScreenAdminModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReports: String? = MyApp.getInstance().resources.getString(R.string.lbl_reports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_course_dise_o)
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
  var txtPcs: String? = MyApp.getInstance().resources.getString(R.string.lbl_pcs_x_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirconditioner: String? =
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
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)

package com.luissapplication.app.modules.homepageadmin.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageAdminModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomePedro: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_pedro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassesleft: String? = MyApp.getInstance().resources.getString(R.string.lbl_classes_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassinprogre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_class_in_progre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTxtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookedclassroo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_booked_classroo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_class_2001)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudentStefan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_student_stefan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAssets: String? = MyApp.getInstance().resources.getString(R.string.lbl_assets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistorical: String? = MyApp.getInstance().resources.getString(R.string.lbl_historical)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReports: String? = MyApp.getInstance().resources.getString(R.string.lbl_reports)

)

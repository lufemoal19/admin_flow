package com.luissapplication.app.modules.savedadmin.`data`.model

import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SavedAdminModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSaved: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved)

)

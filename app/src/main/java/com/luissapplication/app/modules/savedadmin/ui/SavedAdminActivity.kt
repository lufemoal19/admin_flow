package com.luissapplication.app.modules.savedadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivitySavedAdminBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.savedadmin.`data`.viewmodel.SavedAdminVM
import kotlin.String
import kotlin.Unit

class SavedAdminActivity : BaseActivity<ActivitySavedAdminBinding>(R.layout.activity_saved_admin) {
  private val viewModel: SavedAdminVM by viewModels<SavedAdminVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.savedAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SAVED_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SavedAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.luissapplication.app.modules.logout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityLogoutBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.logout.`data`.viewmodel.LogoutVM
import com.luissapplication.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

class LogoutActivity : BaseActivity<ActivityLogoutBinding>(R.layout.activity_logout) {
  private val viewModel: LogoutVM by viewModels<LogoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogOut.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

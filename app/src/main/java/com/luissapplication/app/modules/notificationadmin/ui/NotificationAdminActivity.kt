package com.luissapplication.app.modules.notificationadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityNotificationAdminBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.notificationadmin.`data`.viewmodel.NotificationAdminVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationAdminActivity :
    BaseActivity<ActivityNotificationAdminBinding>(R.layout.activity_notification_admin) {
  private val viewModel: NotificationAdminVM by viewModels<NotificationAdminVM>()

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 867

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

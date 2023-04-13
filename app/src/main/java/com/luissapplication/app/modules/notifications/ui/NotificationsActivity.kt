package com.luissapplication.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityNotificationsBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 280


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

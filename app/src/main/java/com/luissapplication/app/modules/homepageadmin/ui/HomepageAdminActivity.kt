package com.luissapplication.app.modules.homepageadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityHomepageAdminBinding
import com.luissapplication.app.modules.assetsuniactivos.ui.AssetsUniactivosActivity
import com.luissapplication.app.modules.historicaladmin.ui.HistoricalAdminActivity
import com.luissapplication.app.modules.homepageadmin.`data`.viewmodel.HomepageAdminVM
import com.luissapplication.app.modules.notificationadmin.ui.NotificationAdminActivity
import com.luissapplication.app.modules.notifications.ui.NotificationsActivity
import com.luissapplication.app.modules.profile.ui.ProfileActivity
import com.luissapplication.app.modules.reportsadmin.ui.ReportsAdminActivity
import com.luissapplication.app.modules.savedadmin.ui.SavedAdminActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageAdminActivity :
    BaseActivity<ActivityHomepageAdminBinding>(R.layout.activity_homepage_admin) {
  private val viewModel: HomepageAdminVM by viewModels<HomepageAdminVM>()

  private val REQUEST_CODE_NOTIFICATIONS_ACTIVITY: Int = 709


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAssetsCard.setOnClickListener {
      val destIntent = AssetsUniactivosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnOpen.setOnClickListener {
      val destIntent = NotificationAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_NOTIFICATIONS_ACTIVITY)
    }
    binding.linearHistoricalCard.setOnClickListener {
      val destIntent = HistoricalAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCheckmark.setOnClickListener {
      val destIntent = ReportsAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAccept.setOnClickListener {
      val destIntent = SavedAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearReportsCard.setOnClickListener {
      val destIntent = ReportsAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

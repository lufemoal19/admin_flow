package com.luissapplication.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityProfileBinding
import com.luissapplication.app.modules.editaccount.ui.EditAccountActivity
import com.luissapplication.app.modules.historicaladmin.ui.HistoricalAdminActivity
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.logout.ui.LogoutActivity
import com.luissapplication.app.modules.notifications.ui.NotificationsActivity
import com.luissapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 505

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
    binding.linearNotification.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHistorical.setOnClickListener {
      val destIntent = HistoricalAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEditaccout.setOnClickListener {
      val destIntent = EditAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = EditAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogout.setOnClickListener {
      val destIntent = LogoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

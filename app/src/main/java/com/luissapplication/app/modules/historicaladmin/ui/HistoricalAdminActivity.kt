package com.luissapplication.app.modules.historicaladmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityHistoricalAdminBinding
import com.luissapplication.app.modules.historicaladmin.`data`.viewmodel.HistoricalAdminVM
import com.luissapplication.app.modules.historicalscreenadmin.ui.HistoricalScreenAdminActivity
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoricalAdminActivity :
    BaseActivity<ActivityHistoricalAdminBinding>(R.layout.activity_historical_admin) {
  private val viewModel: HistoricalAdminVM by viewModels<HistoricalAdminVM>()

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 954

  private val REQUEST_CODE_HISTORICAL_SCREEN_ADMIN_ACTIVITY: Int = 301

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.historicalAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
    binding.btnArrowleftThree.setOnClickListener {
      val destIntent = HistoricalScreenAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HISTORICAL_SCREEN_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "HISTORICAL_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HistoricalAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

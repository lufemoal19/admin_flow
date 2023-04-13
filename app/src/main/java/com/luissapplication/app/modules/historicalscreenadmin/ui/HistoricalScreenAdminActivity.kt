package com.luissapplication.app.modules.historicalscreenadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityHistoricalScreenAdminBinding
import com.luissapplication.app.modules.historicaladmin.ui.HistoricalAdminActivity
import com.luissapplication.app.modules.historicalscreenadmin.`data`.viewmodel.HistoricalScreenAdminVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoricalScreenAdminActivity :
    BaseActivity<ActivityHistoricalScreenAdminBinding>(R.layout.activity_historical_screen_admin) {
  private val viewModel: HistoricalScreenAdminVM by viewModels<HistoricalScreenAdminVM>()

  private val REQUEST_CODE_HISTORICAL_ADMIN_ACTIVITY: Int = 574


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.historicalScreenAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = HistoricalAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HISTORICAL_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "HISTORICAL_SCREEN_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HistoricalScreenAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

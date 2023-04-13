package com.luissapplication.app.modules.reportscreenadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityReportScreenAdminBinding
import com.luissapplication.app.modules.reportsadmin.ui.ReportsAdminActivity
import com.luissapplication.app.modules.reportscreenadmin.`data`.viewmodel.ReportScreenAdminVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReportScreenAdminActivity :
    BaseActivity<ActivityReportScreenAdminBinding>(R.layout.activity_report_screen_admin) {
  private val viewModel: ReportScreenAdminVM by viewModels<ReportScreenAdminVM>()

  private val REQUEST_CODE_REPORTS_ADMIN_ACTIVITY: Int = 289

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reportScreenAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = ReportsAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_REPORTS_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "REPORT_SCREEN_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReportScreenAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

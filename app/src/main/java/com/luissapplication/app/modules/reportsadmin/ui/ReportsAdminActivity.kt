package com.luissapplication.app.modules.reportsadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityReportsAdminBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.reportsadmin.`data`.viewmodel.ReportsAdminVM
import com.luissapplication.app.modules.reportscreenadmin.ui.ReportScreenAdminActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReportsAdminActivity :
    BaseActivity<ActivityReportsAdminBinding>(R.layout.activity_reports_admin) {
  private val viewModel: ReportsAdminVM by viewModels<ReportsAdminVM>()

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 372


  private val REQUEST_CODE_REPORT_SCREEN_ADMIN_ACTIVITY: Int = 461


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reportsAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
    binding.btnArrowleftTwo.setOnClickListener {
      val destIntent = ReportScreenAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_REPORT_SCREEN_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "REPORTS_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReportsAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

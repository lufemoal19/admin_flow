package com.luissapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityLoginPageBinding
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import com.luissapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvolume.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

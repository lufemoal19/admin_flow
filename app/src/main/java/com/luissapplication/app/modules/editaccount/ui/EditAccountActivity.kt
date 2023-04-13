package com.luissapplication.app.modules.editaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityEditAccountBinding
import com.luissapplication.app.modules.editaccount.`data`.viewmodel.EditAccountVM
import com.luissapplication.app.modules.profile.ui.ProfileActivity
import com.luissapplication.app.modules.savedadmin.ui.SavedAdminActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditAccountActivity : BaseActivity<ActivityEditAccountBinding>(R.layout.activity_edit_account)
    {
  private val viewModel: EditAccountVM by viewModels<EditAccountVM>()

  private val REQUEST_CODE_PROFILE_ACTIVITY: Int = 734


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PROFILE_ACTIVITY)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = SavedAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

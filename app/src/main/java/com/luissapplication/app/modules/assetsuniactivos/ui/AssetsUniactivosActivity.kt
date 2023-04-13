package com.luissapplication.app.modules.assetsuniactivos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityAssetsUniactivosBinding
import com.luissapplication.app.modules.assetinformation.ui.AssetInformationActivity
import com.luissapplication.app.modules.assetsuniactivos.`data`.viewmodel.AssetsUniactivosVM
import com.luissapplication.app.modules.homepageadmin.ui.HomepageAdminActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AssetsUniactivosActivity :
    BaseActivity<ActivityAssetsUniactivosBinding>(R.layout.activity_assets_uniactivos) {
  private val viewModel: AssetsUniactivosVM by viewModels<AssetsUniactivosVM>()

  private val REQUEST_CODE_ASSET_INFORMATION_ACTIVITY: Int = 312

  private val REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY: Int = 334

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.assetsUniactivosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnViewMore.setOnClickListener {
      val destIntent = AssetInformationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ASSET_INFORMATION_ACTIVITY)
    }
    binding.btnArrowleft.setOnClickListener {
      val destIntent = HomepageAdminActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_ADMIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ASSETS_UNIACTIVOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AssetsUniactivosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.luissapplication.app.modules.assetinformation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.luissapplication.app.R
import com.luissapplication.app.appcomponents.base.BaseActivity
import com.luissapplication.app.databinding.ActivityAssetInformationBinding
import com.luissapplication.app.modules.assetinformation.`data`.viewmodel.AssetInformationVM
import com.luissapplication.app.modules.assetsuniactivos.ui.AssetsUniactivosActivity
import kotlin.String
import kotlin.Unit

class AssetInformationActivity :
    BaseActivity<ActivityAssetInformationBinding>(R.layout.activity_asset_information) {
  private val viewModel: AssetInformationVM by viewModels<AssetInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.assetInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = AssetsUniactivosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ASSET_INFORMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AssetInformationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.aayushsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.base.BaseActivity
import com.aayushsapplication.app.databinding.ActivityAppNavigationBinding
import com.aayushsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.aayushsapplication.app.modules.signupemail.ui.SignUpEmailActivity
import com.aayushsapplication.app.modules.splashpage.ui.SplashPageActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSignUpEmail.setOnClickListener {
      val destIntent = SignUpEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashPage.setOnClickListener {
      val destIntent = SplashPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}

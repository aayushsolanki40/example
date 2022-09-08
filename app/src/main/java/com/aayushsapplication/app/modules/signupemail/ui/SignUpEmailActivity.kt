package com.aayushsapplication.app.modules.signupemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.base.BaseActivity
import com.aayushsapplication.app.databinding.ActivitySignUpEmailBinding
import com.aayushsapplication.app.modules.signupemail.`data`.viewmodel.SignUpEmailVM
import com.aayushsapplication.app.modules.splashpage.ui.SplashPageActivity
import kotlin.String
import kotlin.Unit

class SignUpEmailActivity :
    BaseActivity<ActivitySignUpEmailBinding>(R.layout.activity_sign_up_email) {
  private val viewModel: SignUpEmailVM by viewModels<SignUpEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogo.setOnClickListener {
      val destIntent = SplashPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      val destIntent = SplashPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

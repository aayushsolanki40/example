package com.aayushsapplication.app.modules.splashpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.base.BaseActivity
import com.aayushsapplication.app.appcomponents.facebookauth.FacebookHelper
import com.aayushsapplication.app.databinding.ActivitySplashPageBinding
import com.aayushsapplication.app.modules.signupemail.ui.SignUpEmailActivity
import com.aayushsapplication.app.modules.splashpage.`data`.viewmodel.SplashPageVM
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SplashPageActivity : BaseActivity<ActivitySplashPageBinding>(R.layout.activity_splash_page) {
  private val viewModel: SplashPageVM by viewModels<SplashPageVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFacebook.setOnClickListener {
      LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
      facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
        override fun onSuccess(result: LoginResult?) {
        }
        override fun onError(error: FacebookException?) {
        }
        override fun onCancel() {
        }
        })
      }
      binding.btnSignUp.setOnClickListener {
        val destIntent = SignUpEmailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SPLASH_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SplashPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

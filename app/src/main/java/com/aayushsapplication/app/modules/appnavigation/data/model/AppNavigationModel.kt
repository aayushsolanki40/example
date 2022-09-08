package com.aayushsapplication.app.modules.appnavigation.`data`.model

import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up_email)

)

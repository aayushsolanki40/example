package com.aayushsapplication.app.modules.splashpage.`data`.model

import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)

)

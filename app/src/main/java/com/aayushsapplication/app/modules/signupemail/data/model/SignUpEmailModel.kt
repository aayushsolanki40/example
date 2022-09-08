package com.aayushsapplication.app.modules.signupemail.`data`.model

import com.aayushsapplication.app.R
import com.aayushsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeLets: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_let_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai)

)

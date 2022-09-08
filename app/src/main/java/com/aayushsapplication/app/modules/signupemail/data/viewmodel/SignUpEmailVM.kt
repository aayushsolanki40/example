package com.aayushsapplication.app.modules.signupemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aayushsapplication.app.modules.signupemail.`data`.model.SignUpEmailModel
import org.koin.core.KoinComponent

class SignUpEmailVM : ViewModel(), KoinComponent {
  val signUpEmailModel: MutableLiveData<SignUpEmailModel> = MutableLiveData(SignUpEmailModel())

  var navArguments: Bundle? = null
}

package com.aayushsapplication.app.modules.splashpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aayushsapplication.app.modules.splashpage.`data`.model.SplashPageModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SplashPageVM : ViewModel(), KoinComponent {
  val splashPageModel: MutableLiveData<SplashPageModel> = MutableLiveData(SplashPageModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()
}

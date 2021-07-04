package com.chaithanya.bookmyshow.views.initialScreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.chaithanya.bookmyshow.MainActivity
import com.chaithanya.bookmyshow.databinding.ActivitySplashScreenBinding
import com.chaithanya.bookmyshow.helper.KEY_USER_LOGGED_IN
import com.chaithanya.bookmyshow.helper.PreferenceHelper
import com.chaithanya.bookmyshow.helper.USER_LOGGED_IN
import java.util.*

class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding:ActivitySplashScreenBinding

    lateinit var locale: Locale

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        PreferenceHelper.getSharedPreferences(this)

        val lang = PreferenceHelper.getStringFromPreference("languagePreferenceString")
        if (lang != null) {
            setLocal(lang)
        }

        val flag = PreferenceHelper.getBooleanFromPreference("languageSelected")

        Handler().postDelayed(Runnable {
            if (flag) {
                val intent = Intent(this, LanguageSelectionActivity::class.java)
                startActivity(intent)
            } else {
                if (PreferenceHelper.getLoginBooleanFromPreference(USER_LOGGED_IN)){
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
        }, 1000)

    }

    private fun setLocal(localeName: String) {

        locale = Locale(localeName)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)
    }
}
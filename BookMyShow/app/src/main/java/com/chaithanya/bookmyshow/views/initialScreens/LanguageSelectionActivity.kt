package com.chaithanya.bookmyshow.views.initialScreens

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chaithanya.bookmyshow.MainActivity
import com.chaithanya.bookmyshow.R
import com.chaithanya.bookmyshow.databinding.ActivityLanguageSelectionBinding
import com.chaithanya.bookmyshow.helper.KEY_USER_LOGGED_IN
import com.chaithanya.bookmyshow.helper.PreferenceHelper
import com.chaithanya.bookmyshow.helper.USER_LOGGED_IN
import java.util.*

class LanguageSelectionActivity : AppCompatActivity() {

    lateinit var binding: ActivityLanguageSelectionBinding

    lateinit var locale: Locale

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanguageSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        PreferenceHelper.getSharedPreferences(this)

        binding.btnGetStarted.setOnClickListener {
            if (PreferenceHelper.getLoginBooleanFromPreference(USER_LOGGED_IN)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }

    }

    fun onRBClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.id) {
                R.id.rbEnglish ->
                    if (checked) {
                        setLocal("en")
                        Toast.makeText(this, "english", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbHindi ->
                    if (checked) {
                        setLocal("hi")
                        Toast.makeText(this, "hindi", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbTamil ->
                    if (checked) {
                        setLocal("ta")
                        Toast.makeText(this, "tamil", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbTelugu ->
                    if (checked) {
                        setLocal("te")
                        Toast.makeText(this, "telugu", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbMalayalam ->
                    if (checked) {
                        setLocal("ml")
                        Toast.makeText(this, "malayalam", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbMarathi ->
                    if (checked) {
                        setLocal("mr")
                        Toast.makeText(this, "marathi", Toast.LENGTH_SHORT).show()
                    }
                R.id.rbKannada ->
                    if (checked) {
                        setLocal("kn")
                        Toast.makeText(this, "kannada", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }

    private fun setLocal(localeName: String) {

        locale = Locale(localeName)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)

        PreferenceHelper.writeStringToPreference("languagePreference", localeName)
        PreferenceHelper.writeBooleanToPreference("languageSelected", false)
    }
}
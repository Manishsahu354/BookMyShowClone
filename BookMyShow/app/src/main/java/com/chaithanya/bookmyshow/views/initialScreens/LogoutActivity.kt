package com.chaithanya.bookmyshow.views.initialScreens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chaithanya.bookmyshow.databinding.ActivityLogoutBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.firebase.auth.FirebaseAuth

class LogoutActivity : AppCompatActivity() {

    lateinit var binding: ActivityLogoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            val signInAccount = GoogleSignIn.getLastSignedInAccount(this@LogoutActivity)
            if (signInAccount != null) {
                tvName.text = signInAccount.displayName.toString()
                tvEmail.text = signInAccount.email.toString()
            }
        }

        binding.btnLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}
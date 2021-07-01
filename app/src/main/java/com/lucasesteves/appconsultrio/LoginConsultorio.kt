package com.lucasesteves.appconsultrio
import android.util.Log
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.app.Activity
import com.lucasesteves.appconsultrio.databinding.ActivityLoginConsultorioBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth



class LoginConsultorio : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginConsultorioBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginConsultorioBinding.inflate(layoutInflater)
        setContentView(binding.root)






        }
    }





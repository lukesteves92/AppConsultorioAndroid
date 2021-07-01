package com.lucasesteves.appconsultrio

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient
import com.lucasesteves.appconsultrio.databinding.ActivityLoginConsultorioBinding


class LoginConsultorio : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginConsultorioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginConsultorioBinding.inflate(layoutInflater)
        setContentView(binding.root)





        }
    }



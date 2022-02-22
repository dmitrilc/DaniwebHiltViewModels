package com.codelab.daniwebhiltviewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toFragment1Button = findViewById<Button>(R.id.button_toFragment1)
        val toFragment2Button = findViewById<Button>(R.id.button_toFragment2)
        val toFragment3Button = findViewById<Button>(R.id.button_toFragment3)

        toFragment1Button.setOnClickListener{
            supportFragmentManager.commit {
                replace<BlankFragment1>(R.id.fragmentContainerView)
            }
        }

        toFragment2Button.setOnClickListener {
            supportFragmentManager.commit {
                replace<BlankFragment2>(R.id.fragmentContainerView)
            }
        }

        toFragment3Button.setOnClickListener {
            supportFragmentManager.commit {
                replace<BlankFragment3>(R.id.fragmentContainerView)
            }
        }

    }
}
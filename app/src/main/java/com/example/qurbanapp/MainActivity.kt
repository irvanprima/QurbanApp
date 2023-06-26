package com.example.qurbanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.qurbanapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var fstore:FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmitUser.setOnClickListener {
            setContentView(R.layout.activity_main_user)
        }

        binding.btnSubmitAdmin.setOnClickListener {
            setContentView(R.layout.activity_main_admin)
        }
//        fstore = FirebaseFirestore.getInstance();
//        adminsignin.setOnClickListener(this);
    }

//    login.button.setOnClickListener{
//        auth.signInWithEmailAndPassword(
//            email_edit_text.text:toString(),
//            password_edit_text.text.toString(
//            ).addOnCompleteListener(this)
//    }

//    override fun onComplete(task:Task<AuthResult>) {
//        if(task.isSuccessful) {
//            MainActivity.newInstance(this).let(::startActivity)
//            finish()
//        }else{
//            Toast.makeText(
//                baseContext,
//                "Authentication failed.",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//    }
}
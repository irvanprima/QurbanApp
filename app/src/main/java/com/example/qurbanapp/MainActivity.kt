package com.example.qurbanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var fstore:FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fstore = FirebaseFirestore.getInstance();
        adminsignin.setOnClickListener(this);
    }

    login.button.setOnClickListener{
        auth.signInWithEmailAndPassword(
            email_edit_text.text:toString(),
            password_edit_text.text.toString(
            ).addOnCompleteListener(this)
    }

    override fun onComplete(task:Task<AuthResult>) {
        if(task.isSuccessful) {
            MainActivity.newInstance(this).let(::startActivity)
            finish()
        }else{
            Toast.makeText(
                baseContext,
                "Authentication failed.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
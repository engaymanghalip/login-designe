package aym.pro.retrofit_recyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import aym.pro.retrofit_recyclerview.R

class MainActivity : AppCompatActivity() {

    val userName:String = "ayman"
    val password:String = "ayman1234"

    lateinit var edt_userName:EditText
    lateinit var edt_password:EditText
    lateinit var btn_login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_userName = findViewById(R.id.edt_username)
        edt_password = findViewById(R.id.edt_password)
        btn_login = findViewById(R.id.btn_login)

//        btn_login.setOnClickListener(this)
        btn_login.setOnClickListener {

            if(!edt_userName.text.toString().isNullOrEmpty()  && !edt_password.text.toString().isNullOrEmpty()){
                if(edt_userName.text.toString().equals(userName) && edt_password.text.toString().equals(password)){

                    var intent:Intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("UserName",edt_userName.text.toString())
                    startActivity(intent)

                    Toast.makeText(this,"lOGIN suceessfully",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"lOGIN Failed",Toast.LENGTH_LONG).show()
                }
            }


                }
    }

//    override fun onClick(v: View?) {
//
//        when(v!!.id) {
//            R.id.btn_login -> {
//                Toast.makeText(this,"lOGIN Clicked",Toast.LENGTH_LONG).show()
//            }
//        }
//    }

//    fun onClickLogin(view: View) {
//        Toast.makeText(this,"lOGIN Clicked",Toast.LENGTH_LONG).show()
//    }
}
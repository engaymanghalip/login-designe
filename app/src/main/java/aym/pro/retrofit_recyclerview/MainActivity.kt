package aym.pro.retrofit_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var edt_userName:EditText
    lateinit var edt_password:EditText
    lateinit var btn_login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_userName = findViewById(R.id.edt_username)
        edt_password = findViewById(R.id.edt_password)
        btn_login = findViewById(R.id.btn_login)

    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"lOGIN Clicked",Toast.LENGTH_LONG).show()
    }

//    fun onClickLogin(view: View) {
//        Toast.makeText(this,"lOGIN Clicked",Toast.LENGTH_LONG).show()
//    }
}
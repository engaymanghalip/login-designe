package aym.pro.retrofit_recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import aym.pro.retrofit_recyclerview.R
import aym.pro.retrofit_recyclerview.model.User
import aym.pro.retrofit_recyclerview.ui.adapter.UserRecyclerView
import aym.pro.retrofit_recyclerview.ui.adapter.onListItemClicked

class MainActivity2 : AppCompatActivity(), onListItemClicked {

    lateinit var rv_showData:RecyclerView
    lateinit var edt_message:EditText
    lateinit var btn_add:Button

    var userList:ArrayList<User> = ArrayList()

    var userName:String?=null

    val userRecyclerView:UserRecyclerView by lazy{ UserRecyclerView()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
if(intent != null){
    userName = intent.extras!!.get("UserName").toString()
    Toast.makeText(this,"UserName is: $userName", Toast.LENGTH_LONG).show()

}
        rv_showData=findViewById(R.id.rv_showData)
        edt_message=findViewById(R.id.edt_task)
        btn_add=findViewById(R.id.btn_add)

        rv_showData.adapter = userRecyclerView

        btn_add.setOnClickListener{
            userList.add(User(userName.toString(),edt_message.text.toString(),R.drawable.userlogin))

            userRecyclerView.setList(userList)
            edt_message.setText("")
        }

        userRecyclerView.onListItemClick = this

}

    override fun onItemClick(user: User) {
        Toast.makeText(this,"The UserName is: ${user.name}\n" +
                " The text is: ${user.message}",Toast.LENGTH_LONG).show()
    }
}
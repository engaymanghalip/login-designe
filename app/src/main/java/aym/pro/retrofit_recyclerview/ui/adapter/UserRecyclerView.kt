package aym.pro.retrofit_recyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import aym.pro.retrofit_recyclerview.R
import aym.pro.retrofit_recyclerview.model.User

class UserRecyclerView: RecyclerView.Adapter<UserRecyclerView.UserViewHolder>() {

    var onListItemClick: onListItemClicked?= null

    var userList:ArrayList<User> = ArrayList()

    fun setList(userList: ArrayList<User>){
        this.userList = userList
        notifyDataSetChanged()
    }

  inner  class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_userImage:ImageView = itemView.findViewById(R.id.iv_item_userImage)
        var tv_userName:TextView = itemView.findViewById(R.id.tv_item_userName)
        var tv_message:TextView = itemView.findViewById(R.id.tv_item_task)

        fun bind(user: User){
            iv_userImage.setImageResource(user.imageId)
            tv_userName.text=user.name
            tv_message.text=user.message

            itemView.setOnClickListener{
                    onListItemClick?.onItemClick(user)
            }
     }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var user:User = userList.get(position)
        holder.bind(user)
    }

    override fun getItemCount(): Int {
     return   userList.size
    }
}
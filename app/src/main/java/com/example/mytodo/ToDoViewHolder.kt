package com.example.mytodo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytodo.models.ToDo

class ToDoViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(Todo: ToDo){
        itemView.findViewById<TextView>(R.id.todo_title).setText(Todo.title)
        itemView.findViewById<TextView>(R.id.todo_description).setText(Todo.description)
    }
}
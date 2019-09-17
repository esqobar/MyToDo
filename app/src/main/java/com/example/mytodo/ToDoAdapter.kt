package com.example.mytodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.example.mytodo.models.ToDo as ToDo

class ToDoAdapter : androidx.recyclerview.widget.ListAdapter<ToDo, ToDoViewHolder>(object :  DiffUtil.ItemCallback<ToDo>(){
    override fun areItemsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
        return  true
    }

    override fun areContentsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
        return true
    }

}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_todo_list_item, parent, false)
        return ToDoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}


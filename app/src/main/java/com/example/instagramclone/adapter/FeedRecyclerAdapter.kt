package com.example.instagramclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.instagramclone.databinding.RecycleRowBinding
import com.example.instagramclone.model.Post

class FeedRecyclerAdapter(private  val postlist:ArrayList<Post>): Adapter<FeedRecyclerAdapter.PostHolder>() {

class PostHolder (val binding:RecycleRowBinding) : ViewHolder(binding.root){

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
      val   binding=RecycleRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
holder.binding.reycleemail.text=postlist.get(position).email
        holder.binding.recyclecomment.text=postlist.get(position).comment
        holder.binding.recyclerimage.setImageURI(postlist.get(position).downloadurl.toUri())
    }

    override fun getItemCount(): Int {
        return postlist.size
    }
}
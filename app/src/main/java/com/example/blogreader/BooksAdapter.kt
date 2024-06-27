package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter (var postList: List<Books>): RecyclerView.Adapter<ArtistViewHolder(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.artist_list,parent,false)
        return ArtistViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val post = postList[position]
        holder.tvAuthor.text = post.author
        holder.tvDate.text= post.date
        holder.tvTitle.text= post.title
        holder.tvPreview.text= post.articlePreview
        holder.tvLink.text= post.link


    }

    override fun getItemCount(): Int {
       return postList.size
    }
}
class ArtistViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvprofile)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvBookName)
    var tvDate = itemView.findViewById<TextView>(R.id.tvName)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
}
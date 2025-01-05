package com.example.spotify

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtistAdapter(private val artistList: List<String>) :
    RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder?>() {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.artist_item, parent, false)
        return ArtistViewHolder(view)
    }

    fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        holder.artistName.text = artistList[position]
        // Placeholder image can be set dynamically if required
        holder.artistImage.setImageResource(R.drawable.ic_placeholder)
    }

    val itemCount: Int
        get() = artistList.size

    class ArtistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var artistName: TextView = itemView.findViewById(R.id.artist_name)
        var artistImage: ImageView = itemView.findViewById(R.id.artist_image)
    }
}

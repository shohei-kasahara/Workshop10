package io.github.shohei.workshop10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: ArrayList<MovieDataModel>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val moviePoster: ImageView = itemView.findViewById(R.id.ivPoster)
        val movieName: TextView = itemView.findViewById(R.id.tvName)
        val movieYear : TextView = itemView.findViewById(R.id.tvYear)


    }
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        p0: MovieViewHolder,
        p1: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }




}
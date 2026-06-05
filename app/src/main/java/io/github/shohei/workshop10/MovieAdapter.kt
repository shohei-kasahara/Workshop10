package io.github.shohei.workshop10

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.core.util.Pools
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: ArrayList<MovieDataModel>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ivPoster: ImageView = itemView.findViewById(R.id.ivPoster)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvYear : TextView = itemView.findViewById(R.id.tvYear)


    }
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent,false)
        return MovieViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.tvName.text = movie.name
        holder.ivPoster.setImageResource(movie.poster)
        holder.tvYear.text = movie.year.toString()

        holder.itemView.setOnClickListener {
            //Toast.makeText(it.context,"You clicked on ${movie.name}", Toast.LENGTH_LONG).show()

            val i = Intent(it.context, DetailActivity::class.java)
            i.putExtra("MOVIE", movie)
            it.context.startActivity(i)
        }



    }


}
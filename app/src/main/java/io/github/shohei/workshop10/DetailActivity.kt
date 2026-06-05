package io.github.shohei.workshop10

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivPoster = findViewById<ImageView>(R.id.ivPoster)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvYear = findViewById<TextView>(R.id.tvYear)

        val movie : MovieDataModel?

        @Suppress("DEPRECATION")
        movie = intent.getParcelableExtra("MOVIE")

        if (movie != null) {
            ivPoster.setImageResource(movie.poster)
            tvName.text = movie.name
            tvYear.text = "Published Year: ${movie.year.toString()}"
        }



        val btnGoBack = findViewById<Button>(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            finish()
        }
    }
}
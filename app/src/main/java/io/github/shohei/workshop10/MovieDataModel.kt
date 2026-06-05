package io.github.shohei.workshop10
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieDataModel(
    val name: String,
    val poster: Int,
    val year: Int
) : Parcelable

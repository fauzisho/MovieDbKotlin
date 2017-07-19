package com.uzi.moviedbkotlin.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
data class Movie(val overview: String? = null,
                 @SerializedName("original_language")
                 val originalLanguage: String? = null,
                 @SerializedName("original_title")
                 val originalTitle: String? = null,
                 val video: Boolean? = null,
                 val title: String? = null,
                 @SerializedName("poster_path")
                 val posterPath: String? = null,
                 @SerializedName("backdrop_path")
                 val backdropPath: String? = null,
                 @SerializedName("release_date")
                 val releaseDate: String? = null,
                 @SerializedName("vote_average")
                 val voteAverage: Double? = null,
                 val popularity: Double? = null,
                 val id: Int? = null,
                 val adult: Boolean? = null,
                 @SerializedName("vote_count")
                 val voteCount: Int? = null) {
    val imdbPosterPath: String
        get() = "http://image.tmdb.org/t/p/w342/$posterPath"
}
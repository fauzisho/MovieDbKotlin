package com.uzi.moviedbkotlin.data.model

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
data class PopularMovieResponse(
        val total_results: Int,
        val total_pages: Int,
        val results: List<Movie>
)
package com.uzi.moviedbkotlin.data


/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
object TheMovieDBApi {
    val THEMOVIEDB_API: String = "https://api.themoviedb.org/3/"
    val THEMOVIEDB_KEY: String = "0330bdb6511e406804265feac315a286"

    fun getPopularMovie(page: Int): String {
        return THEMOVIEDB_API + "movie/popular" + "?api_key=$THEMOVIEDB_KEY" + "&page=$page"
    }
}


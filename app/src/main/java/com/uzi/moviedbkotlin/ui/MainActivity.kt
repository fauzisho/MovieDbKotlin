package com.uzi.moviedbkotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import com.google.gson.Gson
import com.uzi.moviedbkotlin.R
import com.uzi.moviedbkotlin.data.MovieRepository
import com.uzi.moviedbkotlin.data.model.Movie
import com.uzi.moviedbkotlin.util.InfiniteScrollListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var adapter: MainAdapter
    lateinit var presenter: MainPresenter
    private var movies: MutableList<Movie> = mutableListOf()
    private var page: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MainAdapter(this, movies)

        val gridLayout = GridLayoutManager(this, 2)
        recyclerView.layoutManager = gridLayout
        recyclerView.adapter = adapter
        recyclerView.addOnScrollListener(
                InfiniteScrollListener(
                        {
                            page++
                            presenter.getFavMovie(page)
                        },
                        gridLayout)
        )

        val request = MovieRepository()
        val gson = Gson()
        presenter = MainPresenter(this, request, gson)
        presenter.getFavMovie(page)
    }

    override fun showLoading() {
    }

    override fun displayResult(result: List<Movie>) {
        movies.addAll(result)
        adapter.notifyDataSetChanged()
        result.map {
            Log.d("tag", "result ${it.title} ${it.posterPath}")
        }
    }

    override fun hideLoading() {

    }

}

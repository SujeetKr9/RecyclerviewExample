package com.techcrevices.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<MovieModel> movieModels = new ArrayList<>();
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OK


        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        prepareMovieData();

        movieAdapter = new MovieAdapter(movieModels);
        recyclerView.setAdapter(movieAdapter);

    }

    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieModels.add(movie);

        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieModels.add(movie);

        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieModels.add(movie);

        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieModels.add(movie);

        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieModels.add(movie);

        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieModels.add(movie);

        movie = new MovieModel("Up", "Animation", "2009");
        movieModels.add(movie);

        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieModels.add(movie);

        movie = new MovieModel("The LEGO Movie", "Animation", "2014");
        movieModels.add(movie);

        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieModels.add(movie);

        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieModels.add(movie);

        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieModels.add(movie);

        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieModels.add(movie);

        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieModels.add(movie);

        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieModels.add(movie);

        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieModels.add(movie);

       // mAdapter.notifyDataSetChanged();
    }
}

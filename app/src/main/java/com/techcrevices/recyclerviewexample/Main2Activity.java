package com.techcrevices.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<MovieModel> movieModelsList = new ArrayList<>();
    MovieModel movieModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String s = getIntent().getStringExtra("listitem");

        int d = Integer.parseInt(getIntent().getStringExtra("position"));

        Log.e("Position",String.valueOf(d));
        Log.e("Position2",s);

        Gson gson = new Gson();

        Type listType = new TypeToken<List<MovieModel>>(){}.getType();
        movieModelsList = gson.fromJson(s, listType);

        Log.e("Position3",String.valueOf(movieModelsList));


        movieModel = movieModelsList.get(d);
        Toast.makeText(Main2Activity.this, "" + movieModel.getMovieYear(), Toast.LENGTH_LONG).show();

    }
}
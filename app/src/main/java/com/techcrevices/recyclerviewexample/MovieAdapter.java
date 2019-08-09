package com.techcrevices.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<MovieModel> movieModels;
    public MovieAdapter(List<MovieModel> movieModels) {
        this.movieModels = movieModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MovieModel model = movieModels.get(position);
        holder.movieTitle.setText(model.getMovieName());
        holder.movieType.setText(model.getMovieType());
        holder.movieYear.setText(model.getMovieYear());

    }

    @Override
    public int getItemCount() {
        return movieModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView movieTitle, movieType, movieYear;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            movieTitle = (TextView)itemView.findViewById(R.id.movieNameTV);
            movieType = (TextView)itemView.findViewById(R.id.movieType);
            movieYear = (TextView)itemView.findViewById(R.id.movieYear);


        }
    }
}

package com.example.m213_tp_13_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private List<Movie> movies;

    // Constructor to initialize the movie list
    public MovieAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    // Create the view holder for the movie item
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new ViewHolder(view);
    }

    // Bind the data to the view holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.bind(movie);
    }

    // Return the number of movies in the list
    @Override
    public int getItemCount() {
        return movies.size();
    }

    // ViewHolder class to hold the views
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.textView3);
            imageView = itemView.findViewById(R.id.imageView3);
        }

        public void bind(Movie m) {
            titleTextView.setText(m.getName());
            Picasso.get().load(m.getImage()).into(imageView);
        }
    }
}

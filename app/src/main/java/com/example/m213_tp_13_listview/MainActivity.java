package com.example.m213_tp_13_listview;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler);


        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1002,"Fast and Furius","https://media.gq.com/photos/58ee5612eb11fb4e6bf49344/3:2/w_1944,h_1296,c_limit/fast-and-furious-future.jpg"));
        movies.add(new Movie(1001,"Ninja Turtels","https://lumiere-a.akamaihd.net/v1/images/image_b3c7d632.jpeg"));
        movies.add(new Movie(1003,"Into the Wild","https://assets.mubicdn.net/images/film/340/image-w856.jpg"));

        // Set the layout manager (e.g., LinearLayoutManager)
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        MovieAdapter ma = new MovieAdapter(movies);
        recyclerView.setAdapter(ma);





    }
}
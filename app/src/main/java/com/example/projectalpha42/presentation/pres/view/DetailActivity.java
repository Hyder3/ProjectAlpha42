package com.example.projectalpha42.presentation.pres.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectalpha42.R;
import com.example.projectalpha42.Singletons;
import com.example.projectalpha42.presentation.pres.controller.MainController;
import com.example.projectalpha42.presentation.pres.model.Pokemon;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private TextView textDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        textDetail = findViewById(R.id.detail_txt);
        Intent intent = getIntent();
        String pokemonJson = intent.getStringExtra("pokemonKey");
        Pokemon pokemon = Singletons.getGson().fromJson(pokemonJson,Pokemon.class);
        showDetail(pokemon);
    }

    private void showDetail(Pokemon pokemon){
        textDetail.setText(pokemon.getName());
        textDetail.setText(pokemon.getUrl());
        //
    }

}

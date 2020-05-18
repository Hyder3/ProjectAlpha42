package com.example.projectalpha42;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.projectalpha42.data.PokeAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Singletons {

    private static Gson gsonInstance;
    private static PokeAPI pokeAPiInstance;
    private static SharedPreferences sharedPreferencesInstance;

    public static Gson getGson(){
        if(gsonInstance == null){
            gsonInstance = new GsonBuilder()
                    .setLenient()
                    .create();
        }
        return gsonInstance;
    }

    public static PokeAPI getPokeAPI(){
        if(pokeAPiInstance == null){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(getGson()))
                    .build();

            pokeAPiInstance = retrofit.create(PokeAPI.class);
        }
        return pokeAPiInstance;
    }

    public static SharedPreferences getSharedPreferences(Context context){
        if(sharedPreferencesInstance == null){
            sharedPreferencesInstance= context.getSharedPreferences("alpha", Context.MODE_PRIVATE);
        }
        return sharedPreferencesInstance;
    }
}

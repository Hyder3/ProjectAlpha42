package com.example.projectalpha42.data;

import com.example.projectalpha42.presentation.pres.model.RestPokemonResponse;
import com.example.projectalpha42.presentation.pres.model.RestStatsResponse;
import com.example.projectalpha42.presentation.pres.model.RestTypesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeAPI {

    @GET("/api/v2/pokemon")
    Call<RestPokemonResponse> getPokemonResponse();

    @GET("/api/v2/type")
    Call<RestTypesResponse> getTypesResponse();

    @GET("/api/v2/stat")
    Call<RestStatsResponse> getStatsResponse();


}

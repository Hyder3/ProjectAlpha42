package com.example.projectalpha42;

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

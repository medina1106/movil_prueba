package com.medina.poyecto_citriapp.Interfaces;

import com.medina.poyecto_citriapp.Model.Pojo_Get_Cultivos;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api_Post_Cultivos {

    @FormUrlEncoded

    @POST("registercultiveapi")
    Call<Pojo_Get_Cultivos> PostCultivos(  @Field("name_cultive")String name_cultive, @Field("citrico_id") String citrico_id,  @Field("start_production") String start_production, @Field("finca_id") String finca_id);

}


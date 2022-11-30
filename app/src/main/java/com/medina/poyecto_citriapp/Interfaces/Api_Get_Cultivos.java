package com.medina.poyecto_citriapp.Interfaces;

import com.medina.poyecto_citriapp.Model.CultivosRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api_Get_Cultivos
{
 @GET("getcultive")
 Call<CultivosRespuesta> getCultivos(@Query("limit") int limit, @Query("offset") int offset);
}

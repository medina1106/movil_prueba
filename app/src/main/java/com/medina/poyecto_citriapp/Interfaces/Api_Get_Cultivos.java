package com.medina.poyecto_citriapp.Interfaces;

import com.medina.poyecto_citriapp.Model.Pojo_Get_Cultivos;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_Get_Cultivos
{
 @GET("getcultive")
    Call<Pojo_Get_Cultivos> getCultivos();
}

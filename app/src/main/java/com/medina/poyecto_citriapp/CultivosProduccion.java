package com.medina.poyecto_citriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.medina.poyecto_citriapp.Interfaces.Api_Get_Cultivos;
import com.medina.poyecto_citriapp.Model.DatosCultivo;
import com.medina.poyecto_citriapp.Model.Pojo_Get_Cultivos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CultivosProduccion extends AppCompatActivity  implements View.OnClickListener {

    ListView ltvCultivos;
    private static final String TAG = "POKEDEX";
    Adaptador adaptador;
    List<DatosCultivo> list =new ArrayList<DatosCultivo>();
    ArrayAdapter<DatosCultivo> arrayAdapterCultivo;


    int ya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivos_produccion);

        getCultivos();
    }

    private void getCultivos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://proyecto-citriapp.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api_Get_Cultivos cultivos =retrofit.create(Api_Get_Cultivos.class);
        cultivos.getCultivos().enqueue(new Callback<Pojo_Get_Cultivos>() {
            @Override
            public void onResponse(Call<Pojo_Get_Cultivos> call, Response<Pojo_Get_Cultivos> response) {
                 if (response.isSuccessful()){
                     Pojo_Get_Cultivos pojo_get_cultivos  = response.body();
                     List<DatosCultivo> datosCultivos = pojo_get_cultivos.getCultivos();



                     ltvCultivos = findViewById(R.id.ltvCultivos);
                      arrayAdapterCultivo = new ArrayAdapter(CultivosProduccion.this, android.R.layout.simple_list_item_1,list);

                      adaptador = new Adaptador(CultivosProduccion.this,list);

                      ltvCultivos.setAdapter(adaptador);
                 }else {
                     Log.e(TAG, "onResponse: " + response.errorBody());
                 }
            }

            @Override
            public void onFailure(Call<Pojo_Get_Cultivos> call, Throwable t) {
                Log.e(TAG, "onFailure: " +t.getMessage());

            }
        });
    }


    @Override
    public void onClick(View v) {


    }



    }

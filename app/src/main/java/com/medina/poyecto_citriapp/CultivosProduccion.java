package com.medina.poyecto_citriapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.medina.poyecto_citriapp.Interfaces.Api_Get_Cultivos;
import com.medina.poyecto_citriapp.Model.CultivosRespuesta;
import com.medina.poyecto_citriapp.Model.DatosCultivo;
import com.medina.poyecto_citriapp.Model.Pojo_Get_Cultivos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CultivosProduccion extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "nuuu";


    private Retrofit retrofit;

    private RecyclerView recyclerView;
    private Adaptador adaptador;

    private int offset;
    private boolean aptoParaCargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivos_produccion);

        recyclerView = findViewById(R.id.rcyclerView);
        adaptador = new Adaptador(CultivosProduccion.this);
        recyclerView. setAdapter(adaptador);
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, " Llegamos al final.");

                            aptoParaCargar = false;
                            offset += 20;
                            obtenerDatos(offset);
                        }
                    }
                }
            }


        });

        retrofit = new Retrofit.Builder()
                .baseUrl("http://proyecto-citriapp.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        aptoParaCargar = true;
        offset = 0;
        obtenerDatos(offset);

    }
    private void obtenerDatos(int offset) {

        Api_Get_Cultivos service = retrofit.create(Api_Get_Cultivos.class);
        Call<CultivosRespuesta> cultivosRespuestaCall = service.getCultivos(20,offset);

        cultivosRespuestaCall.enqueue(new Callback<CultivosRespuesta>() {
            @Override
            public void onResponse(Call<CultivosRespuesta> call, Response<CultivosRespuesta> response) {
                aptoParaCargar = true;
                if (response.isSuccessful()) {
                    CultivosRespuesta cultivosRespuesta = response.body();
                    ArrayList<Pojo_Get_Cultivos> listaCultivo = cultivosRespuesta.getResults();

                        adaptador.adicionarListaCultivo(listaCultivo);
                } else {
                    Log.e(TAG, " onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<CultivosRespuesta> call, Throwable t) {
                aptoParaCargar = true;
                Log.e(TAG, " onFailure: " + t.getMessage());
            }
        });

    }


    @Override
    public void onClick(View v) {


    }


}

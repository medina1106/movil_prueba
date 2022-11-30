package com.medina.poyecto_citriapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medina.poyecto_citriapp.Model.DatosCultivo;
import com.medina.poyecto_citriapp.Model.Pojo_Get_Cultivos;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private ArrayList<Pojo_Get_Cultivos> dataset;
    private Context context;

    public Adaptador(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaCultivo(ArrayList<Pojo_Get_Cultivos> listaCultivo) {
        dataset.addAll(listaCultivo);
        notifyDataSetChanged();
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txttitulo;
        TextView txtFec;
        TextView txtLugar;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txttitulo = itemView.findViewById(R.id.txttitulo);
            txtFec = itemView.findViewById(R.id.txtFec);
            txtLugar = itemView.findViewById(R.id.txtLugar);


        }



    }
}

package com.medina.poyecto_citriapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.medina.poyecto_citriapp.AgregarCultivo;
import com.medina.poyecto_citriapp.CultivosProduccion;
import com.medina.poyecto_citriapp.Model.DatosCultivo;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter
{
     private Context context;
    private List<DatosCultivo> list;


     public Adaptador (Context context , List<DatosCultivo> list){
         this.context=context;
         this.list=list;
     }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View root = View.inflate(context,R.layout.activity_list,null);

        TextView txttitulo = (TextView) root.findViewById(R.id.txttitulo);
        TextView txtFec = (TextView)  root.findViewById(R.id.txtFec);
        TextView txtLugar = (TextView) root.findViewById(R.id.txtLugar);

        txttitulo.setText(list.get(position).getName_cultive());
        txtFec.setText(list.get(position).getStart_production());
        txtLugar.setText(list.get(position).getFinca_id());

        return root;
    }
}

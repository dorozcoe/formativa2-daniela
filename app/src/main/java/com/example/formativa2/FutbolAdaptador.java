package com.example.formativa2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FutbolAdaptador extends RecyclerView.Adapter<FutbolAdaptador.ViewHolder> {

    private Context context;
    private List<Elemento> lista;

    public FutbolAdaptador(Context context, List<Elemento> lista) {
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.fila_futbol, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Elemento e = lista.get(position);

        holder.txtNombre.setText(e.getNombre());
        holder.txtCategoria.setText(e.getCategoria());
        holder.txtInfo.setText(e.getInfo());
        holder.imgFoto.setImageResource(e.getFoto());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView txtNombre, txtCategoria, txtInfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtCategoria = itemView.findViewById(R.id.txtCategoria);
            txtInfo = itemView.findViewById(R.id.txtInfo);
        }
    }
}
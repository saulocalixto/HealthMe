package com.example.android.imc;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class dadosUsuariosHolder extends RecyclerView.ViewHolder {

    public TextView nomeUsuario;
    public ImageButton btnEditar;
    public ImageButton btnExcluir;

    public dadosUsuariosHolder(View itemView) {
        super(itemView);
        nomeUsuario = (TextView) itemView.findViewById(R.id.nomeUsuario);
        btnEditar = (ImageButton) itemView.findViewById(R.id.btnEdit);
        btnExcluir = (ImageButton) itemView.findViewById(R.id.btnDelete);
    }
}
package com.example.latihancoordinatorlayout3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfilRSUmumSatuAdapter extends RecyclerView.Adapter<ProfilRSUmumSatuAdapter.ViewHolder> {
    private Context context;
    private String desc;
    private String nama;
    private String kontak_igd;
    private String kontak_info;
    private String email;

    public ProfilRSUmumSatuAdapter(Context context, String desc, String nama, String kontak_igd, String kontak_info, String email) {
        this.context = context;
        this.desc = desc;
        this.nama = nama;
        this.kontak_igd = kontak_igd;
        this.kontak_info = kontak_info;
        this.email = email;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View row=layoutInflater.inflate(R.layout.item_profil_rs, viewGroup, false);
        return new ViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.TVRSDesc.setText(desc);
        holder.TVKontakIgd.setText(kontak_igd);
        holder.TVKontakInfo.setText(kontak_info);
        holder.TVKontakEmail.setText(email);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView TVRSDesc,TVKontakIgd,TVKontakInfo,TVKontakEmail;
        RecyclerView recyclerViewDemo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TVRSDesc = itemView.findViewById(R.id.TVRSDesc);
            TVKontakIgd = itemView.findViewById(R.id.TVKontakIgd);
            TVKontakInfo = itemView.findViewById(R.id.TVKontakInfo);
            TVKontakEmail = itemView.findViewById(R.id.TVKontakEmail);
            recyclerViewDemo = itemView.findViewById(R.id.recyclerViewDemo);
        }
    }
}

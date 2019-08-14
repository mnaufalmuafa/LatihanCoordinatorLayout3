package com.example.latihancoordinatorlayout3.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihancoordinatorlayout3.ProfilRSUmumSatuAdapter;
import com.example.latihancoordinatorlayout3.R;

public class ProfilRSFragment extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_profilrs, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recyclerViewDemo);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewDemo.setLayoutManager(layoutManager);
        ProfilRSUmumSatuAdapter profilRSUmumSatuAdapter = new ProfilRSUmumSatuAdapter(
                getContext(),
                "Rumah sakit ini adalah Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pulvinar mattis nunc sed blandit libero volutpat.Et molestie ac feugiat sed lectus. Faucibus nisl tincidunt eget nullam",
                "Siloam Salampari",
                "0283-0987-8976",
                "0821-3837-1789",
                "siagamedika@gmail.com"
        );
        return view;
    }
}

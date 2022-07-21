package com.example.newsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EntertainmentFragment extends Fragment
{

    String api = "515c8455797e4eb5b942b094725804eb";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country ="in";
    private RecyclerView recyclerViewofenter;
    private String catagory = "entertainment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sciencefragment,null);


        recyclerViewofenter= v.findViewById(R.id.rcViewforEnterf);

        modelClassArrayList = new ArrayList<>();
        recyclerViewofenter.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter= new Adapter(getContext(),modelClassArrayList);
        recyclerViewofenter.setAdapter(adapter);

        findNews();



        return v;


    }

    private void findNews() {
        ApiUtilities.getApiInteface().getCategoryNews(country,catagory,100,api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if (response.isSuccessful()){
                    modelClassArrayList.addAll(response.body().getArticals());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });
    }
}
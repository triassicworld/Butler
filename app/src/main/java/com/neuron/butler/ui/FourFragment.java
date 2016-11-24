package com.neuron.butler.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.neuron.butler.PostActivity;
import com.neuron.butler.R;
import com.neuron.butler.adapter.PostAdapter;
import com.neuron.butler.model.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 11/10/2016.
 */

public class FourFragment extends Fragment {

    private List<Post> postList;
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;

    private Context context;

    public FourFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_four, container, false);

        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        hardCodeNotif();
        postAdapter = new PostAdapter(postList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(postAdapter);

        return rootView;
    }

    private void hardCodeNotif() {
        postList= new ArrayList<>();
        postList.add(new Post("Bikin Website Simple", "Tolong buatkan blogspot dengan kriteria berikut", "Teknologi", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Belikan Roti bakar", "Tolong belikan roti bakar di UI", "Makanan", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Kirimkan motor", "Kirimkan motor dari Bogor ke Cilandak", "Pengiriman barang besar", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Beli buku Lean Startup", "Saya ingin beli buku Lean Startup", "Beli Buku", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Bikin Website Simple", "Tolong buatkan blogspot dengan kriteria berikut", "Teknologi", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Belikan Roti bakar", "Tolong belikan roti bakar di UI", "Makanan", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Kirimkan motor", "Kirimkan motor dari Bogor ke Cilandak", "Pengiriman barang besar", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Beli buku Lean Startup", "Saya ingin beli buku Lean Startup", "Beli Buku", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Bikin Website Simple", "Tolong buatkan blogspot dengan kriteria berikut", "Teknologi", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Belikan Roti bakar", "Tolong belikan roti bakar di UI", "Makanan", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Kirimkan motor", "Kirimkan motor dari Bogor ke Cilandak", "Pengiriman barang besar", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Beli buku Lean Startup", "Saya ingin beli buku Lean Startup", "Beli Buku", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Bikin Website Simple", "Tolong buatkan blogspot dengan kriteria berikut", "Teknologi", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Belikan Roti bakar", "Tolong belikan roti bakar di UI", "Makanan", "11/11/2015", "12/11/2015", 10000));
        postList.add(new Post("Kirimkan motor", "Kirimkan motor dari Bogor ke Cilandak", "Pengiriman barang besar", "10/11/2015", "20/11/2015", 10000));
        postList.add(new Post("Beli buku Lean Startup", "Saya ingin beli buku Lean Startup", "Beli Buku", "11/11/2015", "12/11/2015", 10000));
    }
}

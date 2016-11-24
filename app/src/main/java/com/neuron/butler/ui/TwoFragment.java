package com.neuron.butler.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.neuron.butler.model.Notification;
import com.neuron.butler.R;
import com.neuron.butler.adapter.NotificationsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 11/10/2016.
 */

public class TwoFragment extends Fragment {

    private List<Notification> notifList;
    private RecyclerView recyclerView;
    private NotificationsAdapter notifAdapter;

    private Context context;

    public TwoFragment() {
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
//        return inflater.inflate(R.layout.fragment_two, container, false);

        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        hardCodeNotif();
        notifAdapter = new NotificationsAdapter(notifList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(notifAdapter);

        return rootView;
    }

    private void hardCodeNotif() {
        notifList = new ArrayList<>();
        notifList.add(new Notification("Welcome", "Welcome to Butler", "9/11/2015"));
        notifList.add(new Notification("Order Taken by Narendra", "Your order is taken by Narendra", "10/11/2015"));
        notifList.add(new Notification("Given Order", "Hanif gives you an order", "11/11/2015"));
    }
}

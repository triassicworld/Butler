package com.neuron.butler.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neuron.butler.model.Notification;
import com.neuron.butler.R;

import java.util.List;

/**
 * Created by Victor on 11/10/2016.
 */

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationHolder> {
    private List<Notification> notifList;

    public class NotificationHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public NotificationHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public NotificationsAdapter(List<Notification> notifList) {
        this.notifList = notifList;
    }

    @Override
    public NotificationHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notif_list_row, parent, false);

        return new NotificationHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NotificationHolder holder, int position) {
        Notification notif = notifList.get(position);
        holder.title.setText(notif.getTitle());
        holder.genre.setText(notif.getDescription());
        holder.year.setText(notif.getDate());
    }

    @Override
    public int getItemCount() {
        return notifList.size();
    }
}

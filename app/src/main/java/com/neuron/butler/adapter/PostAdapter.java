package com.neuron.butler.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neuron.butler.PostActivity;
import com.neuron.butler.R;
import com.neuron.butler.model.Post;

import java.util.List;

/**
 * Created by Victor on 11/10/2016.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {
    private List<Post> postList;
    private Context context;

    public class PostHolder extends RecyclerView.ViewHolder {
        public TextView title, description, postDate;

        public PostHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.post_title);
            description = (TextView) view.findViewById(R.id.post_description);
            postDate = (TextView) view.findViewById(R.id.post_date);

            context = view.getContext();
        }
    }


    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public PostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_list_row, parent, false);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    Intent intent = new Intent(context, PostActivity.class);
                    intent.putExtra("Post-Adapter", "waduh");
                    context.startActivity(intent);
                }catch(Exception e){

                }
            }
        });

        return new PostHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PostHolder holder, int position) {
        Post p = postList.get(position);
        holder.title.setText(p.getTitle());
        holder.description.setText(p.getDescription());
        holder.postDate.setText(p.getPostDate());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

}

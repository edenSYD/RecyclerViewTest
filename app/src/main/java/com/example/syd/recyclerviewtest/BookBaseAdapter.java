package com.example.syd.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * 作者: created by syd on 2018/6/8 21:29
 * 邮箱: sunyuandong@mujinkeji.com
 */
public class BookBaseAdapter extends RecyclerView.Adapter {

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

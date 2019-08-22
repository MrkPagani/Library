package com.apk.recycleviewcardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<Song> songList;

    public SongAdapter(List<Song> songList){
        this.songList = songList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_song_list_item,viewGroup);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Song song = songList.get(i);
        viewHolder.tvRank.setText(String.valueOf(song.getRank()));
        viewHolder.tcSongName.setText(song.getName());
        viewHolder.tcSinger.setText(song.getSinger());
        viewHolder.tvYear.setText(song.getYear());
        viewHolder.ivAlbumCover.setImageResource(song.getPic());
        viewHolder.tvYear.setText("2016");

    }

    @Override
    public int getItemCount() {

        return songList.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRank, tcSongName, tcSinger, tvYear;
        public ImageView ivAlbumCover;

        public ViewHolder(View v) {
            super(v);
            tvRank = v.findViewById(R.id.tv_rank);
            tcSongName = v.findViewById(R.id.tv_song_name);
            tcSongName = v.findViewById(R.id.tv_singer);
            tcSongName = v.findViewById(R.id.tv_year);
            tcSongName = v.findViewById( R.id.iv_album_cover);
        }
    }
}

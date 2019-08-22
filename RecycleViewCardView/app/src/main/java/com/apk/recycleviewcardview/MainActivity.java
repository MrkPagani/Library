package com.apk.recycleviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Song> songList;
    private SongAdapter songAdapter;

    String[] names = {"I Tool A Pill In Ibiza", "7 Years", "Pillow Talk", "Work From Home",
            "Never Forget You", "Don't Let Me Down", "Love Yourself", "Me, Myself & I",
            "Cake By The Ocean", "Dangerous Woman", "My House", "Stressed Out", "One Dance",
            "Middle", "No"};
    String[] singers = {"Mike Posner", "Lukas Graham", "Zayn", "Fifth Harmony", "Zara Larson & MNEK",
            "The Chainsmoker", "Justin Bieber", "G-Eazy x Bebe Rexha", "DNCE", "Ariana Grande",
            "Florida", "Twenty One Pilots", "Drake", "DJ Snake", "Meghan Trainer"};
    int[] pics = {
            R.drawable.took_a_pill,
            R.drawable.seven_years,
            R.drawable.work,
            R.drawable.never_forget_you,
            R.drawable.dont_let_me_down,
            R.drawable.love_yourself,
            R.drawable.me_myself_and_i,
            R.drawable.cake_by_the_ocean,
            R.drawable.dangerous_woman,
            R.drawable.my_house_florida,
            R.drawable.stressed_out,
            R.drawable.one_dance,
            R.drawable.middle,
            R.drawable.no};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleView);

        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        songList = new ArrayList<>();

        for(int i = 0; i<names.length; i++){
            Song song = new Song(names[i],singers[i],i+1,pics[i]);
            songList.add(song);
        }

        songAdapter = new SongAdapter(songList);

        mRecyclerView.setAdapter(songAdapter);
        songAdapter.notifyDataSetChanged();

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemCLick(View view, int position) {
                Toast.makeText(MainActivity.this,"Card At " + (position+1) + " Is Clicked ", Toast.LENGTH_SHORT).show();
                }
        }));
    }
}


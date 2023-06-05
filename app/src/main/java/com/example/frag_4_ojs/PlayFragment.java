package com.example.frag_4_ojs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;


public class PlayFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_play, container, false);

        Uri uri = Uri.parse("android.resource://com.example.frag_4_ojs/" + R.raw.hallstatt_play);
        VideoView videoview = (VideoView)view.findViewById(R.id.videoview);
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setVisibility(View.VISIBLE);
        // Inflate the layout for this fragment

        return view;
    }
}
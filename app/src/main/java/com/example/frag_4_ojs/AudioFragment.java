package com.example.frag_4_ojs;

import android.os.Bundle;
import android.media.MediaPlayer;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AudioFragment extends Fragment {

    MediaPlayer mp = new MediaPlayer();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_audio, container, false);

        mp = MediaPlayer.create(getContext(), R.raw.hare);
        mp.setLooping(false);
        mp.start();

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.stop();
            mp.release();
        }
    }
}
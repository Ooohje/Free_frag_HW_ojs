package com.example.frag_4_ojs;



import static android.speech.tts.TextToSpeech.ERROR;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.animation.ObjectAnimator;
import android.content.Context;

import android.os.Bundle;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class RouletteFragment extends Fragment {

    ImageView iv_roulette;
    float startDegree = 0f;
    float endDegree   = 0f;
    Context context;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        view = inflater.inflate(R.layout.fragment_roulette, container, false);

        context = container.getContext();
        iv_roulette = (ImageView)view.findViewById(R.id.roulette);
        rotate();
        return view;
    }

    public void rotate() {
        startDegree = endDegree;

        Random rand = new Random();
        int degree_rand = rand.nextInt(360);
        endDegree = startDegree + 360 * 3 + degree_rand;

        ObjectAnimator object = ObjectAnimator.ofFloat(iv_roulette, "rotation", startDegree, endDegree);
        object.setInterpolator(new AccelerateDecelerateInterpolator());
        object.setDuration(5000);
        object.start();
    }
}

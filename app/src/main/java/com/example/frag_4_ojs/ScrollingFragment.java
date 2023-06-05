package com.example.frag_4_ojs;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollingFragment extends Fragment {
    public ImageView img1, img2, img3, img4;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.fragment_scrolling,container,false);

        img1 = (ImageView) rootview.findViewById(R.id.img1);
        img2 = (ImageView) rootview.findViewById(R.id.img2);
        img3 = (ImageView) rootview.findViewById(R.id.img3);
        img4 = (ImageView) rootview.findViewById(R.id.img4);

        img1.setImageResource(R.drawable.pic1);
        img2.setImageResource(R.drawable.pic2);
        img3.setImageResource(R.drawable.pic3);
        img4.setImageResource(R.drawable.pic4);

        return rootview;
    }
}
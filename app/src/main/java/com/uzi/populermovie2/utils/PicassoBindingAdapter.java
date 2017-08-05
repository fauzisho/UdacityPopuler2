package com.uzi.populermovie2.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.uzi.populermovie2.R;


public class PicassoBindingAdapter {
    @BindingAdapter({"bind:posterURL"})
    public static void loadImage(ImageView view, String imageUrl) {
        final String finalUrl = "http://image.tmdb.org/t/p/w342/" + imageUrl;
        Picasso.with(view.getContext())
                .load(finalUrl)
                .placeholder(R.drawable.ic_error_outline_grey_900_48dp)
                .error(R.drawable.ic_error_outline_grey_900_48dp)
                .into(view);
    }

    @BindingAdapter({"bind:loadImage"})
    public static void loadVideoImg(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .placeholder(R.drawable.ic_error_outline_grey_900_48dp)
                .error(R.drawable.ic_error_outline_grey_900_48dp)
                .into(view);
    }

    @BindingAdapter({"bind:backdropURL"})
    public static void loadBackdrop(ImageView view, String imageUrl) {
        final String finalUrl = "http://image.tmdb.org/t/p/w780" + imageUrl;
        Picasso.with(view.getContext())
                .load(finalUrl)
                .placeholder(R.drawable.ic_error_outline_grey_900_48dp)
                .error(R.drawable.ic_error_outline_grey_900_48dp)
                .into(view);
    }
}

package com.uzi.populermovie2.ui.detail;

import android.os.Bundle;

import com.uzi.populermovie2.model.MovieVideo;
import com.uzi.populermovie2.model.Review;

import java.util.List;

public interface DetailView {

    void displayVideo(List<MovieVideo> first);

    void displayReview(List<Review> second);

    void displayError(String localizedMessage);

    void favoriteSuccess();

    void showError(String localizedMessage);

    void movieIsFavorited();
}

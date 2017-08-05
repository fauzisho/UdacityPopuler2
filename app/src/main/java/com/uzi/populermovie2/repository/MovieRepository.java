package com.uzi.populermovie2.repository;

import com.uzi.populermovie2.model.Movie;
import com.uzi.populermovie2.model.MovieVideo;
import com.uzi.populermovie2.model.Review;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;


public interface MovieRepository {
    Observable<List<Movie>> getPopularMovie(int page);

    Observable<List<Movie>> getTopRatedMovie(int page);

    Observable<List<MovieVideo>> getVideoTrailers(int movieId);

    Observable<List<Review>> getMovieReviews(int movieId, int page);

    Completable saveMovie(Movie movie);

    Completable deleteMovie(Movie movie);

    Single<Movie> getMovie(Movie movie);

    Observable<List<Movie>> getFavoriteMovies();
}


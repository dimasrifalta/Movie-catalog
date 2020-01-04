package com.dimasrifalta.mypc.mycatalogmovie;


import android.content.Intent;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.AdapterView;


import java.util.ArrayList;

import static androidx.core.graphics.drawable.IconCompat.getResources;


public class MoviesData {
    public String[] dataTitle, dataOverview, dataGenres, dataRuntime, dataLanguage,
            dataStatus, dataUserScore, dataYear;
    private TypedArray dataPoster;




    private void addItem() {

        ArrayList<My_movies> movies = new ArrayList<>();

        for (int i = 0; i < dataTitle.length; i++) {
            My_movies movie = new My_movies();
            movie.setPoster(dataPoster.getResourceId(i, -1));
            movie.setTitle(dataTitle[i]);
            movie.setOverview(dataOverview[i]);
            movie.setGenres(dataGenres[i]);
            movie.setStatus(dataStatus[i]);
            movie.setRuntime(dataRuntime[i]);
            movie.setUser_score(dataUserScore[i]);
            movie.setOriginal_language(dataLanguage[i]);
            movie.setYear(dataYear[i]);
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }

    private void item() {
        dataTitle = getResources().getStringArray(R.array.presidents_array);
        dataOverview = getResources().getStringArray(R.array.data_overview_movies);
        dataPoster = getResources().obtainTypedArray(R.array.data_poster_movies);
        dataGenres = getResources().getStringArray(R.array.data_genres_movies);
        dataStatus = getResources().getStringArray(R.array.data_status_movies);
        dataUserScore = getResources().getStringArray(R.array.data_userScore_movies);
        dataLanguage = getResources().getStringArray(R.array.data_language_movies);
        dataRuntime = getResources().getStringArray(R.array.data_runtime_movies);
        dataYear = getResources().getStringArray(R.array.data_year_movies);
    }

}

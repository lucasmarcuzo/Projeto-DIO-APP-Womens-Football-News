package me.dio.WomensFootball.data.remote;

import java.util.List;

import me.dio.WomensFootball.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}

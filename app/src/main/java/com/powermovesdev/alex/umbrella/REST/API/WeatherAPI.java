package com.powermovesdev.alex.umbrella.REST.API;

import com.powermovesdev.alex.umbrella.REST.Models.WeatherData;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by alex on 6/3/15.
 */
public interface WeatherAPI {


    @GET("/{apikey}/conditions/hourly/q/{zipcode}.json")
    Observable<WeatherData> getCurrentWeather(

            @Path("apikey") String wunderground_key,
            @Path("zipcode") String user_zip_code
    );
}

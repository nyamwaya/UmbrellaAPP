package com.powermovesdev.alex.umbrella.REST.Models;

import com.google.gson.annotations.SerializedName;
import com.powermovesdev.alex.umbrella.REST.Pojo.Hourly_forecast;

/**
 * Created by alex on 6/3/15.
 */
public class ForecastCondition {/**
 * Formatted time suitable for display
 */
public String displayTime;

    /**
     * Date representation of the time associated with this forecast
     */
    @SerializedName("FCTTIME")
    public Hourly_forecast.FCTTIME fcttime;

    @SerializedName("temp")
    public Hourly_forecast.Temp temp;



    /**
     * The icon to use for this reading
     */
    @SerializedName("icon_url")
    public String icon;

    /**
     * The human-readable name of the condition
     */
    public String condition;

    /**
     * The temperature that is forecast (in degrees Fahrenheit)
     */
    public float tempFahrenheit;

    /**
     * The temperature that is forecast (in degrees Celsius)
     */
    public float tempCelsius;
}

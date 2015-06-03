package com.powermovesdev.alex.umbrella;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.powermovesdev.alex.umbrella.Adapters.WeatherAdapter;
import com.powermovesdev.alex.umbrella.REST.Models.CurrentConditions;
import com.powermovesdev.alex.umbrella.REST.Models.CurrentObservation;
import com.powermovesdev.alex.umbrella.REST.Models.WeatherData;
import com.powermovesdev.alex.umbrella.REST.WeatherClient;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //instantiated uderground Client
        WeatherClient underGroundClient = new WeatherClient(this);
        //Getting observalbe to work
        Observable<WeatherData> weatherDataObservable = underGroundClient.getConditions( "55428");

        weatherDataObservable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(weatherData -> {

                            setCurrentConditionsView(weatherData.currentObservation);
                            mWeatherAdapter = new WeatherAdapter(this, weatherData.forecast);
                            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                            mRecyclerView.setAdapter(mWeatherAdapter);


                        }, Throwable::printStackTrace
                );

    }


    public void setCurrentConditionsView(CurrentObservation currentObservation){
        int basetemp = 60;
        RelativeLayout lLayout;
        TextView displayLocation =(TextView) findViewById(R.id.display_location_full);
        TextView tempf = (TextView) findViewById(R.id.temp);
        TextView weather = (TextView) findViewById(R.id.weather);
        ImageView settings = (ImageView) findViewById(R.id.settings);

        // settings.setImageDrawable();

        displayLocation.setText(currentObservation.displayLocation.getFull());
        tempf.setText(String.valueOf(currentObservation.tempFahrenheit));
        if (currentObservation.tempFahrenheit > basetemp){

            lLayout = (RelativeLayout) findViewById(R.id.current_conditions_view);
            lLayout.setBackgroundColor(getResources().getColor(R.color.weather_warm));

        } else {
            lLayout = (RelativeLayout) findViewById(R.id.current_conditions_view);
            lLayout.setBackgroundColor(getResources().getColor(R.color.weather_cool));

        }
        weather.setText(currentObservation.weather);
        // settings.setImageDrawable();




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.powermovesdev.alex.umbrella.REST.Models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 6/3/15.
 */
public class CurrentConditions {

        public class CurrentObservation {

            private Image image;
            private DisplayLocation displayLocation;
            private ObservationLocation observationLocation;
            private Estimated estimated;
            private String stationId;
            private String observationTime;
            private String observationTimeRfc822;
            private String observationEpoch;
            private String localTimeRfc822;
            private String localEpoch;
            private String localTzShort;
            private String localTzLong;
            private String localTzOffset;
            private String weather;
            private String temperatureString;
            private float tempF;
            private float tempC;
            private String relativeHumidity;
            private String windString;
            private String windDir;
            private int windDegrees;
            private float windMph;
            private String windGustMph;
            private float windKph;
            private String windGustKph;
            private String pressureMb;
            private String pressureIn;
            private String pressureTrend;
            private String dewpointString;
            private int dewpointF;
            private int dewpointC;
            private String heatIndexString;
            private String heatIndexF;
            private String heatIndexC;
            private String windchillString;
            private String windchillF;
            private String windchillC;
            private String feelslikeString;
            private String feelslikeF;
            private String feelslikeC;
            private String visibilityMi;
            private String visibilityKm;
            private String solarradiation;
            private String UV;
            private String precip1hrString;
            private String precip1hrIn;
            private String precip1hrMetric;
            private String precipTodayString;
            private String precipTodayIn;
            private String precipTodayMetric;
            private String icon;
            private String iconUrl;
            private String forecastUrl;
            private String historyUrl;
            private String obUrl;
            private String nowcast;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The image
             */
            public Image getImage() {
                return image;
            }

            /**
             * @param image The image
             */
            public void setImage(Image image) {
                this.image = image;
            }

            /**
             * @return The displayLocation
             */
            public DisplayLocation getDisplayLocation() {
                return displayLocation;
            }

            /**
             * @param displayLocation The display_location
             */
            public void setDisplayLocation(DisplayLocation displayLocation) {
                this.displayLocation = displayLocation;
            }

            /**
             * @return The observationLocation
             */
            public ObservationLocation getObservationLocation() {
                return observationLocation;
            }

            /**
             * @param observationLocation The observation_location
             */
            public void setObservationLocation(ObservationLocation observationLocation) {
                this.observationLocation = observationLocation;
            }

            /**
             * @return The estimated
             */
            public Estimated getEstimated() {
                return estimated;
            }

            /**
             * @param estimated The estimated
             */
            public void setEstimated(Estimated estimated) {
                this.estimated = estimated;
            }

            /**
             * @return The stationId
             */
            public String getStationId() {
                return stationId;
            }

            /**
             * @param stationId The station_id
             */
            public void setStationId(String stationId) {
                this.stationId = stationId;
            }

            /**
             * @return The observationTime
             */
            public String getObservationTime() {
                return observationTime;
            }

            /**
             * @param observationTime The observation_time
             */
            public void setObservationTime(String observationTime) {
                this.observationTime = observationTime;
            }

            /**
             * @return The observationTimeRfc822
             */
            public String getObservationTimeRfc822() {
                return observationTimeRfc822;
            }

            /**
             * @param observationTimeRfc822 The observation_time_rfc822
             */
            public void setObservationTimeRfc822(String observationTimeRfc822) {
                this.observationTimeRfc822 = observationTimeRfc822;
            }

            /**
             * @return The observationEpoch
             */
            public String getObservationEpoch() {
                return observationEpoch;
            }

            /**
             * @param observationEpoch The observation_epoch
             */
            public void setObservationEpoch(String observationEpoch) {
                this.observationEpoch = observationEpoch;
            }

            /**
             * @return The localTimeRfc822
             */
            public String getLocalTimeRfc822() {
                return localTimeRfc822;
            }

            /**
             * @param localTimeRfc822 The local_time_rfc822
             */
            public void setLocalTimeRfc822(String localTimeRfc822) {
                this.localTimeRfc822 = localTimeRfc822;
            }

            /**
             * @return The localEpoch
             */
            public String getLocalEpoch() {
                return localEpoch;
            }

            /**
             * @param localEpoch The local_epoch
             */
            public void setLocalEpoch(String localEpoch) {
                this.localEpoch = localEpoch;
            }

            /**
             * @return The localTzShort
             */
            public String getLocalTzShort() {
                return localTzShort;
            }

            /**
             * @param localTzShort The local_tz_short
             */
            public void setLocalTzShort(String localTzShort) {
                this.localTzShort = localTzShort;
            }

            /**
             * @return The localTzLong
             */
            public String getLocalTzLong() {
                return localTzLong;
            }

            /**
             * @param localTzLong The local_tz_long
             */
            public void setLocalTzLong(String localTzLong) {
                this.localTzLong = localTzLong;
            }

            /**
             * @return The localTzOffset
             */
            public String getLocalTzOffset() {
                return localTzOffset;
            }

            /**
             * @param localTzOffset The local_tz_offset
             */
            public void setLocalTzOffset(String localTzOffset) {
                this.localTzOffset = localTzOffset;
            }

            /**
             * @return The weather
             */
            public String getWeather() {
                return weather;
            }

            /**
             * @param weather The weather
             */
            public void setWeather(String weather) {
                this.weather = weather;
            }

            /**
             * @return The temperatureString
             */
            public String getTemperatureString() {
                return temperatureString;
            }

            /**
             * @param temperatureString The temperature_string
             */
            public void setTemperatureString(String temperatureString) {
                this.temperatureString = temperatureString;
            }

            /**
             * @return The tempF
             */
            public float getTempF() {
                return tempF;
            }

            /**
             * @param tempF The temp_f
             */
            public void setTempF(float tempF) {
                this.tempF = tempF;
            }

            /**
             * @return The tempC
             */
            public float getTempC() {
                return tempC;
            }

            /**
             * @param tempC The temp_c
             */
            public void setTempC(float tempC) {
                this.tempC = tempC;
            }

            /**
             * @return The relativeHumidity
             */
            public String getRelativeHumidity() {
                return relativeHumidity;
            }

            /**
             * @param relativeHumidity The relative_humidity
             */
            public void setRelativeHumidity(String relativeHumidity) {
                this.relativeHumidity = relativeHumidity;
            }

            /**
             * @return The windString
             */
            public String getWindString() {
                return windString;
            }

            /**
             * @param windString The wind_string
             */
            public void setWindString(String windString) {
                this.windString = windString;
            }

            /**
             * @return The windDir
             */
            public String getWindDir() {
                return windDir;
            }

            /**
             * @param windDir The wind_dir
             */
            public void setWindDir(String windDir) {
                this.windDir = windDir;
            }

            /**
             * @return The windDegrees
             */
            public int getWindDegrees() {
                return windDegrees;
            }

            /**
             * @param windDegrees The wind_degrees
             */
            public void setWindDegrees(int windDegrees) {
                this.windDegrees = windDegrees;
            }

            /**
             * @return The windMph
             */
            public float getWindMph() {
                return windMph;
            }

            /**
             * @param windMph The wind_mph
             */
            public void setWindMph(float windMph) {
                this.windMph = windMph;
            }

            /**
             * @return The windGustMph
             */
            public String getWindGustMph() {
                return windGustMph;
            }

            /**
             * @param windGustMph The wind_gust_mph
             */
            public void setWindGustMph(String windGustMph) {
                this.windGustMph = windGustMph;
            }

            /**
             * @return The windKph
             */
            public float getWindKph() {
                return windKph;
            }

            /**
             * @param windKph The wind_kph
             */
            public void setWindKph(float windKph) {
                this.windKph = windKph;
            }

            /**
             * @return The windGustKph
             */
            public String getWindGustKph() {
                return windGustKph;
            }

            /**
             * @param windGustKph The wind_gust_kph
             */
            public void setWindGustKph(String windGustKph) {
                this.windGustKph = windGustKph;
            }

            /**
             * @return The pressureMb
             */
            public String getPressureMb() {
                return pressureMb;
            }

            /**
             * @param pressureMb The pressure_mb
             */
            public void setPressureMb(String pressureMb) {
                this.pressureMb = pressureMb;
            }

            /**
             * @return The pressureIn
             */
            public String getPressureIn() {
                return pressureIn;
            }

            /**
             * @param pressureIn The pressure_in
             */
            public void setPressureIn(String pressureIn) {
                this.pressureIn = pressureIn;
            }

            /**
             * @return The pressureTrend
             */
            public String getPressureTrend() {
                return pressureTrend;
            }

            /**
             * @param pressureTrend The pressure_trend
             */
            public void setPressureTrend(String pressureTrend) {
                this.pressureTrend = pressureTrend;
            }

            /**
             * @return The dewpointString
             */
            public String getDewpointString() {
                return dewpointString;
            }

            /**
             * @param dewpointString The dewpoint_string
             */
            public void setDewpointString(String dewpointString) {
                this.dewpointString = dewpointString;
            }

            /**
             * @return The dewpointF
             */
            public int getDewpointF() {
                return dewpointF;
            }

            /**
             * @param dewpointF The dewpoint_f
             */
            public void setDewpointF(int dewpointF) {
                this.dewpointF = dewpointF;
            }

            /**
             * @return The dewpointC
             */
            public int getDewpointC() {
                return dewpointC;
            }

            /**
             * @param dewpointC The dewpoint_c
             */
            public void setDewpointC(int dewpointC) {
                this.dewpointC = dewpointC;
            }

            /**
             * @return The heatIndexString
             */
            public String getHeatIndexString() {
                return heatIndexString;
            }

            /**
             * @param heatIndexString The heat_index_string
             */
            public void setHeatIndexString(String heatIndexString) {
                this.heatIndexString = heatIndexString;
            }

            /**
             * @return The heatIndexF
             */
            public String getHeatIndexF() {
                return heatIndexF;
            }

            /**
             * @param heatIndexF The heat_index_f
             */
            public void setHeatIndexF(String heatIndexF) {
                this.heatIndexF = heatIndexF;
            }

            /**
             * @return The heatIndexC
             */
            public String getHeatIndexC() {
                return heatIndexC;
            }

            /**
             * @param heatIndexC The heat_index_c
             */
            public void setHeatIndexC(String heatIndexC) {
                this.heatIndexC = heatIndexC;
            }

            /**
             * @return The windchillString
             */
            public String getWindchillString() {
                return windchillString;
            }

            /**
             * @param windchillString The windchill_string
             */
            public void setWindchillString(String windchillString) {
                this.windchillString = windchillString;
            }

            /**
             * @return The windchillF
             */
            public String getWindchillF() {
                return windchillF;
            }

            /**
             * @param windchillF The windchill_f
             */
            public void setWindchillF(String windchillF) {
                this.windchillF = windchillF;
            }

            /**
             * @return The windchillC
             */
            public String getWindchillC() {
                return windchillC;
            }

            /**
             * @param windchillC The windchill_c
             */
            public void setWindchillC(String windchillC) {
                this.windchillC = windchillC;
            }

            /**
             * @return The feelslikeString
             */
            public String getFeelslikeString() {
                return feelslikeString;
            }

            /**
             * @param feelslikeString The feelslike_string
             */
            public void setFeelslikeString(String feelslikeString) {
                this.feelslikeString = feelslikeString;
            }

            /**
             * @return The feelslikeF
             */
            public String getFeelslikeF() {
                return feelslikeF;
            }

            /**
             * @param feelslikeF The feelslike_f
             */
            public void setFeelslikeF(String feelslikeF) {
                this.feelslikeF = feelslikeF;
            }

            /**
             * @return The feelslikeC
             */
            public String getFeelslikeC() {
                return feelslikeC;
            }

            /**
             * @param feelslikeC The feelslike_c
             */
            public void setFeelslikeC(String feelslikeC) {
                this.feelslikeC = feelslikeC;
            }

            /**
             * @return The visibilityMi
             */
            public String getVisibilityMi() {
                return visibilityMi;
            }

            /**
             * @param visibilityMi The visibility_mi
             */
            public void setVisibilityMi(String visibilityMi) {
                this.visibilityMi = visibilityMi;
            }

            /**
             * @return The visibilityKm
             */
            public String getVisibilityKm() {
                return visibilityKm;
            }

            /**
             * @param visibilityKm The visibility_km
             */
            public void setVisibilityKm(String visibilityKm) {
                this.visibilityKm = visibilityKm;
            }

            /**
             * @return The solarradiation
             */
            public String getSolarradiation() {
                return solarradiation;
            }

            /**
             * @param solarradiation The solarradiation
             */
            public void setSolarradiation(String solarradiation) {
                this.solarradiation = solarradiation;
            }

            /**
             * @return The UV
             */
            public String getUV() {
                return UV;
            }

            /**
             * @param UV The UV
             */
            public void setUV(String UV) {
                this.UV = UV;
            }

            /**
             * @return The precip1hrString
             */
            public String getPrecip1hrString() {
                return precip1hrString;
            }

            /**
             * @param precip1hrString The precip_1hr_string
             */
            public void setPrecip1hrString(String precip1hrString) {
                this.precip1hrString = precip1hrString;
            }

            /**
             * @return The precip1hrIn
             */
            public String getPrecip1hrIn() {
                return precip1hrIn;
            }

            /**
             * @param precip1hrIn The precip_1hr_in
             */
            public void setPrecip1hrIn(String precip1hrIn) {
                this.precip1hrIn = precip1hrIn;
            }

            /**
             * @return The precip1hrMetric
             */
            public String getPrecip1hrMetric() {
                return precip1hrMetric;
            }

            /**
             * @param precip1hrMetric The precip_1hr_metric
             */
            public void setPrecip1hrMetric(String precip1hrMetric) {
                this.precip1hrMetric = precip1hrMetric;
            }

            /**
             * @return The precipTodayString
             */
            public String getPrecipTodayString() {
                return precipTodayString;
            }

            /**
             * @param precipTodayString The precip_today_string
             */
            public void setPrecipTodayString(String precipTodayString) {
                this.precipTodayString = precipTodayString;
            }

            /**
             * @return The precipTodayIn
             */
            public String getPrecipTodayIn() {
                return precipTodayIn;
            }

            /**
             * @param precipTodayIn The precip_today_in
             */
            public void setPrecipTodayIn(String precipTodayIn) {
                this.precipTodayIn = precipTodayIn;
            }

            /**
             * @return The precipTodayMetric
             */
            public String getPrecipTodayMetric() {
                return precipTodayMetric;
            }

            /**
             * @param precipTodayMetric The precip_today_metric
             */
            public void setPrecipTodayMetric(String precipTodayMetric) {
                this.precipTodayMetric = precipTodayMetric;
            }

            /**
             * @return The icon
             */
            public String getIcon() {
                return icon;
            }

            /**
             * @param icon The icon
             */
            public void setIcon(String icon) {
                this.icon = icon;
            }

            /**
             * @return The iconUrl
             */
            public String getIconUrl() {
                return iconUrl;
            }

            /**
             * @param iconUrl The icon_url
             */
            public void setIconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
            }

            /**
             * @return The forecastUrl
             */
            public String getForecastUrl() {
                return forecastUrl;
            }

            /**
             * @param forecastUrl The forecast_url
             */
            public void setForecastUrl(String forecastUrl) {
                this.forecastUrl = forecastUrl;
            }

            /**
             * @return The historyUrl
             */
            public String getHistoryUrl() {
                return historyUrl;
            }

            /**
             * @param historyUrl The history_url
             */
            public void setHistoryUrl(String historyUrl) {
                this.historyUrl = historyUrl;
            }

            /**
             * @return The obUrl
             */
            public String getObUrl() {
                return obUrl;
            }

            /**
             * @param obUrl The ob_url
             */
            public void setObUrl(String obUrl) {
                this.obUrl = obUrl;
            }

            /**
             * @return The nowcast
             */
            public String getNowcast() {
                return nowcast;
            }

            /**
             * @param nowcast The nowcast
             */
            public void setNowcast(String nowcast) {
                this.nowcast = nowcast;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class DisplayLocation {

            private String full;
            private String city;
            private String state;
            private String stateName;
            private String country;
            private String countryIso3166;
            private String zip;
            private String magic;
            private String wmo;
            private String latitude;
            private String longitude;
            private String elevation;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The full
             */
            public String getFull() {
                return full;
            }

            /**
             * @param full The full
             */
            public void setFull(String full) {
                this.full = full;
            }

            /**
             * @return The city
             */
            public String getCity() {
                return city;
            }

            /**
             * @param city The city
             */
            public void setCity(String city) {
                this.city = city;
            }

            /**
             * @return The state
             */
            public String getState() {
                return state;
            }

            /**
             * @param state The state
             */
            public void setState(String state) {
                this.state = state;
            }

            /**
             * @return The stateName
             */
            public String getStateName() {
                return stateName;
            }

            /**
             * @param stateName The state_name
             */
            public void setStateName(String stateName) {
                this.stateName = stateName;
            }

            /**
             * @return The country
             */
            public String getCountry() {
                return country;
            }

            /**
             * @param country The country
             */
            public void setCountry(String country) {
                this.country = country;
            }

            /**
             * @return The countryIso3166
             */
            public String getCountryIso3166() {
                return countryIso3166;
            }

            /**
             * @param countryIso3166 The country_iso3166
             */
            public void setCountryIso3166(String countryIso3166) {
                this.countryIso3166 = countryIso3166;
            }

            /**
             * @return The zip
             */
            public String getZip() {
                return zip;
            }

            /**
             * @param zip The zip
             */
            public void setZip(String zip) {
                this.zip = zip;
            }

            /**
             * @return The magic
             */
            public String getMagic() {
                return magic;
            }

            /**
             * @param magic The magic
             */
            public void setMagic(String magic) {
                this.magic = magic;
            }

            /**
             * @return The wmo
             */
            public String getWmo() {
                return wmo;
            }

            /**
             * @param wmo The wmo
             */
            public void setWmo(String wmo) {
                this.wmo = wmo;
            }

            /**
             * @return The latitude
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * @param latitude The latitude
             */
            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            /**
             * @return The longitude
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * @param longitude The longitude
             */
            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            /**
             * @return The elevation
             */
            public String getElevation() {
                return elevation;
            }

            /**
             * @param elevation The elevation
             */
            public void setElevation(String elevation) {
                this.elevation = elevation;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class Estimated {

            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class Features {

            private int conditions;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The conditions
             */
            public int getConditions() {
                return conditions;
            }

            /**
             * @param conditions The conditions
             */
            public void setConditions(int conditions) {
                this.conditions = conditions;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class Image {

            private String url;
            private String title;
            private String link;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The url
             */
            public String getUrl() {
                return url;
            }

            /**
             * @param url The url
             */
            public void setUrl(String url) {
                this.url = url;
            }

            /**
             * @return The title
             */
            public String getTitle() {
                return title;
            }

            /**
             * @param title The title
             */
            public void setTitle(String title) {
                this.title = title;
            }

            /**
             * @return The link
             */
            public String getLink() {
                return link;
            }

            /**
             * @param link The link
             */
            public void setLink(String link) {
                this.link = link;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class ObservationLocation {

            private String full;
            private String city;
            private String state;
            private String country;
            private String countryIso3166;
            private String latitude;
            private String longitude;
            private String elevation;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The full
             */
            public String getFull() {
                return full;
            }

            /**
             * @param full The full
             */
            public void setFull(String full) {
                this.full = full;
            }

            /**
             * @return The city
             */
            public String getCity() {
                return city;
            }

            /**
             * @param city The city
             */
            public void setCity(String city) {
                this.city = city;
            }

            /**
             * @return The state
             */
            public String getState() {
                return state;
            }

            /**
             * @param state The state
             */
            public void setState(String state) {
                this.state = state;
            }

            /**
             * @return The country
             */
            public String getCountry() {
                return country;
            }

            /**
             * @param country The country
             */
            public void setCountry(String country) {
                this.country = country;
            }

            /**
             * @return The countryIso3166
             */
            public String getCountryIso3166() {
                return countryIso3166;
            }

            /**
             * @param countryIso3166 The country_iso3166
             */
            public void setCountryIso3166(String countryIso3166) {
                this.countryIso3166 = countryIso3166;
            }

            /**
             * @return The latitude
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * @param latitude The latitude
             */
            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            /**
             * @return The longitude
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * @param longitude The longitude
             */
            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            /**
             * @return The elevation
             */
            public String getElevation() {
                return elevation;
            }

            /**
             * @param elevation The elevation
             */
            public void setElevation(String elevation) {
                this.elevation = elevation;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class Response {

            private Response_ response;
            private CurrentObservation currentObservation;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The response
             */
            public Response_ getResponse() {
                return response;
            }

            /**
             * @param response The response
             */
            public void setResponse(Response_ response) {
                this.response = response;
            }

            /**
             * @return The currentObservation
             */
            public CurrentObservation getCurrentObservation() {
                return currentObservation;
            }

            /**
             * @param currentObservation The current_observation
             */
            public void setCurrentObservation(CurrentObservation currentObservation) {
                this.currentObservation = currentObservation;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }

        public class Response_ {

            private String version;
            private String termsofService;
            private Features features;
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();

            /**
             * @return The version
             */
            public String getVersion() {
                return version;
            }

            /**
             * @param version The version
             */
            public void setVersion(String version) {
                this.version = version;
            }

            /**
             * @return The termsofService
             */
            public String getTermsofService() {
                return termsofService;
            }

            /**
             * @param termsofService The termsofService
             */
            public void setTermsofService(String termsofService) {
                this.termsofService = termsofService;
            }

            /**
             * @return The features
             */
            public Features getFeatures() {
                return features;
            }

            /**
             * @param features The features
             */
            public void setFeatures(Features features) {
                this.features = features;
            }

            public Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public void setAdditionalProperty(String name, Object value) {
                this.additionalProperties.put(name, value);
            }

        }
    }




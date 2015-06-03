package com.powermovesdev.alex.umbrella.REST.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 6/3/15.
 */
public class Hourly_forecast {

    public FCTTIME fcttime;
    public Temp temp;

    public class FCTTIME {

        @Expose
        public String hour;
        @SerializedName("hour_padded")
        @Expose
        public String hourPadded;
        @Expose
        public String min;
        @SerializedName("min_unpadded")
        @Expose
        public String minUnpadded;
        @Expose
        public String sec;
        @Expose
        public String year;
        @Expose
        public String mon;
        @SerializedName("mon_padded")
        @Expose
        public String monPadded;
        @SerializedName("mon_abbrev")
        @Expose
        public String monAbbrev;
        @Expose
        public String mday;
        @SerializedName("mday_padded")
        @Expose
        public String mdayPadded;
        @Expose
        public int yday;
        @Expose
        public String isdst;
        @Expose
        public String epoch;
        @Expose
        public String pretty;
        @Expose
        public String civil;
        @SerializedName("month_name")
        @Expose
        public String monthName;
        @SerializedName("month_name_abbrev")
        @Expose
        public String monthNameAbbrev;
        @SerializedName("weekday_name")
        @Expose
        public String weekdayName;
        @SerializedName("weekday_name_night")
        @Expose
        public String weekdayNameNight;
        @SerializedName("weekday_name_abbrev")
        @Expose
        public String weekdayNameAbbrev;
        @SerializedName("weekday_name_unlang")
        @Expose
        public String weekdayNameUnlang;
        @SerializedName("weekday_name_night_unlang")
        @Expose
        public String weekdayNameNightUnlang;
        @Expose
        public String ampm;
        @Expose
        public String tz;
        @Expose
        public String age;
        @Expose
        public String UTCDATE;

        /**
         * @return The hour
         */
        public String getHour() {
            return hour;
        }

        /**
         * @param hour The hour
         */
        public void setHour(String hour) {
            this.hour = hour;
        }

        /**
         * @return The hourPadded
         */
        public String getHourPadded() {
            return hourPadded;
        }

        /**
         * @param hourPadded The hour_padded
         */
        public void setHourPadded(String hourPadded) {
            this.hourPadded = hourPadded;
        }

        /**
         * @return The min
         */
        public String getMin() {
            return min;
        }

        /**
         * @param min The min
         */
        public void setMin(String min) {
            this.min = min;
        }

        /**
         * @return The minUnpadded
         */
        public String getMinUnpadded() {
            return minUnpadded;
        }

        /**
         * @param minUnpadded The min_unpadded
         */
        public void setMinUnpadded(String minUnpadded) {
            this.minUnpadded = minUnpadded;
        }

        /**
         * @return The sec
         */
        public String getSec() {
            return sec;
        }

        /**
         * @param sec The sec
         */
        public void setSec(String sec) {
            this.sec = sec;
        }

        /**
         * @return The year
         */
        public String getYear() {
            return year;
        }

        /**
         * @param year The year
         */
        public void setYear(String year) {
            this.year = year;
        }

        /**
         * @return The mon
         */
        public String getMon() {
            return mon;
        }

        /**
         * @param mon The mon
         */
        public void setMon(String mon) {
            this.mon = mon;
        }

        /**
         * @return The monPadded
         */
        public String getMonPadded() {
            return monPadded;
        }

        /**
         * @param monPadded The mon_padded
         */
        public void setMonPadded(String monPadded) {
            this.monPadded = monPadded;
        }

        /**
         * @return The monAbbrev
         */
        public String getMonAbbrev() {
            return monAbbrev;
        }

        /**
         * @param monAbbrev The mon_abbrev
         */
        public void setMonAbbrev(String monAbbrev) {
            this.monAbbrev = monAbbrev;
        }

        /**
         * @return The mday
         */
        public String getMday() {
            return mday;
        }

        /**
         * @param mday The mday
         */
        public void setMday(String mday) {
            this.mday = mday;
        }

        /**
         * @return The mdayPadded
         */
        public String getMdayPadded() {
            return mdayPadded;
        }

        /**
         * @param mdayPadded The mday_padded
         */
        public void setMdayPadded(String mdayPadded) {
            this.mdayPadded = mdayPadded;
        }

        /**
         * @return The yday
         */
        public String getYday() {
            return String.valueOf(yday);
        }

        /**
         * @param yday The yday
         */
        public void setYday(int yday) {
            this.yday = yday;
        }

        /**
         * @return The isdst
         */
        public String getIsdst() {
            return isdst;
        }

        /**
         * @param isdst The isdst
         */
        public void setIsdst(String isdst) {
            this.isdst = isdst;
        }

        /**
         * @return The epoch
         */
        public String getEpoch() {
            return epoch;
        }

        /**
         * @param epoch The epoch
         */
        public void setEpoch(String epoch) {
            this.epoch = epoch;
        }

        /**
         * @return The pretty
         */
        public String getPretty() {
            return pretty;
        }

        /**
         * @param pretty The pretty
         */
        public void setPretty(String pretty) {
            this.pretty = pretty;
        }

        /**
         * @return The civil
         */
        public String getCivil() {
            return civil;
        }

        /**
         * @param civil The civil
         */
        public void setCivil(String civil) {
            this.civil = civil;
        }

        /**
         * @return The monthName
         */
        public String getMonthName() {
            return monthName;
        }

        /**
         * @param monthName The month_name
         */
        public void setMonthName(String monthName) {
            this.monthName = monthName;
        }

        /**
         * @return The monthNameAbbrev
         */
        public String getMonthNameAbbrev() {
            return monthNameAbbrev;
        }

        /**
         * @param monthNameAbbrev The month_name_abbrev
         */
        public void setMonthNameAbbrev(String monthNameAbbrev) {
            this.monthNameAbbrev = monthNameAbbrev;
        }

        /**
         * @return The weekdayName
         */
        public String getWeekdayName() {
            return weekdayName;
        }

        /**
         * @param weekdayName The weekday_name
         */
        public void setWeekdayName(String weekdayName) {
            this.weekdayName = weekdayName;
        }

        /**
         * @return The weekdayNameNight
         */
        public String getWeekdayNameNight() {
            return weekdayNameNight;
        }

        /**
         * @param weekdayNameNight The weekday_name_night
         */
        public void setWeekdayNameNight(String weekdayNameNight) {
            this.weekdayNameNight = weekdayNameNight;
        }

        /**
         * @return The weekdayNameAbbrev
         */
        public String getWeekdayNameAbbrev() {
            return weekdayNameAbbrev;
        }

        /**
         * @param weekdayNameAbbrev The weekday_name_abbrev
         */
        public void setWeekdayNameAbbrev(String weekdayNameAbbrev) {
            this.weekdayNameAbbrev = weekdayNameAbbrev;
        }

        /**
         * @return The weekdayNameUnlang
         */
        public String getWeekdayNameUnlang() {
            return weekdayNameUnlang;
        }

        /**
         * @param weekdayNameUnlang The weekday_name_unlang
         */
        public void setWeekdayNameUnlang(String weekdayNameUnlang) {
            this.weekdayNameUnlang = weekdayNameUnlang;
        }

        /**
         * @return The weekdayNameNightUnlang
         */
        public String getWeekdayNameNightUnlang() {
            return weekdayNameNightUnlang;
        }

        /**
         * @param weekdayNameNightUnlang The weekday_name_night_unlang
         */
        public void setWeekdayNameNightUnlang(String weekdayNameNightUnlang) {
            this.weekdayNameNightUnlang = weekdayNameNightUnlang;
        }

        /**
         * @return The ampm
         */
        public String getAmpm() {
            return ampm;
        }

        /**
         * @param ampm The ampm
         */
        public void setAmpm(String ampm) {
            this.ampm = ampm;
        }

        /**
         * @return The tz
         */
        public String getTz() {
            return tz;
        }

        /**
         * @param tz The tz
         */
        public void setTz(String tz) {
            this.tz = tz;
        }

        /**
         * @return The age
         */
        public String getAge() {
            return age;
        }

        /**
         * @param age The age
         */
        public void setAge(String age) {
            this.age = age;
        }

        /**
         * @return The UTCDATE
         */
        public String getUTCDATE() {
            return UTCDATE;
        }

        /**
         * @param UTCDATE The UTCDATE
         */
        public void setUTCDATE(String UTCDATE) {
            this.UTCDATE = UTCDATE;
        }

    }

    public class Features {

        @Expose
        public Integer conditions;
        @Expose
        public Integer hourly;

        /**
         * @return The conditions
         */
        public Integer getConditions() {
            return conditions;
        }

        /**
         * @param conditions The conditions
         */
        public void setConditions(Integer conditions) {
            this.conditions = conditions;
        }

        /**
         * @return The hourly
         */
        public Integer getHourly() {
            return hourly;
        }

        /**
         * @param hourly The hourly
         */
        public void setHourly(Integer hourly) {
            this.hourly = hourly;
        }

    }

    public class Feelslike {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Heatindex {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class HourlyCondition {

        @Expose
        public Response response;
        @SerializedName("hourly_forecast")
        @Expose
        public List<HourlyForecast> hourlyForecast = new ArrayList<HourlyForecast>();

        /**
         * @return The response
         */
        public Response getResponse() {
            return response;
        }

        /**
         * @param response The response
         */
        public void setResponse(Response response) {
            this.response = response;
        }

        /**
         * @return The hourlyForecast
         */
        public List<HourlyForecast> getHourlyForecast() {
            return hourlyForecast;
        }

        /**
         * @param hourlyForecast The hourly_forecast
         */
        public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
            this.hourlyForecast = hourlyForecast;
        }

    }

    public class HourlyForecast {

        @Expose
        public Hourly_forecast.FCTTIME FCTTIME;
        @Expose
        public Temp temp;
        //  @Expose
        // public Dewpoint dewpoint;
        @Expose
        public String condition;
        @Expose
        public String icon;
        @SerializedName("icon_url")
        @Expose
        public String iconUrl;
        @Expose
        public String fctcode;
        @Expose
        public String sky;
        @Expose
        public Wspd wspd;
        @Expose
        public Wdir wdir;
        @Expose
        public String wx;
        @Expose
        public String uvi;
        @Expose
        public String humidity;
        @Expose
        public Windchill windchill;
        @Expose
        public Heatindex heatindex;
        @Expose
        public Feelslike feelslike;
        @Expose
        public Qpf qpf;
        @Expose
        public Snow snow;
        @Expose
        public String pop;
        @Expose
        public Mslp mslp;

        /**
         * @return The FCTTIME
         */
        public Hourly_forecast.FCTTIME getFCTTIME() {
            return FCTTIME;
        }

        /**
         * @param FCTTIME The FCTTIME
         */
        public void setFCTTIME(Hourly_forecast.FCTTIME FCTTIME) {
            this.FCTTIME = FCTTIME;
        }

        /**
         * @return The temp
         */
        public Temp getTemp() {
            return temp;
        }

        /**
         * @param temp The temp
         */
        public void setTemp(Temp temp) {
            this.temp = temp;
        }


        /**
         * @return The condition
         */
        public String getCondition() {
            return condition;
        }

        /**
         * @param condition The condition
         */
        public void setCondition(String condition) {
            this.condition = condition;
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
         * @return The fctcode
         */
        public String getFctcode() {
            return fctcode;
        }

        /**
         * @param fctcode The fctcode
         */
        public void setFctcode(String fctcode) {
            this.fctcode = fctcode;
        }

        /**
         * @return The sky
         */
        public String getSky() {
            return sky;
        }

        /**
         * @param sky The sky
         */
        public void setSky(String sky) {
            this.sky = sky;
        }

        /**
         * @return The wspd
         */
        public Wspd getWspd() {
            return wspd;
        }

        /**
         * @param wspd The wspd
         */
        public void setWspd(Wspd wspd) {
            this.wspd = wspd;
        }

        /**
         * @return The wdir
         */
        public Wdir getWdir() {
            return wdir;
        }

        /**
         * @param wdir The wdir
         */
        public void setWdir(Wdir wdir) {
            this.wdir = wdir;
        }

        /**
         * @return The wx
         */
        public String getWx() {
            return wx;
        }

        /**
         * @param wx The wx
         */
        public void setWx(String wx) {
            this.wx = wx;
        }

        /**
         * @return The uvi
         */
        public String getUvi() {
            return uvi;
        }

        /**
         * @param uvi The uvi
         */
        public void setUvi(String uvi) {
            this.uvi = uvi;
        }

        /**
         * @return The humidity
         */
        public String getHumidity() {
            return humidity;
        }

        /**
         * @param humidity The humidity
         */
        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        /**
         * @return The windchill
         */
        public Windchill getWindchill() {
            return windchill;
        }

        /**
         * @param windchill The windchill
         */
        public void setWindchill(Windchill windchill) {
            this.windchill = windchill;
        }

        /**
         * @return The heatindex
         */
        public Heatindex getHeatindex() {
            return heatindex;
        }

        /**
         * @param heatindex The heatindex
         */
        public void setHeatindex(Heatindex heatindex) {
            this.heatindex = heatindex;
        }

        /**
         * @return The feelslike
         */
        public Feelslike getFeelslike() {
            return feelslike;
        }

        /**
         * @param feelslike The feelslike
         */
        public void setFeelslike(Feelslike feelslike) {
            this.feelslike = feelslike;
        }

        /**
         * @return The qpf
         */
        public Qpf getQpf() {
            return qpf;
        }

        /**
         * @param qpf The qpf
         */
        public void setQpf(Qpf qpf) {
            this.qpf = qpf;
        }

        /**
         * @return The snow
         */
        public Snow getSnow() {
            return snow;
        }

        /**
         * @param snow The snow
         */
        public void setSnow(Snow snow) {
            this.snow = snow;
        }

        /**
         * @return The pop
         */
        public String getPop() {
            return pop;
        }

        /**
         * @param pop The pop
         */
        public void setPop(String pop) {
            this.pop = pop;
        }

        /**
         * @return The mslp
         */
        public Mslp getMslp() {
            return mslp;
        }

        /**
         * @param mslp The mslp
         */
        public void setMslp(Mslp mslp) {
            this.mslp = mslp;
        }

    }

    public class Mslp {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Qpf {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Response {

        @Expose
        public String version;
        @Expose
        public String termsofService;
        @Expose
        public Features features;

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

    }

    public class Snow {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Temp {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Wdir {

        @Expose
        public String dir;
        @Expose
        public String degrees;

        /**
         * @return The dir
         */
        public String getDir() {
            return dir;
        }

        /**
         * @param dir The dir
         */
        public void setDir(String dir) {
            this.dir = dir;
        }

        /**
         * @return The degrees
         */
        public String getDegrees() {
            return degrees;
        }

        /**
         * @param degrees The degrees
         */
        public void setDegrees(String degrees) {
            this.degrees = degrees;
        }

    }

    public class Windchill {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

    public class Wspd {

        @Expose
        public String english;
        @Expose
        public String metric;

        /**
         * @return The english
         */
        public String getEnglish() {
            return english;
        }

        /**
         * @param english The english
         */
        public void setEnglish(String english) {
            this.english = english;
        }

        /**
         * @return The metric
         */
        public String getMetric() {
            return metric;
        }

        /**
         * @param metric The metric
         */
        public void setMetric(String metric) {
            this.metric = metric;
        }

    }

}


package com.example.weather;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WeatherApplication {
    public static void WeatherInformation(String cityName) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder()
                .uri(new URI("https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=ADD_YOUR_OWN_KEY"))
                .build();
        HttpResponse<String> response=client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());//body of the response
        Gson gson= new Gson();
        Weather weather = gson.fromJson(response.body(), Weather.class);

        System.out.println("temperature : "+weather.getMain().getTemp());
        System.out.println("description : "+weather.getWeather()[0].getDescription());
        System.out.println("Minimum temperature : "+weather.getMain().getTempMin());
        System.out.println("Maximum temperature : "+weather.getMain().getTempMax());
        System.out.println("Humidity : "+weather.getMain().getHumidity());
        System.out.println("Feels like temperature : "+weather.getMain().getFeelsLike());
        System.out.println("Pressure : "+weather.getMain().getPressure());
        System.out.println("Wind speed : "+weather.getWind().getSpeed());
        System.out.println("Wind degree : "+weather.getWind().getDeg());
        System.out.println("visibility : "+weather.getVisibility());



        long sunriseTimestamp = weather.getSys().getSunrise(); // Replace with your actual timestamp
        long sunsetTimestamp = weather.getSys().getSunset(); // Replace with your actual timestamp

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date sunriseDate = new Date(sunriseTimestamp * 1000L);
        Date sunsetDate = new Date(sunsetTimestamp * 1000L);

        String formattedSunrise = sdf.format(sunriseDate);
        String formattedSunset = sdf.format(sunsetDate);


        System.out.println("Sunrise time : "+formattedSunrise);
        System.out.println("Sunset time : "+formattedSunset);

        System.out.println("code "+ weather.getCod());
    }
    public static Weather throwWeatherInformation(String name) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder()
                .uri(new URI("https://api.openweathermap.org/data/2.5/weather?q="+name+"&appid=32cf7fc4ecb5506bcb0d513c18edb2b5"))
                .build();
        HttpResponse<String> response=client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());//body of the response
        Gson gson= new Gson();
        Weather weather = gson.fromJson(response.body(), Weather.class);

        System.out.println("temperature : "+weather.getMain().getTemp());
        System.out.println("description : "+weather.getWeather()[0].getDescription());
        System.out.println("Minimum temperature : "+weather.getMain().getTempMin());
        System.out.println("Maximum temperature : "+weather.getMain().getTempMax());
        System.out.println("Humidity : "+weather.getMain().getHumidity());
        System.out.println("Feels like temperature : "+weather.getMain().getFeelsLike());
        System.out.println("Pressure : "+weather.getMain().getPressure());
        System.out.println("Wind speed : "+weather.getWind().getSpeed());
        System.out.println("Wind degree : "+weather.getWind().getDeg());
        System.out.println("visibility : "+weather.getVisibility());



        long sunriseTimestamp = weather.getSys().getSunrise(); // Replace with your actual timestamp
        long sunsetTimestamp = weather.getSys().getSunset(); // Replace with your actual timestamp

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date sunriseDate = new Date(sunriseTimestamp * 1000L);
        Date sunsetDate = new Date(sunsetTimestamp * 1000L);

        String formattedSunrise = sdf.format(sunriseDate);
        String formattedSunset = sdf.format(sunsetDate);


        System.out.println("Sunrise time : "+formattedSunrise);
        System.out.println("Sunset time : "+formattedSunset);

        System.out.println("code "+ weather.getCod());

        return gson.fromJson(response.body(), Weather.class);

    }
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        try{
            WeatherInformation("Dehli");
        } catch (Exception e){
            System.out.println("problem found");
        }

    }
}

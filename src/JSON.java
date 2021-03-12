import com.example.WeatherData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSON {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "http://api.openweathermap.org/data/2.5/forecast?lat=48.9215&lon=24.7097&APPID=a17a1c41a27a1c5560aa675c81bd1b2d";

    public static void main(String[] args) throws IOException {
        sendGET();
        System.out.println("GET DONE");
    }

    private static void sendGET() throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            Gson gson = (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().create();
            WeatherData wdata = (WeatherData) gson.fromJson(response.toString(), WeatherData.class);
        } else {
            System.out.println("GET request not worked");
        }
    }




}
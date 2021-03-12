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

    public static String sendGET() throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        String r="";
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            Gson gson = (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().create();
            WeatherData wdata = (WeatherData) gson.fromJson(response.toString(), WeatherData.class);
            for (int i = 0; i < 40; i++) {
               // System.out.println(wdata.getList().get(i).getDtTxt());

            }
            //System.out.println(response.toString());
            r = response.toString();
            //System.out.println(r);
        } else {
            System.out.println("GET request not worked");
        }
        return r;
    }

    public static WeatherData fromJson(String jsonText){
        WeatherData response= new Gson().fromJson(jsonText,WeatherData.class);
        return response;
    }
}
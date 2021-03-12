import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSON {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL_1 = "http://api.openweathermap.org/data/2.5/forecast?q=";
    private static final String GET_URL_2 = "&APPID=a17a1c41a27a1c5560aa675c81bd1b2d";

    public static String sendGET(String city) throws IOException {
        URL obj = new URL(GET_URL_1 + city + GET_URL_2);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        String r = "";
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            r = response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        return r;
    }
}
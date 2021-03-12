import com.example.WeatherData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static final int k = 40;

    public static void main(String[] args) throws IOException {
        String city;
        FileReader read = null;
        try {
            read = new FileReader("D:\\Studying\\Java\\lab3\\src\\Cities.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Scanner scanner = new Scanner(read);
            while (scanner.hasNextLine()) {
                city = scanner.nextLine();
                System.out.println(city);
                String text = JSON.sendGET(city);
                Gson gson = (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().create();
                WeatherData data = gson.fromJson(text, WeatherData.class);
                int a = 0;
                System.out.println();
                for (int i = 0; i < k; i++) {
                    if ((a % 8) == 0)
                        System.out.println();
                    System.out.println("......................................");
                    System.out.println(data.getList().get(i).getDtTxt());
                    System.out.println("Temperature:\tmin: " + convertTemperature(data.getList().get(i).getMain().getTempMin()) + "\tmax: " + convertTemperature(data.getList().get(i).getMain().getTempMax()));
                    System.out.println(data.getList().get(i).getWeather().get(0).getMain());
                    a++;
                }
                System.out.println();
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            }
        } catch (Exception e)
        {
            System.out.println("Error");
        }
    }

    public static int convertTemperature(double t) {
        return (int)Math.round(t - 273.15);
    }
}

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
        String text = JSON.sendGET();
        System.out.println("------------------------");
        Gson gson = (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().create();
        WeatherData wdata = (WeatherData) gson.fromJson(text, WeatherData.class);
        for (int i = 0; i < 40; i++) {
            System.out.println(wdata.getList().get(i).getDtTxt());
        }

    }

    public static void city()
    {
        String city;
        FileReader read = null;
        try {
            read = new FileReader("cities.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(read);
        city = scanner.nextLine();
    }
}

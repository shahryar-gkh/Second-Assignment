import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.util.Scanner;

public class WeatherApp {
    public final static String apiKey = "999b105d955b48abb83173447232802";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        JSONObject weatherJson = new JSONObject(getWeatherData(city));
        System.out.println("Temperature: " + getTemperature(weatherJson));
        System.out.println("Humidity: " + getHumidity(weatherJson));
        System.out.println("Wind Speed: " + getWindSpeed(weatherJson));
        System.out.println("Wind Direction: " + getWindDirection(weatherJson));
    }
    public static String getWeatherData(String city) {
        try {
            URL url = new URL("http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + city);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static double getTemperature(JSONObject weatherJson){
        JSONObject current = weatherJson.getJSONObject("current");
        double answer = current.getDouble("temp_c");
        return answer;
    }

    public static int getHumidity(JSONObject weatherJson){
        JSONObject current = weatherJson.getJSONObject("current");
        int answer = current.getInt("humidity");
        return answer;
    }

    public static double getWindSpeed(JSONObject weatherJson){
        JSONObject current = weatherJson.getJSONObject("current");
        double answer = current.getDouble("wind_kph");
        return answer;
    }

    public static String getWindDirection(JSONObject weatherJson){
        JSONObject current = weatherJson.getJSONObject("current");
        String answer = current.getString("wind_dir");
        return answer;
    }
}
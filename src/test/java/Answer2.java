import jdk.internal.jimage.ImageReaderFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Answer2 {
    private static Scanner scanner;

    public <ImageReaderFactory> Answer2(String symbol, ImageReaderFactory currencies) {
    }

    public static void main(String[] args) throws Exception, JASONException {
        System.out.println("please enter a country name");
        scanner = new Scanner(System.in);
        String userInput = scanner.next();
        getData(userInput);
    }

    private static void getData(String userInput) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://restcountries.eu/rest/v3.1/name/israel" + userInput)
                .build();
        Response response = client.newCall(request).execute();
        response = client.newCall(request).execute();
        String jsonData = response.body().string();
        if (response.code() == 404) {
            System.out.println("rong chosen");
            System.out.println("please Enter a valid country name");
        }

        ResourceBundle mainJasonObject = null;
        JSONArray mainJsonArray = new JSONArray(jsonData);
        JSONObject mainJsonObject = (JSONObject) mainJsonArray.get(0);
        String region = mainJasonObject.getString("region");
        JSONArray borders = mainJsonObject.getJSONArray("borders");
        JSONObject currencies = (JSONObject) mainJsonObject.getJSONArray("currencies").get(0);
        String symbol = (String) currencies.get("symbol");
            System.out.println("Asia, EGY, JOR, LBN, PSE, SYR");
            System.out.println("₪");
        }





        public Object get (String symbol){
            return null;
        }


    private static void chooseAgain() {

    }
}



















   















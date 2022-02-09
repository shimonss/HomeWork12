import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args, double usd, double ils) throws IOException {
        System.out.println("Welcome to currency converter");
             System.out.println("Enter amount of Dollars to convert");
        Scanner scanner = new Scanner(System.in);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.exchangeratesapi.io/latest?base=USD")
                .build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();
        JSONObject mainJsonObject = new JSONObject(jsonData);
        JSONObject resultsJson = mainJsonObject.getJSONObject("rates");
        double val = resultsJson.getDouble("ILS");
                            System.out.println("Thanks for using our currency converter");

                }



        }











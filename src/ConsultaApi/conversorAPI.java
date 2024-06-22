package ConsultaApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class conversorAPI {
    

    public double getMoneda(String monedaBase, String monedaDestino, double cantidad) {
        

        String url = "https://v6.exchangerate-api.com/v6/07481389409f5b4449cddd15/pair/" + monedaBase + "/" + monedaDestino + "/" + cantidad;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            
            JsonObject obj = new Gson().fromJson(json, JsonObject.class);
            Double result = obj.get("conversion_result").getAsDouble();
            
            return result;
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
    return 0; 
        
    }
    
}



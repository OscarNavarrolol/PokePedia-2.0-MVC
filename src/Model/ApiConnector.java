package Model;

import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.JSONArray;


public class ApiConnector {
    
    private static final String API_BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    
  // Method to fetch data from the specified API URL  
    private String fetchData(String apiUrl) throws IOException {
        // Logic to make an HTTP request and retrieve data from the API
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            try (InputStream inputStream = connection.getInputStream();
                    Scanner scanner = new Scanner(inputStream)) {

                while (scanner.hasNextLine()) {
                    result.append(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error in get API: " + e);
            throw new IOException("Error in get API", e);
        }

        return result.toString();
    }  
    
    // Retrieves the name of a Pokemon by its index
    public String getPokemonName(int index) {
        // Fetches data and extracts the name of the Pokemon
        String apiUrl = API_BASE_URL + index;
        String name = "";

        try {
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);
            name = jsonObject.getString("name");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return name;
    }
    
    // Retrieves the types of a Pokemon by its index
    public List<String> getPokemonTypes(int index) {
        // Fetches data and extracts the types of the Pokemon
        String apiUrl = API_BASE_URL + index;
        List<String> types = new ArrayList<>();

        try {
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);

            // Obtener tipos del Pokémon 
            JSONArray typesArray = jsonObject.getJSONArray("types");
            for (int i = 0; i < typesArray.length(); i++) {
                JSONObject typeObject = typesArray.getJSONObject(i);
                String typeName = typeObject.getJSONObject("type").getString("name");
                types.add(typeName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return types;
    }
    
    // Retrieves the index of a Pokemon by its name
    public int getPokemonIndexByName(String name) {
        // Fetches data and extracts the index of the Pokemon by name
        int index = -1;
        if (!name.matches("[a-zA-Z]+")) {
        throw new IllegalArgumentException("The Pokémon name must contain only alphabetical characters.");
        }

        try {
            String apiUrl = API_BASE_URL + name;
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);
            index = jsonObject.getInt("id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return index;
        }
    
    // Retrieves the image URL of a Pokemon by its index
    public String getPokemonImage(int index) {
        // Fetches data and extracts the image URL of the Pokemon
        String apiUrl = API_BASE_URL + index;
        String imageUrl = "";

        try {
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);

            //imagen del sprite frontal del Pokémon
            JSONObject sprites = jsonObject.getJSONObject("sprites");
            imageUrl = sprites.getString("front_default");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return imageUrl;
    }
    
     // Retrieves the abilities of a Pokemon by its index
    public List<String> getPokemonAbilities (int index) {
        
        // Fetches data and extracts the abilities of the Pokemon
        String apiUrl = API_BASE_URL + index;
        List<String> abilities = new ArrayList<>();

        try {
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);

            // get abilities of pokemon
            JSONArray abilitiesArray = jsonObject.getJSONArray("abilities");
            for (int i = 0; i < abilitiesArray.length(); i++) {
                JSONObject abilityObject = abilitiesArray.getJSONObject(i);
                String abilityName = abilityObject.getJSONObject("ability").getString("name");
                abilities.add(abilityName);
            } 

        } catch (Exception e) {
            e.printStackTrace();
        }

        return abilities;
    
    }
    
    

}

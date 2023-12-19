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
import org.json.JSONArray;


public class ApiConnector {
    
    
  private String fetchData(String apiUrl) throws IOException {
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
            e.printStackTrace();
            throw e; // no recuerdo pa que pero importa
        }

        return result.toString();
    }
  
  public String getPokemonData(int numberOfPokemon) {
        // URL de la PokeAPI 
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/?limit=" + numberOfPokemon;

        StringBuilder result = new StringBuilder();

        try {
            //conexión HTTP
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurar
            connection.setRequestMethod("GET");

            // respuesta
            InputStream inputStream = connection.getInputStream();
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine());
            }

            scanner.close();
            inputStream.close();
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }  

    public String getPokemonName(int index) {
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + index;
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
    
    public List<String> getPokemonTypes(int index) {
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + index;
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
    
    public int getPokemonIndexByName(String name) {
    int index = -1;

    try {
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + name;
        String result = fetchData(apiUrl);
        JSONObject jsonObject = new JSONObject(result);
        index = jsonObject.getInt("id");
    } catch (Exception e) {
        e.printStackTrace();
    }
    return index;
    }
    
    public String getPokemonImage(int index) {
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + index;
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
    
    
    public List<String> getPokemonAbilities (int index) {
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + index;
        List<String> abilities = new ArrayList<>();

        try {
            String result = fetchData(apiUrl);
            JSONObject jsonObject = new JSONObject(result);

            // Obtener habilidades del Pokémon
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

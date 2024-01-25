
package Controller;
import Model.*;
import View.*;
import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller class managing interactions between the Model (Pokemon data) and View (User interface).
 */

public class PokemonController {
    private ApiConnector apiConnector;
    private PrincipalPoke principalPoke;
    // Initial index. DO NOT MODIFY
    private String nameLabel;
    private String  typeLabel;
    private String imgLabel;
    
    private static final Map<String, Color> typeColorMap = initializeTypeColorMap();
    
    public PokemonController(ApiConnector apiConnector, PrincipalPoke principalPoke, String nameLabel, String typeLabel, String imgLabel) {
    // Initializing components and API connector
        this.apiConnector = apiConnector;
        this.principalPoke = principalPoke;
        this.nameLabel = nameLabel; 
        this.typeLabel = typeLabel; 
        this.imgLabel = imgLabel;   
        ApiConnector api = new ApiConnector();
    }
    
    // Searches Pokemon by name
    public void searchPokemonByName(String name) throws MalformedURLException {
        // Retrieves Pokemon index by name and displays information
        try {
            int index = apiConnector.getPokemonIndexByName(name);
        principalPoke.currentPokemonIndex = index;
        if (index != -1) {

            Pokemon pokemon = showPokemonInfo(index); 
            principalPoke.displayPokemonInfo(pokemon);
            
        } else {
           
            System.out.println("pokemon not found");
        }
            
        } catch (MalformedURLException e) {
            JOptionPane.showMessageDialog(null, "Error :( ");
            e.printStackTrace();
        }
        
    }
    
    // Searches Pokemon by code
    public void searchCodePoke (int codePok) throws MalformedURLException{
        // Searches and displays Pokemon information by code
        int index = codePok;
        try {
            
            showPokemonInfo(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    // Retrieves and displays Pokemon information
    public Pokemon showPokemonInfo(int index) throws MalformedURLException {
    // Retrieves Pokemon details and creates a Pokemon object
        
        String name = apiConnector.getPokemonName(index);
        List<String> types = apiConnector.getPokemonTypes(index);
        String imageUrl = apiConnector.getPokemonImage(index);
        List<String> abilities = apiConnector.getPokemonAbilities(index);

        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setTypes(types);
        pokemon.setImageUrl(imageUrl);
        pokemon.setAbilities(abilities);

        try {
            ImageIcon icon = new ImageIcon(new URL(imageUrl));
            Image image = icon.getImage();
            int newWidth = image.getWidth(null) * 2;
            int newHeight = image.getHeight(null) * 2;
            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            pokemon.setPokemonImage(scaledImage);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return pokemon;
    }

    // Gets color based on Pokemon type
    private static Map<String, Color> initializeTypeColorMap() {
        Map<String, Color> map = new HashMap<>();
        map.put("fire", Color.ORANGE);
        map.put("water", Color.CYAN);
        map.put("grass", Color.GREEN.darker().darker());
        map.put("normal", new Color(160, 160, 160));
        map.put("flying", new Color(135, 206, 235));
        map.put("fighting", new Color(205, 92, 92));
        map.put("poison", new Color(138, 43, 226));
        map.put("electric", Color.YELLOW.darker().darker());
        map.put("ground", new Color(139, 69, 19));
        map.put("rock", new Color(169, 169, 169));
        map.put("psychic", new Color(186, 85, 211));
        map.put("ice", new Color(135, 206, 250));
        map.put("bug", new Color(154, 205, 50));
        map.put("ghost", new Color(128, 0, 128));
        map.put("steel", new Color(192, 192, 192));
        map.put("dragon", new Color(70, 130, 180));
        map.put("dark", new Color(47, 79, 79));
        map.put("fairy", new Color(255, 182, 193));
        return map;
    }
    
     public Color getColorForType(String type) {
        return typeColorMap.getOrDefault(type.toLowerCase(), Color.BLACK);
    }
     
    
}

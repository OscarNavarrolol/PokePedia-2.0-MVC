
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
    public Color getColorForType(String type) {
        // Returns a color based on the Pokemon's type
        switch (type.toLowerCase()) {
            case "fire":
                return Color.ORANGE; 
            case "water":
                return Color.CYAN; 
            case "grass":
                return Color.GREEN.darker().darker(); 
            case "normal":
                return new Color(160, 160, 160); 
            case "flying":
                return new Color(135, 206, 235); 
            case "fighting":
                return new Color(205, 92, 92); 
            case "poison" :
                return new Color(138, 43, 226); 
            case "electric":
                return Color.YELLOW.darker().darker(); 
            case "ground":
                return new Color(139, 69, 19); 
            case "rock":
                return new Color(169, 169, 169); 
            case "psychic":
                return new Color(186, 85, 211); 
            case "ice":
                return new Color(135, 206, 250); 
            case "bug":
                return new Color(154, 205, 50); 
            case "ghost":
                return new Color(128, 0, 128); 
            case "steel":
                return new Color(192, 192, 192); 
            case "dragon":
                return new Color(70, 130, 180); 
            case "dark":
                return new Color(47, 79, 79); 
            case "fairy":
                return new Color(255, 182, 193); 
            default:
                return Color.BLACK; // default
        }
    }
    
}

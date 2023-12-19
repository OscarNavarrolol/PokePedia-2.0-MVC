/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Image;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class Pokemon {
    private String name;
    private List<String> types;
    private String imageUrl;
    private List<String> abilities;
    private Image pokemonImage; // Campo para almacenar la imagen

    public Pokemon() {
    }
    
    

    public Pokemon(String name, List<String> types, String imageUrl, List<String> abilities,Image pokemonImage) {
        this.name = name;
        this.types = types;
        this.imageUrl = imageUrl;
        this.abilities = abilities;
        this.pokemonImage = pokemonImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }    
    
    public Image getPokemonImage() {
        return pokemonImage;
    }
    
    public void setPokemonImage(Image pokemonImage) {
        this.pokemonImage = pokemonImage;
    }
    
}

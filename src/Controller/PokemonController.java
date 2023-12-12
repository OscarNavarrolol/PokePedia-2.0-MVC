/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import View.*;

/**
 *
 * @author USUARIO
 */
public class PokemonController {
    private ApiConnector apiConnector;
    private PrincipalPoke principalPoke;

    public PokemonController(ApiConnector apiConnector, PrincipalPoke principalPoke) {
        this.apiConnector = apiConnector;
        this.principalPoke = principalPoke;
    }
    
    public void searchPokemonByName(String name) {
        int index = apiConnector.getPokemonIndexByName(name);
        if (index != -1) {
            showPokemonInfo(index);
        } else {
            //  no se encuentra
            System.out.println("Pokémon no encontrado");
        }
    }
    
     // Método para mostrar la información del Pokémon en la vista
    private void showPokemonInfo(int index) {
        // lohica para obtener datos del modelo (ApiConnector) y actualizar la vista
        // Actualizar la interfaz grafica de PrincipalPoke con la info obtenida
    }

    
}

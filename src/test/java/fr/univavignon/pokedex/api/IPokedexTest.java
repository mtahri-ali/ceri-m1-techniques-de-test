package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IPokedexTest extends TestCase {


    IPokedex pokedex;
    Pokemon bulbizarre;
    Pokemon aquali;
    ArrayList<Pokemon> pokemons;
    IPokedex test;
    public static List<Pokemon> pokedex1;
    @Before
    public void init() {
        pokedex1 = new ArrayList<Pokemon>();
        pokedex = Mockito.mock(IPokedex.class);
        // Initialisation des Pokymons
        bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56.0);
        aquali = new Pokemon(133, "Aquali", 186, 186, 260, 2729, 202, 5000, 4, 100.0);
       //pokemons = new ArrayList<>(0);
       // ArrayList<Pokemon> pokemons = null;

        // Ajout des pokymons à la liste
        pokemons.add(bulbizarre);
        pokemons.add(aquali);


    }
    @Test
    void size() {
        Mockito.doReturn(pokemons.size()).when(pokedex).size();
        // Verification de la taille de liste est bien 2
        Assert.assertEquals(2, pokedex.size());
    }



    public void testAddPokemon() {
        //Création instance pokemon1
        Pokemon pokemon1 = new Pokemon(0, "Bulbizarre" , 126, 126, 90, 613, 64, 4000, 4, 56);

        //Création instance pokemon2
        Pokemon pokemon2 = new Pokemon(133, "Aquali" , 186, 168, 260, 2729, 202, 5000, 4, 100);

        pokedex1.add(pokemon1);
        pokedex1.add(pokemon2);

        when(test.addPokemon(pokemon1)).thenReturn(pokemon1.getIndex());
        when(test.addPokemon(pokemon2)).thenReturn(pokemon2.getIndex());

        assertEquals(test.addPokemon(pokemon1), 0);
        assertEquals(test.addPokemon(pokemon2), 133);
    }

    @Test
    public void testGetPokemon() {

    }

    public void testGetPokemons() {
    }

    public void testTestGetPokemons() {
    }
}
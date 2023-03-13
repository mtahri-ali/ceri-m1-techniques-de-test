package fr.univavignon.pokedex.api;


import org.junit.Test;


import static org.mockito.Mockito.when;

import java.util.List;


import static org.junit.Assert.*;

public class IPokedexTest {
    public static List<Pokemon> pokedex1;
    IPokedex test;




    @Test
    public void size() {
        addPokemon();
        IPokedex pokedex1 = null;
        when(test.size()).thenReturn(pokedex1.size());
        assertEquals(test.size(), 2);
    }

    @Test
    public void addPokemon() {
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
    public void getPokemon() {
        
    }



    @Test
    public void testGetPokemons() {
    }
}
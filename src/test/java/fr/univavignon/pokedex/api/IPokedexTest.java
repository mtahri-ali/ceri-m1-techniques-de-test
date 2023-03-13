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

    }



    @Test
    public void getPokemon() {
        
    }



    @Test
    public void testGetPokemons() {
    }
}
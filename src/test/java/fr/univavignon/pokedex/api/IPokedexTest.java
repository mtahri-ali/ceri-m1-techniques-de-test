package fr.univavignon.pokedex.api;



import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.Comparator;
import java.util.List;


import static org.junit.Assert.*;


public class IPokedexTest {
    public static List<Pokemon> pokedex1;
    IPokedex test;


    IPokedex pokedex = new IPokedex() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public int addPokemon(Pokemon pokemon) {
            return 0;
        }

        @Override
        public Pokemon getPokemon(int id) throws PokedexException {
            return null;
        }

        @Override
        public List<Pokemon> getPokemons() {
            return null;
        }

        @Override
        public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
            return null;
        }

        @Override
        public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
            return null;
        }

        @Override
        public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
            return null;
        }
    };


    @Test
    void size() {
        assert(pokedex.size() == 0);
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
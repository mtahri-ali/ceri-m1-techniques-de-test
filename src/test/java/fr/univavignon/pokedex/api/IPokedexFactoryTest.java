package fr.univavignon.pokedex.api;

import org.junit.Test;

import static org.junit.Assert.*;

public class IPokedexFactoryTest {

    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp(){
        this.pokedexFactory = Mockito.mock(IPokedexFactory.class);

    }

    @Test
    @Tag("Pokedex")
    @DisplayName("Creates a new pokedex instance using the given")
    public void CreatePokedexTest(){

        IPokemonMetadataProvider pokemonMetadataProvider= Mockito.mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);


        Mockito.doReturn(Mockito.mock(IPokedex.class)).when(this.pokedexFactory).createPokedex(Mockito.any(pokemonMetadataProvider.getClass()),Mockito.any(pokemonFactory.getClass()));


        IPokedex mockPokedex = Mockito.mock(IPokedex.class);
        IPokedex createdPokedex = pokedexFactory.createPokedex(Mockito.mock(IPokemonMetadataProvider.class), Mockito.mock(IPokemonFactory.class));

        //use of AssertJ in Junit5
        assertThat(createdPokedex.getClass()).isEqualTo(mockPokedex.getClass());

    }
}
package com.distribucion.libreria;

import com.distribucion.model.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AutorTest {

    @Test
    public void testCrearAutor() {

        Autor autor = new Autor();

        autor.setId(1L);
        autor.setNombre("Gabriel Garcia Marquez");
        autor.setNacionalidad("Colombiano");

        assertEquals(1L, autor.getId());
        assertEquals("Gabriel Garcia Marquez", autor.getNombre());
        assertEquals("Colombiano", autor.getNacionalidad());
    }

    @Test
    public void testAutorNoNulo() {

        Autor autor = new Autor();

        assertNotNull(autor);
    }
}
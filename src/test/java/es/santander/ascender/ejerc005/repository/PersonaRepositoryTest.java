package es.santander.ascender.ejerc005.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc005.models.Persona;
import es.santander.ascender.ejerc005.repositories.PersonaRepository;

@SpringBootTest
public class PersonaRepositoryTest {

    @Autowired
    private PersonaRepository repository;

    @Test
    public void testCreate() {
        Persona persona = new Persona();
        persona.setName("Bob");
        persona.setSurname("Bobo");
        persona.setProvinciaId(13);


        

    }

}

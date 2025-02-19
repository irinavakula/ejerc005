package es.santander.ascender.ejerc005.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc005.models.Persona;
import java.util.List;

import es.santander.ascender.ejerc005.repositories.PersonaRepository;


@Service
public class PersonaService {

   @Autowired
    private PersonaRepository personaRepository;

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    public Persona retrievePersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public List<Persona> retrieveAllPersonas() {
        return personaRepository.findAll();
    }

     public Persona updatePersona(Long id, Persona persona) {
        if (personaRepository.existsById(id)) {
           persona.setId(id);
           return this.savePersona(persona);
        }
        throw new RuntimeException("Couldn't find persona with id " + id);
    }
}

package es.santander.ascender.ejerc005.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import es.santander.ascender.ejerc005.sevices.PersonaService;
import es.santander.ascender.ejerc005.models.Persona;


@RestController
@RequestMapping("/api/personas")
public class PersonaController {
   
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona create(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @GetMapping("/{id}")
    public Persona retrieve(@PathVariable("id") Long id) {
        return personaService.retrievePersona(id);
    }

    @PutMapping("/{id}") 
    public Persona update(@PathVariable("id") Long id, @RequestBody Persona persona) {
        return personaService.updatePersona(id, persona);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return "deleted";
    }

    @GetMapping
    public List<Persona> list() {
        return personaService.retrieveAllPersonas();
    }
}

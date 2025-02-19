package es.santander.ascender.ejerc005.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.santander.ascender.ejerc005.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}

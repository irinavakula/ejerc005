package es.santander.ascender.ejerc005.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc005.repositories.ProvinciaRepository;
import es.santander.ascender.ejerc005.models.Provincia;
import java.util.List;

@Service
public class ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public Provincia saveProvincia(Provincia provincia) {
        return provinciaRepository.save(provincia);
    }

    public void deleteProvincia(Long id) {
        provinciaRepository.deleteById(id);
    }

    public Provincia retrieveProvincia(Long id) {
        return provinciaRepository.findById(id).orElse(null);
    }

    public List<Provincia> retrieveAllProvincias() {
        return provinciaRepository.findAll();
    }

    public Provincia updateProvincia(Long id, Provincia provincia) {
        if (provinciaRepository.existsById(id)) {
           provincia.setId(id);
           return this.saveProvincia(provincia);
        }
        throw new RuntimeException("Couldn't find provincia with id " + id);
    }


}

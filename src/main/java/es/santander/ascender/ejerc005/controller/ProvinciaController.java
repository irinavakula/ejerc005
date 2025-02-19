package es.santander.ascender.ejerc005.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

import es.santander.ascender.ejerc005.models.Provincia;
import es.santander.ascender.ejerc005.sevices.ProvinciaService;


@RestController
@RequestMapping("/api/provincias")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;
        
    @PostMapping
    public Provincia create(@RequestBody Provincia provincia) {
        return provinciaService.saveProvincia(provincia);
    }

    @GetMapping("/{id}")
    public Provincia retrieve(@PathVariable("id") Long id) {
        return provinciaService.retrieveProvincia(id);
    }

    @PutMapping("/{id}")
    public Provincia update(@PathVariable("id") Long id, @RequestBody Provincia provincia) {
        return provinciaService.updateProvincia(id, provincia);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        provinciaService.deleteProvincia(id);
        return "deleted";
    }

    @GetMapping
    public List<Provincia> list() {
        return provinciaService.retrieveAllProvincias();
    }


}

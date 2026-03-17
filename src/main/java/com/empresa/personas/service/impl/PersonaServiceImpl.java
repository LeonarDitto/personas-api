
package com.empresa.personas.service.impl;

import com.empresa.personas.dto.PersonaRequest;
import com.empresa.personas.model.Persona;
import com.empresa.personas.repository.PersonaRepository;
import com.empresa.personas.service.PersonaService;
import com.empresa.personas.exception.PersonaNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository repository;

    public PersonaServiceImpl(PersonaRepository repository){
        this.repository=repository;
    }

    @Override
    public Persona crearPersona(PersonaRequest request){

        Persona p = new Persona();
        p.setNombre(request.getNombre());
        p.setApellidoPaterno(request.getApellidoPaterno());
        p.setApellidoMaterno(request.getApellidoMaterno());
        p.setCorreo(request.getCorreo());
        p.setEdad(request.getEdad());

        return repository.save(p);
    }

    @Override
    public List<Persona> obtenerTodas(){
        return repository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new PersonaNotFoundException("Persona no encontrada"));
    }

    @Override
    public Persona actualizar(Long id, PersonaRequest request){

        Persona p = obtenerPorId(id);

        p.setNombre(request.getNombre());
        p.setApellidoPaterno(request.getApellidoPaterno());
        p.setApellidoMaterno(request.getApellidoMaterno());
        p.setCorreo(request.getCorreo());
        p.setEdad(request.getEdad());

        return repository.save(p);
    }

    @Override
    public void eliminar(Long id){

        Persona p = obtenerPorId(id);
        repository.delete(p);

    }
}

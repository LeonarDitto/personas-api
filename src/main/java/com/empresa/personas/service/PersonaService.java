
package com.empresa.personas.service;

import com.empresa.personas.model.Persona;
import com.empresa.personas.dto.PersonaRequest;
import java.util.List;

public interface PersonaService {

    Persona crearPersona(PersonaRequest request);

    List<Persona> obtenerTodas();

    Persona obtenerPorId(Long id);

    Persona actualizar(Long id, PersonaRequest request);

    void eliminar(Long id);

}

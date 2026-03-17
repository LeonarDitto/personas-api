package com.empresa.personas.controller;

import com.empresa.personas.service.PersonaService;
import com.empresa.personas.dto.PersonaRequest;
import com.empresa.personas.model.Persona;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Persona> crear(@Valid @RequestBody PersonaRequest request) {
        return ResponseEntity.ok(service.crearPersona(request));
    }

    @GetMapping
    public List<Persona> listar() {
        return service.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Persona obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Persona actualizar(@PathVariable Long id, @Valid @RequestBody PersonaRequest request) {
        return service.actualizar(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

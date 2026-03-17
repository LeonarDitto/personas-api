
package com.empresa.personas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private String apellidoPaterno;

    private String apellidoMaterno;

    @Column(nullable=false, unique=true)
    private String correo;

    @Column(nullable=false)
    private Integer edad;

    private LocalDateTime fechaRegistro;

    @PrePersist
    public void prePersist(){
        fechaRegistro = LocalDateTime.now();
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}

    public String getApellidoPaterno(){return apellidoPaterno;}
    public void setApellidoPaterno(String apellidoPaterno){this.apellidoPaterno=apellidoPaterno;}

    public String getApellidoMaterno(){return apellidoMaterno;}
    public void setApellidoMaterno(String apellidoMaterno){this.apellidoMaterno=apellidoMaterno;}

    public String getCorreo(){return correo;}
    public void setCorreo(String correo){this.correo=correo;}

    public Integer getEdad(){return edad;}
    public void setEdad(Integer edad){this.edad=edad;}

    public LocalDateTime getFechaRegistro(){return fechaRegistro;}
}

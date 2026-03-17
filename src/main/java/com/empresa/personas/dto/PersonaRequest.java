
package com.empresa.personas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PersonaRequest {

    @NotBlank(message="nombre es obligatorio")
    private String nombre;

    @NotBlank(message="apellidoPaterno es obligatorio")
    private String apellidoPaterno;

    private String apellidoMaterno;

    @Email(message="correo invalido")
    @NotBlank(message="correo es obligatorio")
    private String correo;

    @Min(value=0, message="edad no puede ser negativa")
    private Integer edad;

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
}

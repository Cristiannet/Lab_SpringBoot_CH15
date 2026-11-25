package co.cuerpoactivo.cuerpo_activo_api.dto;

import co.cuerpoactivo.cuerpo_activo_api.model.Plan;
import co.cuerpoactivo.cuerpo_activo_api.model.Socio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SocioRequest(
        @NotBlank(message = "El nombre del socio es obligatorio") String nombre,
        @NotNull(message = "El plan es obligatorio") Long planId) {

    public Socio aEntidad(Plan plan) {
        return new Socio(null, nombre, plan);
    }
}

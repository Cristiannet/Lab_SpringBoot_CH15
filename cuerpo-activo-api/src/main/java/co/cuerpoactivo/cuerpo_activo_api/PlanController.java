package co.cuerpoactivo.cuerpo_activo_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planes")
public class PlanController {

    private final PlanService service;

    public PlanController(PlanService service) {
        this.service = service;
    }

    @GetMapping
    public List<Plan> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plan> porId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Plan> crear(@RequestBody Plan plan) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.crear(plan));
    }
}

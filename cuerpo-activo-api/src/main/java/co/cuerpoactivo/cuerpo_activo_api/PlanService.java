package co.cuerpoactivo.cuerpo_activo_api;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    private final PlanRepository repository;

    public PlanService(PlanRepository repository) {
        this.repository = repository;
    }

    public List<Plan> listar() {
        return repository.findAll();
    }

    public Optional<Plan> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Plan crear(Plan plan) {
        plan.setId(null); // el servidor asigna el id; se ignora el del cliente
        return repository.save(plan);
    }
}

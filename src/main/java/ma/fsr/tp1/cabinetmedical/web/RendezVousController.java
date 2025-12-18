package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.service.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/RendezVous")
public class RendezVousController {

    @Autowired
    private RendezVousService service;

    @GetMapping
    public List<RendezVous> getAll() {
        return service.findAll();
    }

    @PostMapping
    public RendezVous create(@RequestBody RendezVous r) {
        return service.save(r);
    }
}

package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medecins")
public class MedecinController {

    @Autowired
    private MedecinService service;

    @GetMapping
    public List<Medecin> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Medecin create(@RequestBody Medecin m) {
        return service.save(m);
    }
}

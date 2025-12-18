package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Consultation;
import ma.fsr.tp1.cabinetmedical.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService service;

    @GetMapping
    public List<Consultation> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Consultation create(@RequestBody Consultation c) {
        return service.save(c);
    }
}

package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping
    public List<Patient> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Patient create(@RequestBody Patient p) {
        return service.save(p);
    }
}

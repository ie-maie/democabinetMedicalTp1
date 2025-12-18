package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public Patient save(Patient p) {
        return repo.save(p);
    }

    public List<Patient> findAll() {
        return repo.findAll();
    }
}

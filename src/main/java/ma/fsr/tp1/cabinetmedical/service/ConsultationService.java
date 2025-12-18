package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Consultation;
import ma.fsr.tp1.cabinetmedical.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository repo;

    public Consultation save(Consultation p) {
        return repo.save(p);
    }

    public List<Consultation> findAll() {
        return repo.findAll();
    }
}


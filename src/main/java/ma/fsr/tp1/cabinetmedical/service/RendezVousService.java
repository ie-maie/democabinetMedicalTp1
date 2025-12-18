package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RendezVousService {

    @Autowired
    private RendezVousRepository repo;

    public RendezVous save(RendezVous p) {
        return repo.save(p);
    }

    public List<RendezVous> findAll() {
        return repo.findAll();
    }
}


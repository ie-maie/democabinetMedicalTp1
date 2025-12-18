package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedecinService {

    @Autowired
    private MedecinRepository repo;

    public Medecin save(Medecin p) {
        return repo.save(p);
    }

    public List<Medecin> findAll() {
        return repo.findAll();
    }
}


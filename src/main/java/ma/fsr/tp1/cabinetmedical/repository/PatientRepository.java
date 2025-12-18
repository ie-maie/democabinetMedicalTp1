package ma.fsr.tp1.cabinetmedical.repository;


import ma.fsr.tp1.cabinetmedical.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

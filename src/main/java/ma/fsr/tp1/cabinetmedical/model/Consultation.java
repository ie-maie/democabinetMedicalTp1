package ma.fsr.tp1.cabinetmedical.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import ma.fsr.tp1.cabinetmedical.model.RendezVous;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consultation {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate dateConsultation;
    private String rapport;

    @OneToOne
    private RendezVous rendezVous;
}


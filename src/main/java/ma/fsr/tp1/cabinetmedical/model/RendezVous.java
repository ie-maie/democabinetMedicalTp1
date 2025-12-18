package ma.fsr.tp1.cabinetmedical.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RendezVous {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate dateRdv;
    private String statut;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medecin medecin;
}


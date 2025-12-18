
-- Patients

INSERT INTO PATIENT (id, nom, date_naissance, genre, telephone)
VALUES (1, 'Sara El Amrani', '2000-05-12', 'F', '0612345678');

INSERT INTO PATIENT (id, nom, date_naissance, genre, telephone)
VALUES (2, 'Youssef Benali', '1999-03-20', 'M', '0623456789');


-- Medecin

INSERT INTO MEDECIN (id, nom, specialite, email)
VALUES (1, 'Dr Amina Zahra', 'Cardiologie', 'amina.zahra@cabinet.ma');

INSERT INTO MEDECIN (id, nom, specialite, email)
VALUES (2, 'Dr Karim Haddad', 'Dermatologie', 'karim.haddad@cabinet.ma');


-- Rendez-vous

INSERT INTO RENDEZ_VOUS (id, date_rdv, statut, patient_id, medecin_id)
VALUES (1, '2025-01-10', 'CONFIRME', 1, 1);

INSERT INTO RENDEZ_VOUS (id, date_rdv, statut, patient_id, medecin_id)
VALUES (2, '2025-01-12', 'EN_ATTENTE', 2, 2);


-- Consultations

INSERT INTO CONSULTATION (id, date_consultation, rapport, rendez_vous_id)
VALUES (1, '2025-01-10', 'Consultation générale, état stable.', 1);

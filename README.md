# TP Cabinet Medical - Rapport

## 1. Introduction

Ce projet est un TP de mise en œuvre d’une application Spring Boot pour la gestion d’un cabinet médical.  
L’objectif principal était de créer une API REST pour gérer les entités suivantes : `Patient`, `Medecin`, `RendezVous` et `Consultation`.  

L’application utilise **Spring Boot 4.0**, **H2 en mémoire** pour la base de données, et les endpoints sont testés via le navigateur.

---

## 2. Endpoints REST créés

Voici la liste des endpoints REST exposés par l’application :

| Méthode | Endpoint                 | Description                                  |
|---------|--------------------------|----------------------------------------------|
| GET     | `/patients`              | Récupère la liste de tous les patients       |
| POST    | `/patients`              | Ajoute un nouveau patient                    |
| GET     | `/medecins`              | Récupère la liste des médecins               |
| POST    | `/medecins`              | Ajoute un nouveau médecin                    |
| GET     | `/rendezvous`            | Récupère tous les rendez-vous                |
| POST    | `/rendezvous`            | Crée un nouveau rendez-vous                  |
| GET     | `/consultations`         | Récupère toutes les consultations            |
| POST    | `/consultations`         | Ajoute une nouvelle consultation             |



---

## 3. Captures de tests

Voici quelques captures d’écran des tests réalisés :

### GET /patients
<img width="396" height="375" alt="image" src="https://github.com/user-attachments/assets/9c6b1c50-de29-4e83-b175-2ee413f82fd4" />


### POST /patients
<img width="393" height="487" alt="image" src="https://github.com/user-attachments/assets/82807462-2705-49d5-8f94-1a2918e40fd1" />


### GET /medecins
<img width="402" height="300" alt="image" src="https://github.com/user-attachments/assets/c3c98525-47b5-49c0-add6-552f18fc9e2c" />


### POST /medecins
<img width="427" height="435" alt="image" src="https://github.com/user-attachments/assets/d9b5faa9-a016-4ca1-bebd-9a413dc0c006" />


---




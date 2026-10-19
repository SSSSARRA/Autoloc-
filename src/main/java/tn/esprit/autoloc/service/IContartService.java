package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContartService {
    Contrat ajouterContrat (Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat afficherContratById( Long id);
    List< Contrat> afficherAllContrat();
    void supprimerContratt(Long id);
}

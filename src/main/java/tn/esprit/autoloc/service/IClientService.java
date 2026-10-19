package tn.esprit.autoloc.service;

import tn.esprit.autoloc.doamin.Client;

import java.util.List;

public interface IClientService {
    Client ajouterclient(Client client);
    Client modifierClient(Client client );
    Client afficherClientById( Long id);
    List<Client> afficherAllClient();
    void supprimerClient(Long id);
}


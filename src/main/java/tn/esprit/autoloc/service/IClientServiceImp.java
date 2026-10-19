package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.doamin.Client;
import tn.esprit.autoloc.repository.ClientRespository;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientServiceImp implements IClientService{
    private final ClientRespository clientRespository;
    @Override
    public Client ajouterclient(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public Client afficherClientById(Long id) {
        return clientRespository.findById(id).orElse(null);
    }

    @Override
    public List<Client> afficherAllClient() {
        return clientRespository.findAll();
    }

    @Override
    public void supprimerClient(Long id) {
        clientRespository.deleteById(id);

    }
}

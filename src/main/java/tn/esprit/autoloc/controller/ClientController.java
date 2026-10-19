package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {
    private final IClientService clientService;
    @GetMapping("/afficherTousClients")
    public List<Client> getAllClient(){
        return clientService.afficherAllClient();
    }
    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client){
        return clientService.ajouterClient(client);
    }
    @PutMapping("/modifierclient")
    public Client modifierClient(@RequestBody Client client){
        return clientService.modifierClient(client);
    }
    @GetMapping("/afficherClient/{id}")
    public Client afficheClient(@PathVariable Long id){
        return clientService.afficherClientById(id);
    }
    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id){
        clientService.supprimerClient(id);
    }
}
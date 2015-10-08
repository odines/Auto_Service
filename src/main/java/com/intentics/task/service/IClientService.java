package com.intentics.task.service;

import com.intentics.task.domain.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    Client getClientById(Integer id);

    void deleteClient(Integer id);

    Client editClient(Client client);

    Client getClientByNameSurname(String firstName, String lastName);

    List<Client> getAllClients();

}

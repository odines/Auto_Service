package com.intentics.task.service.impl;

import com.intentics.task.DAO.IClientDAO;
import com.intentics.task.domain.Client;
import com.intentics.task.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDAO clientDAO;

    @Override
    public Client addClient(Client client) {

        Client savedClient = clientDAO.saveAndFlush(client);
        return client;
    }

    @Override
    public Client getClientById(Integer id) {

        return clientDAO.findOne(id);
    }

    @Override
    public void deleteClient(Integer id) {
        clientDAO.delete(id);

    }

    @Override
    public Client editClient(Client client) {
        return clientDAO.saveAndFlush(client);
    }

    @Override
    public Client getClientByNameSurname(String firstName, String lastName) {
        return clientDAO.findByNameSurname(firstName, lastName);
    }

    @Override
    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }
}

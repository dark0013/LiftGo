package com.darkorss.LiftGo.service.impl;

import com.darkorss.LiftGo.exception.ClientsNotFound;
import com.darkorss.LiftGo.model.entity.Clients;
import com.darkorss.LiftGo.repository.IClientsRepository;
import com.darkorss.LiftGo.service.IClientsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class ClientsService implements IClientsService {
    @Autowired
    private final IClientsRepository clientsService;

    @Override
    public Clients findByEmail(String email) {
        return clientsService.findByEmail(email).orElseThrow(() -> new ClientsNotFound("Client with email " + email + " not found"));
    }

    @Override
    public Clients findByPhone(String phone) {
        return clientsService.findByPhone(phone).orElseThrow(() -> new ClientsNotFound("Client with phone " + phone + " not found"));
    }


    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public boolean existsByPhone(String phone) {
        return false;
    }

    @Override
    public  Clients saveClient(Clients client) {
        return clientsService.save(client);
    }

    @Override
    public Clients updateClient(Clients client) {
        return clientsService.save(client);
    }
}

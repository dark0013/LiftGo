package com.darkorss.LiftGo.service;

import com.darkorss.LiftGo.model.entity.Clients;

import java.util.Optional;

public interface IClientsService {
    Clients findByEmail(String email);
    Clients findByPhone(String phone);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
    Clients saveClient(Clients client);
    Clients updateClient(Clients client);
}

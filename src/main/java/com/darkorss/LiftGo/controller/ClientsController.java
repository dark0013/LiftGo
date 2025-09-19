package com.darkorss.LiftGo.controller;

import com.darkorss.LiftGo.mapper.IClientMapper;
import com.darkorss.LiftGo.model.dto.ClientsDto;
import com.darkorss.LiftGo.model.entity.Clients;
import com.darkorss.LiftGo.service.IClientsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/clients")
@AllArgsConstructor
public class ClientsController {
    @Autowired
    private final IClientsService clientsService;
    private final IClientMapper clientMapper;

    @GetMapping("/{mail}")
    public ResponseEntity<ClientsDto>  getClient(@PathVariable String mail) {
        ClientsDto client = clientMapper.toDto(clientsService.findByEmail(mail)); // clientsService.findByEmail(mail);
        return new ResponseEntity<>(client, OK);
    }

}

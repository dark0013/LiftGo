package com.darkorss.LiftGo.mapper;
import ch.qos.logback.core.net.server.Client;
import com.darkorss.LiftGo.model.dto.ClientsDto;
import com.darkorss.LiftGo.model.entity.Clients;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface IClientMapper {
    Clients toEntity(Client dto);
    ClientsDto toDto(Clients entity);
}

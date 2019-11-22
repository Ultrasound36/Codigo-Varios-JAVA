package com.metro.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.metro.backend.apirest.models.entity.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long> {

}

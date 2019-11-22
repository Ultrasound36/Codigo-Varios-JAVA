package com.metro.backend.apirest.models.services;

import java.util.List;
import com.metro.backend.apirest.models.entity.Cliente;


public interface IClienteService {
	
	public List<Cliente> findAll();

}
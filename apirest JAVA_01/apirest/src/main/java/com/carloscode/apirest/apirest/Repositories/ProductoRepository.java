package com.carloscode.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloscode.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

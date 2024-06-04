package com.apirest.fran.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.fran.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long > {


}

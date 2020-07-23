package com.empleados.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empleados.modelo.*;

@Repository
public interface IArea  extends CrudRepository<Area, Integer>{

}

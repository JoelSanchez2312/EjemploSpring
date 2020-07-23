package com.empleados.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.empleados.modelo.*;

public interface IAreaService {

	public List<Area>listar();
	public Optional<Area>listarId(int id);
	public int save(Area a);
	public void delete(int id);
}

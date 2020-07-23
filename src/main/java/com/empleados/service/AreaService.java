package com.empleados.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.interfaces.IArea;
import com.empleados.interfacesServices.IAreaService;
import com.empleados.modelo.Area;

@Service
public class AreaService implements IAreaService{
	@Autowired
	private IArea data;
	@Override
	public List<Area> listar() {
		return (List<Area>)data.findAll();
	}

	@Override
	public Optional<Area> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Area a) {
		int res=0;
		Area area = data.save(a);
		if(!area.equals(null))
			res=1;
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}
	
}

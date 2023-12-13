package com.bydan.colegio.estructura.alumno.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.estructura.alumno.domain.model.Alumno;

public interface AlumnoCrudRepositoryI extends CrudRepository<Alumno,Long>{
}

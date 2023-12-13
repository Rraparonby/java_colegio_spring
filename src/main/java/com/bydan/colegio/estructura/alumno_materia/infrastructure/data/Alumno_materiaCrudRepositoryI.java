package com.bydan.colegio.estructura.alumno_materia.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.estructura.alumno_materia.domain.model.Alumno_materia;

public interface Alumno_materiaCrudRepositoryI extends CrudRepository<Alumno_materia,Long>{
}

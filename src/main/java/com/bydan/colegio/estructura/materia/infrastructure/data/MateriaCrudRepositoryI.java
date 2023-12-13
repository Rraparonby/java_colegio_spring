package com.bydan.colegio.estructura.materia.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.estructura.materia.domain.model.Materia;

public interface MateriaCrudRepositoryI extends CrudRepository<Materia,Long>{
}

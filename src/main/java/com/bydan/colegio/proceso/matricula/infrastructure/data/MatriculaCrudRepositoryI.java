package com.bydan.colegio.proceso.matricula.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.proceso.matricula.domain.model.Matricula;

public interface MatriculaCrudRepositoryI extends CrudRepository<Matricula,Long>{
}

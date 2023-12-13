package com.bydan.colegio.proceso.nota.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.proceso.nota.domain.model.Nota;

public interface NotaCrudRepositoryI extends CrudRepository<Nota,Long>{
}

package com.fabiohideki.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiohideki.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}

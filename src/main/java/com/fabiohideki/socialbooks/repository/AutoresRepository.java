package com.fabiohideki.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiohideki.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}

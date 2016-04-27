package com.fabiohideki.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiohideki.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}

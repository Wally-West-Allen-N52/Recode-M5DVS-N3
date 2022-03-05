package com.tutorial.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}

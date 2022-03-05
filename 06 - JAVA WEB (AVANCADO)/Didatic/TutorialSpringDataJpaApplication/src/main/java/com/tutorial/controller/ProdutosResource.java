package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.Produto;
import com.tutorial.repositorios.Produtos;

@RestController
@RequestMapping("produtos")
public class ProdutosResource {

	@Autowired
	private Produtos produtos; // REPOSITÓRIOS DE PRODUTOS
	
	@GetMapping("/{id}")
	public Produto buscar(@PathVariable Long id) {
		return produtos.findOne(id);
	}
	
	@GetMapping
	public List<Produto> pesquisa() {
		return produtos.findAll();
	}
	
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtos.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtos.delete(id);
	}
}

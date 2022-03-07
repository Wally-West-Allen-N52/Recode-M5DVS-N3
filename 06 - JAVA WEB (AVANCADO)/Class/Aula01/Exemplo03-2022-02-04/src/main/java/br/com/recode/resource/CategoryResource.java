package br.com.recode.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.entities.Category;
import br.com.recode.repositories.CategoryRepository;

@RestController // CONTROLA REQUISIÇÕES: QUEM DEVE RECEBER E QUEM DEVE RESPONDER
@RequestMapping(value = "/categories") // MAPEA SOLICITAÕES WEB PARA CLASSES MANIPULADORAS ESECIFIICAS
public class CategoryResource {
	
	@Autowired // NOTAÇÃO INSTANCIA OBJ DA CLASSE
	private CategoryRepository categoryRepository;
	
	@GetMapping // CHAMA O MAPEAMENTO POR MÉTODO "FINDALL()"; MAPEAMENTO NA RAIZ/GERAL/TUDO
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> lista = categoryRepository.findAll();
	
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}") // CHAMA O MAPEAMENTO POR MÉTODO "FINDID()"; MAPEAMENTO APENAS POR ID
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		
		Category cat = categoryRepository.findById(id);
		
		return ResponseEntity.ok().body(cat);
	}

}

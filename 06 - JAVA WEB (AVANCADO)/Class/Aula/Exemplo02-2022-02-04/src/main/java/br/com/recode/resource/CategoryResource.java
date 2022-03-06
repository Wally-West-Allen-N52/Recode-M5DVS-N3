package br.com.recode.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.entities.Category;

@RestController // CONTROLA REQUISIÇÕES: QUEM DEVE RECEBER E QUEM DEVE RESPONDER
@RequestMapping(value = "/categories") // MAPEA SOLICITAÕES WEB PARA CLASSES MANIPULADORAS ESECIFIICAS
public class CategoryResource {
	
	@GetMapping // CHAMA O MAPEAMENTO POR MÉTODO "FINDALL()"; MAPEAMENTO NA RAIZ/GERAL/TUDO
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> lista = new ArrayList<Category>();
		
		lista.add(new Category(1L, "Cadernos"));
		lista.add(new Category(2L, "Livros"));
		lista.add(new Category(3L, "Bicicleta"));
	
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}") // CHAMA O MAPEAMENTO POR MÉTODO "FINDID()"; MAPEAMENTO APENAS POR ID
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		
		Category cat = new Category(1L, "Cadernos");
		
		return ResponseEntity.ok().body(cat);
	}

}

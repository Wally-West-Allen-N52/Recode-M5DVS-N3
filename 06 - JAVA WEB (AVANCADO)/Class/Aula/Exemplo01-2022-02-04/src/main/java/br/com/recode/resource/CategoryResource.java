package br.com.recode.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.entities.Category;

@RestController // CONTROLA REQUISIÇÕES: QUEM DEVE RECEBER E QUEM DEVE RESPONDER
@RequestMapping(value = "/categories") // MAPEA SOLICITAÕES WEB PARA CLASSES MANIPULADORAS ESECIFIICAS
public class CategoryResource {
	
	@GetMapping // CHAMA O MAPEAMENTO PARA "PUBLIC RESPONSEENTITY"'
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> lista = new ArrayList<Category>();
		
		lista.add(new Category(1L, "Cadernos"));
		lista.add(new Category(2L, "Livros"));
		lista.add(new Category(3L, "Bicicleta"));
		lista.add(new Category(4L, "Palito"));
		lista.add(new Category(5L, "Romano"));
		
		return ResponseEntity.ok().body(lista);
	}
	

}

package br.com.recode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.recode.entities.Category;
import br.com.recode.repositories.CategoryRepository;

@SpringBootApplication
public class Exemplo0120220204Application implements CommandLineRunner {

	@Autowired
	public CategoryRepository cataCategoryRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Exemplo0120220204Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(1L, "Cadernos");
		Category cat2 = new Category(2L, "Livros");
		
		cataCategoryRepository.save(cat1);
		cataCategoryRepository.save(cat2);
	}
}

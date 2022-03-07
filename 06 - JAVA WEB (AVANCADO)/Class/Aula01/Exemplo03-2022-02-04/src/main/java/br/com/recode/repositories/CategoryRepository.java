package br.com.recode.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.recode.entities.Category;

@Component
public class CategoryRepository {

	private Map<Long, Category> map = new HashMap<Long, Category>();
	
	public void save(Category obj) {
		map.put(obj.getIid(), obj);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}
}

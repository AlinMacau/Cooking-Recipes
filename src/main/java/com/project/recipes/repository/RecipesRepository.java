package com.project.recipes.repository;

import com.project.recipes.model.Category;
import com.project.recipes.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipesRepository extends JpaRepository<Recipe, Long>  {

	List<Recipe> findAllByOrderByModifiedDesc();
	List<Recipe> findAll();
//	List<Recipe> findById();
	List<Recipe> findByCategoryOrderByModifiedDesc(Category category);

}

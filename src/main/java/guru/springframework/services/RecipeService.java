package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author Maarten Casteels
 * @since 2021
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}

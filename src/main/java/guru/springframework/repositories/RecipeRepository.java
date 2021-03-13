package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Maarten Casteels
 * @since 2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

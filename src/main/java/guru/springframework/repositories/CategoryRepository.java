package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Maarten Casteels
 * @since 2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescriptionIgnoreCase(String description);
}

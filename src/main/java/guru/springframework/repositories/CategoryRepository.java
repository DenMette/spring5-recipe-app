package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Maarten Casteels
 * @since 2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}

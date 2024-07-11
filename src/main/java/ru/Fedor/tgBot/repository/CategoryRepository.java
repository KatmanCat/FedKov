package ru.Fedor.tgBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Fedor.tgBot.entity.Category;

@RepositoryRestResource(
        collectionResourceRel = "categories",
        path = "categories"
)

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}

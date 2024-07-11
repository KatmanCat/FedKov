package ru.Fedor.tgBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Fedor.tgBot.entity.Client;

@RepositoryRestResource(
        collectionResourceRel = "orderProducts",
        path = "orderProducts"
)

public interface OrderProductRepository extends JpaRepository<Client, Long>
{

}
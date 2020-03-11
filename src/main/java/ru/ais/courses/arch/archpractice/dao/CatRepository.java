package ru.ais.courses.arch.archpractice.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ais.courses.arch.archpractice.model.Cat;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {
}

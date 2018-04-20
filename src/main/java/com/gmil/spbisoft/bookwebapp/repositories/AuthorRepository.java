package com.gmil.spbisoft.bookwebapp.repositories;

import com.gmil.spbisoft.bookwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

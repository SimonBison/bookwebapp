package com.gmil.spbisoft.bookwebapp.repositories;

import com.gmil.spbisoft.bookwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

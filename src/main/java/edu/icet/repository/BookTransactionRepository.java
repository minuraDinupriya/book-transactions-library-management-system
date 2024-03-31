package edu.icet.repository;

import edu.icet.entity.BookTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookTransactionRepository extends JpaRepository<BookTransactionEntity,Long> {
}

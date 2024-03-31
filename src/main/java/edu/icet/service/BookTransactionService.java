package edu.icet.service;

import edu.icet.dto.BookTransactionDto;

public interface BookTransactionService {
    Boolean saveBookTransaction(BookTransactionDto bookTransactionDto);
}

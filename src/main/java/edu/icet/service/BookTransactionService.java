package edu.icet.service;

import edu.icet.dto.BookTransactionDto;

import java.util.List;

public interface BookTransactionService {
    Boolean saveBookTransaction(BookTransactionDto bookTransactionDto);
    public List<BookTransactionDto> getBookTransactions();
}

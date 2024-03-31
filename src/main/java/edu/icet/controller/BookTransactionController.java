package edu.icet.controller;

import edu.icet.dto.BookTransactionDto;
import edu.icet.service.BookTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class BookTransactionController {

    private final BookTransactionService bookTransactionService;
    @PostMapping("/book-transactions")
    public Boolean saveBookTransactions(@RequestBody BookTransactionDto bookTransactionDto){
        return bookTransactionService.saveBookTransaction(bookTransactionDto);
    }
}

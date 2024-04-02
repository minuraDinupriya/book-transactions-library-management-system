package edu.icet.controller;

import edu.icet.dto.BookTransactionDto;
import edu.icet.service.BookTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class BookTransactionController {

    private final BookTransactionService bookTransactionService;
    @PostMapping("/book-transactions")
    public Boolean saveBookTransactions(@RequestBody BookTransactionDto bookTransactionDto){
        return bookTransactionService.saveBookTransaction(bookTransactionDto);
    }

    @GetMapping("/book-transactions")
    public List<BookTransactionDto> getBookTransactionDtoList(){
        return bookTransactionService.getBookTransactions();
    }
}

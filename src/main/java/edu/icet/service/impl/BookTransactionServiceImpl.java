package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.BookTransactionDto;
import edu.icet.entity.BookTransactionEntity;
import edu.icet.repository.BookTransactionRepository;
import edu.icet.service.BookTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookTransactionServiceImpl implements BookTransactionService {
    private final BookTransactionRepository bookTransactionRepository;
    private final ObjectMapper objectMapper;
    @Override
    public Boolean saveBookTransaction(BookTransactionDto bookTransactionDto) {
        bookTransactionRepository.save(objectMapper.convertValue(bookTransactionDto, BookTransactionEntity.class));
        return true;
    }

    public List<BookTransactionDto> getBookTransactions(){
        List<BookTransactionDto> bookTransactionDtoList=new ArrayList<>();
        List<BookTransactionEntity> bookTransactionEntities = bookTransactionRepository.findAll();

        bookTransactionEntities.forEach(bookTransactionEntity -> {
            BookTransactionDto bookTransactionDto = objectMapper.convertValue(bookTransactionEntity, BookTransactionDto.class);
            bookTransactionDtoList.add(bookTransactionDto);
        });

        return bookTransactionDtoList;
    }
}

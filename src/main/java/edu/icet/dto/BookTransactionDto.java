package edu.icet.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookTransactionDto {
    private Long id;
    private Long borrowerId;
    private List<Long> bookIds;
    private Date date;
    private Double fine;
}

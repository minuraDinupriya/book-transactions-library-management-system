package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long borrowerId;
    private List<Long> bookIds;
    private Date date;
    private Double fine;
}

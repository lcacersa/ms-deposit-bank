package com.example.msdepositbank.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "deposit")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Deposit {
    @Id
    private String id;

    @Field(name = "amount")
    private Double amount;

    private String typeOfAccount;

    private String accountNumber;

    @Field(name = "depositDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime depositDate = LocalDateTime.now();
}
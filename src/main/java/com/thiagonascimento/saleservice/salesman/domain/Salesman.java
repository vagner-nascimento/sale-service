package com.thiagonascimento.saleservice.salesman.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "salesman")
public class Salesman {
    @Id
    private String id;
    private String cpf;
    private String name;
    private Double salary;
}

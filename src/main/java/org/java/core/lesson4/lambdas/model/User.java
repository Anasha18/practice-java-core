package org.java.core.lesson4.lambdas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer age;
    private BigDecimal balance;
}




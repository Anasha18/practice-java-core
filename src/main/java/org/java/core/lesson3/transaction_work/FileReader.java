package org.java.core.lesson3.transaction_work;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<Transaction> readFile(String path) {
        List<Transaction> transactions = new ArrayList<>();

        List<String> lines;

        try {
            lines = Files.readAllLines(Path.of(path));
        } catch (IOException ex) {
            System.out.println("Что-то пошло не так при чтении файла" + ex.getMessage());
            return transactions;
        }

        lines = lines.subList(1, lines.size());

        for (String line : lines) {
            String[] parts = line.split(";");

            Transaction transaction = new Transaction(
                    parts[0],
                    new BigDecimal(parts[1]),
                    LocalDate.parse(parts[2]),
                    Transaction.Status.valueOf(parts[3])
            );

            transactions.add(transaction);
        }

        return transactions;
    }
}

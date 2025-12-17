package org.java.core.lesson3.transaction_work;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathReadToFile = "/Users/nikit/IdeaProjects/test-practice/src/lesson3/transaction_work/transactions.csv";
        String pathWriteToFile = "/Users/nikit/IdeaProjects/test-practice/src/lesson3/transaction_work/transaction_result.csv";

        FileReader fr = new FileReader();

        List<Transaction> tr = fr.readFile(pathReadToFile);
        for (Transaction t : tr) {
            t.applyFee();
        }

        try (FileWriter fw = new FileWriter(pathWriteToFile)) {
            fw.append("TransactionId;Sum;Date;Status\n");

            for (Transaction t : tr) {
                fw.append(t.toCSV());
            }
        } catch (IOException ex) {
            System.out.println("Что-то пошло не так при записи в файл " + ex.getMessage());
        }
    }
}

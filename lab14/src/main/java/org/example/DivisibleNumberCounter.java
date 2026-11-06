package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DivisibleNumberCounter {
    private String fileName;

    public DivisibleNumberCounter(String fileName) {
        this.fileName = fileName;
    }

    public void generateNumbersFile(int count, int maxRange) throws IOException {
        Random random = new Random();
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(maxRange) + 1;
                writer.write(number + "\n");
            }
        }
    }

    public int countNumbersDivisibleBy(int divisor) throws IOException {
        int count = 0;
        System.out.println("читаем числа из " + fileName + ":");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    int num = Integer.parseInt(line);
                    System.out.print(num + " ");
                    if (num % divisor == 0) {
                        count++;
                    }
                }
            }
            System.out.println();
        }
        return count;
    }
}
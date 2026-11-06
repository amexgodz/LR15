package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Number {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Генерация файла со случайными числами
    public void generateRandomFile(String sourceFile, int count, int bound) throws IOException {
        Random random = new Random();
        try (FileWriter writer = new FileWriter(sourceFile)) {
            for (int i = 0; i < count; i++) {
                int value = random.nextInt(bound) + 1;
                writer.write(value + "\n");
            }
        }
    }

    // Раскидываем: простые в primeFile, остальные в otherFile
    public void separateNumbers(String sourceFile, String primeFile, String otherFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             FileWriter primeWriter = new FileWriter(primeFile);
             FileWriter otherWriter = new FileWriter(otherFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    int number = Integer.parseInt(line);
                    if (isPrime(number)) {
                        primeWriter.write(number + "\n");
                    } else {
                        otherWriter.write(number + "\n");
                    }
                }
            }
        }
    }
}
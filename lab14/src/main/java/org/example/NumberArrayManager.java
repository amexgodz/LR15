package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberArrayManager {
    private String fileName;

    public NumberArrayManager(String fileName) {
        this.fileName = fileName;
    }

    public void inputNumbersToFile(int count, Scanner scanner) throws IOException {
        File file = new File(fileName);
        System.out.println("введи " + count + " целых чисел:");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < count; i++) {
                System.out.print("число " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("это не целое число, давай еще раз:");
                    scanner.next();
                }
                int value = scanner.nextInt();
                writer.write(value + "\n");
            }
        }
    }

    public int countMultiples(int divisor) throws IOException {
        File file = new File(fileName);
        int counter = 0;

        System.out.println("\nчисла из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    int num = Integer.parseInt(line);
                    System.out.print(num + " ");
                    if (num % divisor == 0) {
                        counter++;
                    }
                }
            }
            System.out.println();
        }
        return counter;
    }
}
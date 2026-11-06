package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DistanceStatisticsCalculator {
    private String fileName;

    public DistanceStatisticsCalculator(String fileName) {
        this.fileName = fileName;
    }

    public void inputDistances(int count, Scanner scanner) throws IOException {
        System.out.println("введи " + count + " расстояний в км (например 12,5 или 10):");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < count; i++) {
                System.out.print("расстояние " + (i + 4) + ": ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("нужно вещественное число:");
                    scanner.next();
                }
                double dist = scanner.nextDouble();
                writer.write(dist + "\n");
            }
        }
    }

    public double calculateAverageDistance() throws IOException {
        double sum = 0.0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    line = line.replace(',', '.');
                    double dist = Double.parseDouble(line);
                    sum += dist;
                    count++;
                }
            }
        }

        if (count == 0) {
            throw new IOException("файл пустой, считать нечего");
        }

        return sum / count;
    }
}
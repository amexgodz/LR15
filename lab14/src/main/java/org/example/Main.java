package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nменю лабы 14 (13 вар)");
            System.out.println("1: инфа про спорт и инфа о файле");
            System.out.println("2: 10 чисел с клавы и сколько кратно 3");
            System.out.println("3: раскидать рандомные числа на простые и остальные");
            System.out.println("4: 10 расстояний и посчитать среднее");
            System.out.println("5: 10 чисел в файле и сколько кратно 4");
            System.out.println("0: выйти");
            System.out.print("выбери задание: ");

            if (!scanner.hasNextInt()) {
                System.out.println("надо ввести цифру пункта из меню");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("выход из программы");
                break;
            }

            switch (choice) {
                case 1:
                    executeTask1();
                    break;
                case 2:
                    executeTask2(scanner);
                    break;
                case 3:
                    executeTask3();
                    break;
                case 4:
                    executeTask4(scanner);
                    break;
                case 5:
                    executeTask5();
                    break;
                default:
                    System.out.println("нет такого пункта, давай от 0 до 5");
                    break;
            }
        }
    }

    private static void executeTask1() {
        System.out.println("\nзадание 1");
        String fileName = "sport_info.txt";
        SportInfo sport = new SportInfo(
                "баскетбол",
                "командная игра с мячом",
                "закинуть мяч руками в кольцо"
        );

        try {
            sport.writeToFile(fileName);
            System.out.println("файл создали и инфу записали\n");
            SportInfo.printFileMetadata(fileName);
            SportInfo.printFileContent(fileName);
        } catch (IOException e) {
            System.err.println("ошибка с файлом в задании 1: " + e.getMessage());
        }
    }

    private static void executeTask2(Scanner scanner) {
        System.out.println("\nзадание 2");
        NumberArrayManager manager = new NumberArrayManager("f_task2.txt");

        try {
            manager.inputNumbersToFile(10, scanner);
            int count = manager.countMultiples(3);
            System.out.println("чисел, которые делятся на 3: " + count);
        } catch (IOException e) {
            System.err.println("ошибка с файлом в задании 2: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("кривое число в файле: " + e.getMessage());
        }
    }

    private static void executeTask3() {
        System.out.println("\nзадание 3");
        Number numberService = new Number();
        String fileF = "f_task3.txt";
        String fileG = "g_task3_primes.txt";
        String fileH = "h_task3_others.txt";

        try {
            numberService.generateRandomFile(fileF, 20, 100);
            System.out.println("файл " + fileF + " с рандомными числами готов");

            numberService.separateNumbers(fileF, fileG, fileH);
            System.out.println("простые числа скинули в " + fileG);
            System.out.println("остальные числа скинули в " + fileH);
        } catch (IOException e) {
            System.err.println("ошибка при разделении чисел: " + e.getMessage());
        }
    }

    private static void executeTask4(Scanner scanner) {
        System.out.println("\nзадание 4");
        DistanceStatisticsCalculator calculator = new DistanceStatisticsCalculator("distances.txt");

        try {
            calculator.inputDistances(5, scanner);
            double avg = calculator.calculateAverageDistance();
            System.out.println("\nсреднее расстояние получилось: " + avg + " км");
        } catch (IOException e) {
            System.err.println("ошибка с файлом в задании 4: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("не получилось спарсить дробное число: " + e.getMessage());
        }
    }

    private static void executeTask5() {
        System.out.println("\nзадание 5");
        DivisibleNumberCounter counter = new DivisibleNumberCounter("f_task5.txt");

        try {
            counter.generateNumbersFile(10, 100);
            System.out.println("закинули 10 рандомных чисел в файл");
            int count = counter.countNumbersDivisibleBy(4);
            System.out.println("чисел, которые делятся на 4: " + count);
        } catch (IOException e) {
            System.err.println("ошибка с файлом в задании 5: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("кривое число в файле: " + e.getMessage());
        }
    }
}
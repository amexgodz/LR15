package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

public class SportInfo {
    private String sportName;
    private String description;
    private String rules;

    public SportInfo(String sportName, String description, String rules) {
        this.sportName = sportName;
        this.description = description;
        this.rules = rules;
    }

    public void writeToFile(String filePath) throws IOException {
        File file = new File(filePath);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("спорт: " + sportName + "\n");
            writer.write("описание: " + description + "\n");
            writer.write("правила: " + rules + "\n");
        }
    }

    public static void printFileMetadata(String filePath) {
        File file = new File(filePath);
        System.out.println("свойства файла:");
        System.out.println("имя: " + file.getName());
        System.out.println("путь: " + file.getAbsolutePath());
        System.out.println("размер: " + file.length() + " байт");
        System.out.println("существует: " + (file.exists() ? "да" : "нет"));
        System.out.println("можно читать: " + (file.canRead() ? "да" : "нет"));
        System.out.println("можно писать: " + (file.canWrite() ? "да" : "нет"));
        System.out.println("это папка: " + (file.isDirectory() ? "да" : "нет"));
        System.out.println("последнее изменение: " + new Date(file.lastModified()));
    }

    public static void printFileContent(String filePath) throws IOException {
        File file = new File(filePath);
        System.out.println("\nчто внутри файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
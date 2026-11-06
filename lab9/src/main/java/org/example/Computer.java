package org.example;

public abstract class Computer {
    private String processor;
    private int ram;
    private String storage;

    public Computer(String processor, int ram, String storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public abstract String getPerformance();
    public abstract String getPurpose();

    public void displayInfo() {
        System.out.println("процессор: " + processor);
        System.out.println("ОЗУ: " + ram + " ГБ");
        System.out.println("накопитель: " + storage);
        System.out.println("назначение: " + getPurpose());
        System.out.println("производительность: " + getPerformance());
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
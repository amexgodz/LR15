package org.example;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[] {
                new GamingPC("Intel Core i7-13700K", 32, "1TB NVMe SSD", "NVIDIA RTX 4080"),
                new GamingPC("AMD Ryzen 7 7800X3D", 32, "2TB NVMe SSD", "NVIDIA RTX 4090"),
                new OfficePc("Intel Core i3-12100", 8, "256GB SSD", 21.5),
                new OfficePc("AMD Ryzen 3 4300G", 8, "512GB SSD", 23.8),
                new OfficePc("Intel Core i5-10400", 16, "512GB SSD", 27.0)
        };

        for (int i = 0; i < computers.length; i++) {
            System.out.println("компьютер #" + (i + 1) + ":");
            computers[i].displayInfo();
            System.out.println();
        }
        GamingPC a = new Computer("Amd" ,32,"1tb","nvidia");
        a.displayInfo();
        System.out.println("Сводка производительности");
        for (int i = 0; i < computers.length; i++) {
            System.out.println("Компьютер #" + (i + 1) + " (" + computers[i].getPurpose() + "): "
                    + computers[i].getPerformance());
        }
    }
}


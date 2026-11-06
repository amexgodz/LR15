public class Main {
    static int totalCities = 0;
    static long totalPopulation = 0;

    String name;
    String country;
    int population;

    public Main(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;

        totalCities++;
        totalPopulation += population;
    }

    public static double avgPopular() {

        return (double) totalPopulation / totalCities;
    }

    public static void main(String[] args) {
        Main moscow = new Main("Москва", "Россия", 13100000);
        Main spb = new Main("Санкт-Петербург", "Россия", 5600000);
        Main minsk = new Main("Минск", "Беларусь", 1995000);
        Main astana = new Main("Астана", "Казахстан", 1350000);

        System.out.println("добавлено городов: " + Main.totalCities);
        System.out.println("среднее население: " + Math.round(Main.avgPopular()));
    }
}
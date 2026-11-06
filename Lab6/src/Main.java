public class Main {
    private String address;
    private int floors;
    private double totalArea;
    private int count;
    /*
    public int getCount()
    {
    return count;
    }
    public void setCount(int сount)
    {
    this.count = count;
    }
    public Main(string address,int floors,double totalArea,int count)
    {
    this(string address,int floors, double totalArea);
    this.count=count;
    }
     */


































    public Main(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;

    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double avgArea() {
        return totalArea / floors;
    }

    public static void main(String[] args) {
        Main officeCenter = new Main("невский проспект, 44", 6, 4500.5);
        System.out.println("здание: " + officeCenter.getAddress());
        System.out.println("средняя площадь одного этажа: " + officeCenter.avgArea());

    }
}
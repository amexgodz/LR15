package org.example;
public class OfficePc extends Computer {
    private double monitorSize;

    public OfficePc(String processor, int ram, String storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "средняя";
    }

    @Override
    public String getPurpose() {
        return "для офисной работы";
    }

    @Override
    public void displayInfo() {
        System.out.println("офисный ПК");
        super.displayInfo();
        System.out.println("размер монитора: " + monitorSize + "\"");
    }

    public double getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }
}

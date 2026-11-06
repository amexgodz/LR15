package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public GamingPC(String processor, int ram, String storage, String videoCard) {
        super(processor, ram, storage);
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "высокая";
    }

    @Override
    public String getPurpose() {
        return "для игр";
    }

    @Override
    public void displayInfo() {
        System.out.println("игровой ПК");
        super.displayInfo();
        System.out.println("видеокарта: " + videoCard);
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
}
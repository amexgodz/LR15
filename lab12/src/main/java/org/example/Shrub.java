package org.example;

public class Shrub extends Plant {
    private int branchCount;

    public Shrub(String name, int id, double height, int branchCount) {
        super(name, id, height);
        this.branchCount = branchCount;
    }

    public int getBranchCount() {
        return branchCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", веток=" + branchCount;
    }
}
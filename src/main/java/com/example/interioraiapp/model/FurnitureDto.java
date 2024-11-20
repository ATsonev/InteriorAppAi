package com.example.interioraiapp.model;

public class FurnitureDto {
    private String furnitureName;
    private double furnitureWidth;
    private double furnitureLength;
    private double furnitureHeight;
    private int count;

    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public double getFurnitureWidth() {
        return furnitureWidth;
    }

    public void setFurnitureWidth(double furnitureWidth) {
        this.furnitureWidth = furnitureWidth;
    }

    public double getFurnitureLength() {
        return furnitureLength;
    }

    public void setFurnitureLength(double furnitureLength) {
        this.furnitureLength = furnitureLength;
    }

    public double getFurnitureHeight() {
        return furnitureHeight;
    }

    public void setFurnitureHeight(double furnitureHeight) {
        this.furnitureHeight = furnitureHeight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

package com.example.interioraiapp.model;

import java.util.List;

public class SetupDto {
    private double width;
    private double length;
    private double height;
    private String roomType;
    private List<FurnitureDto> furniture;
    private String description;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<FurnitureDto> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<FurnitureDto> furniture) {
        this.furniture = furniture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.example.interioraiapp.service;

import com.example.interioraiapp.model.FurnitureDto;
import com.example.interioraiapp.model.SetupDto;

public class FurnitureService {

    public String sendDescription(SetupDto setupDto){
        StringBuilder sb = new StringBuilder("Draw me a floor plan of a"+ setupDto.getRoomType() +"with the following dimensions: ");
        String roomDimension = String.format("width %f, length %f and height %f.", setupDto.getWidth(), setupDto.getLength(), setupDto.getHeight());
        sb.append(roomDimension);
        sb.append("The room should have the following furniture: ").append(System.lineSeparator());
        for(FurnitureDto f: setupDto.getFurniture()){
            String result = String.format("%d %s with width %f, length %f and height %f.", f.getCount(), f.getFurnitureName(),
                                                                        f.getFurnitureWidth(), f.getFurnitureHeight(), f.getFurnitureHeight());
            sb.append(result).append(System.lineSeparator());
        }
        sb.append("Additional description: " + setupDto.getDescription());
        return sb.toString();
    }

}

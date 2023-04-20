package com.bridgeLabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {
    public static void main(String[] args) {
List<HotelReservationSystem> hotel=new ArrayList<>();
HotelReservationSystem hotel1=new HotelReservationSystem("LakeWood",3,110,90,80,80);
        HotelReservationSystem hotel2=new HotelReservationSystem("BridgeWood",4,160,60,110,50);
        HotelReservationSystem hotel3=new HotelReservationSystem("LakeWood",5,220,150,100,40);
hotel.add(hotel1);
hotel.add(hotel2);
hotel.add(hotel3);


    }
}

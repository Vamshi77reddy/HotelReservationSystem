package com.bridgeLabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HotelReservationSystem {
/*A hotel chain operating in Miami wishes to offer room reservation services over the internet. They
have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer
as a part of loyalty program. Each hotel has a rating assigned to it.
Lakewood with a rating of 3 has weekday rates as 110$ for regular customer and 80$ for rewards
customer. The weekend rates are 90 for regular customer and 80 for a rewards customer.
Bridgewood with a rating of 4 has weekday rates as 160$ for regular customer and 110$ for
rewards customer. The weekend rates are 60 for regular customer and 50 for a rewards customer.
Ridgewood with a rating of 5 has weekday rates as 220$ for regular customer and 100$ for rewards
customer. The weekend rates are 150 for regular customer and 40 for a rewards customer.
Can you write a program to help an online customer find the cheapest hotel?*/
private String Name;
private int rating;
private int RegularRatesweekdats;
    private int RegularRatesweekends;
    private int RewardRateweekdays;
    private int RewardRateweekends;

    public HotelReservationSystem(String name, int rating, int regularRatesweekdats, int regularRatesweekends, int rewardRateweekdays, int rewardRateweekends) {
        Name = name;
        this.rating = rating;
        RegularRatesweekdats = regularRatesweekdats;
        RegularRatesweekends = regularRatesweekends;
        RewardRateweekdays = rewardRateweekdays;
        RewardRateweekends = rewardRateweekends;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRegularRatesweekdats() {
        return RegularRatesweekdats;
    }

    public void setRegularRatesweekdats(int regularRatesweekdats) {
        RegularRatesweekdats = regularRatesweekdats;
    }

    public int getRegularRatesweekends() {
        return RegularRatesweekends;
    }

    public void setRegularRatesweekends(int regularRatesweekends) {
        RegularRatesweekends = regularRatesweekends;
    }

    public int getRewardRateweekdays() {
        return RewardRateweekdays;
    }

    public void setRewardRateweekdays(int rewardRateweekdays) {
        RewardRateweekdays = rewardRateweekdays;
    }

    public int getRewardRateweekends() {
        return RewardRateweekends;
    }

    public void setRewardRateweekends(int rewardRateweekends) {
        RewardRateweekends = rewardRateweekends;
    }

    @Override
    public String toString() {
        return "HotelReservationSystem{" +
                "Name='" + Name + '\'' +
                ", rating=" + rating +
                ", RegularRatesweekdats=" + RegularRatesweekdats +
                ", RegularRatesweekends=" + RegularRatesweekends +
                ", RewardRateweekdays=" + RewardRateweekdays +
                ", RewardRateweekends=" + RewardRateweekends +
                '}';
    }
}

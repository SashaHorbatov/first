package com.company.service;

import com.company.model.Gift;

import java.util.ArrayList;

public class GiftDistributor {
    private ArrayList<Gift> bag=new ArrayList<Gift>();

    public void addGiftToBag(Gift gift){
        bag.add(gift);

    }
    public ArrayList<Gift> getGifts(){
        return bag;
    }

    public void printGifts(){
        for (Gift gift:bag) {
            System.out.println(gift);
        }
    }
}

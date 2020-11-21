package com.company;

import com.company.model.Gift;
import com.company.service.GiftDistributor;

public class Main {

    public static void main(String[] args) {
         Gift softBear=new Gift("bear","toy",50);
         Gift candy=new Gift("sweet","circle",5);
         Gift glass=new Gift("white","long",20);
         Gift empty = new Gift();
        GiftDistributor giftDistributor=new GiftDistributor();
        giftDistributor.addGiftToBag(candy);
        giftDistributor.addGiftToBag(softBear);
        giftDistributor.addGiftToBag(glass);
        giftDistributor.addGiftToBag(empty);
        giftDistributor.printGifts();
    }

}

package com.company.model;

import java.util.ArrayList;

public class Gift {
    private String name;
    private String form;
    private int weight;


    public Gift (){
    }

    public Gift (String name,String form,int weight){
        this.name=name;
        this.form=form;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return String.format("name:"+name+"\nform"+form+"\nweight"+weight);
    }
}

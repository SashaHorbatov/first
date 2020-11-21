package com.company.model;

public class Gift {
    private String name;
    private String form;
    private int weight;


    public Gift() {
    }

    public Gift(String name, String form, int weight) {
        this.name = name;
        this.form = form;
        this.weight = weight;
    }

    @Override
    public String toString() {
        String srt = "gfgfgfg";
        String srt2 = "gfgfgfg";
        String srt3 = "gfgfgfg";
        return String.format("name:" + name + "\nform" + form + "\nweight" + weight);
    }
}

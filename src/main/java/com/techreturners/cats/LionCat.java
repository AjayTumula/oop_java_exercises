package com.techreturners.cats;

public class LionCat extends CatImpl{


    public LionCat() {
        super(false, 1100, "wild");
    }


    @Override
    public String eat() {
        return "Roar!!!!";
    }
}



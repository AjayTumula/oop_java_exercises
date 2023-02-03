package com.techreturners.cats;

public class CheetahCat extends CatImpl{
    public CheetahCat() {
        super(false, 1500, "wild");
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}

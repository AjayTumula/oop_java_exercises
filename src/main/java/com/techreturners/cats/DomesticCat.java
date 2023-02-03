package com.techreturners.cats;

public class DomesticCat extends CatImpl{


    public DomesticCat() {
        super(false, 23, "domestic");
    }

    @Override
    public String eat(){
        return "Purrrrrrr";
    }
}

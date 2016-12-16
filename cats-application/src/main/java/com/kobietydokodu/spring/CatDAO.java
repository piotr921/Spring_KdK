package com.kobietydokodu.spring;

import java.util.ArrayList;
import java.util.List;

public class CatDAO {

    private List<Cat> catList;

    public CatDAO(){
        this.catList = new ArrayList();
    }

    public void addCat(Cat cat){
        catList.add(cat);
    }

    public List<Cat> getCatList() {
        return catList;
    }
}

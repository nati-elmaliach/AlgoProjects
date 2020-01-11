package com.hit.algorithem;

import com.hit.algorithem.IAlgoSorting;

import java.util.Comparator;
import java.util.List;

public class BooksSorter {

    /*
    * An implementation of the strategy pattern
    * */
    private IAlgoSorting strategy;

    public BooksSorter(IAlgoSorting strategy){
        this.strategy = strategy;
    }

    public void setStrategy(IAlgoSorting newStrategy){
        this.strategy = newStrategy;
    }

    public <T> List<T> sort (List<T> books , Comparator comparator){
        List <T> sortedArray = strategy.arrange(books , comparator);
        return sortedArray;
    }


}

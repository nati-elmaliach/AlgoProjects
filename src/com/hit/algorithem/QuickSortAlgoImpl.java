package com.hit.algorithem;

import java.util.Comparator;
import java.util.List;

public class QuickSortAlgoImpl implements IAlgoSorting {
    private List wholeBooksArray;

    @Override
    public List arrange (List books , Comparator comparator) {
        wholeBooksArray = books;
        books = quickSort(wholeBooksArray , 0 , wholeBooksArray.size() -1,  comparator);
        return books;
    }

    public static List<?> quickSort(List<?> array , int left , int right , Comparator<Object> C){
        int ll=left;
        int rr=right;

        if (rr>ll){
            Class<?> pivot = (Class<?>) array.get((ll + rr) / 2);
            while (ll <=rr){
                // that's how we'll use the comparator:
                while(ll<right && C.compare(array.get(ll), pivot) < 0){
                    ll +=1;
                }
                while(rr>left &&  C.compare(array.get(rr), pivot) > 0){
                    rr -=1;
                }
                if (ll <=rr){
                    swap(array, ll ,rr);
                    ll +=1;
                    rr -=1;
                }
            }
            if (left < rr){
                quickSort(array,left,rr, C);

            }
            if (ll<right){
                quickSort(array, ll, right, C);
            }
        }
        return array;
    }

    public static void swap (List array , int left , int right){
        Class<?> temp = (Class<?>) array.get(left);
        array.set(left, array.get(right));
        array.set(right , temp);
        }
}




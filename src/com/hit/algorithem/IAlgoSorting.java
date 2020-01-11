package com.hit.algorithem;

import java.util.Comparator;
import java.util.List;

public interface IAlgoSorting<T> {
    List<T> arrange( List<T> books, Comparator comparator);
}

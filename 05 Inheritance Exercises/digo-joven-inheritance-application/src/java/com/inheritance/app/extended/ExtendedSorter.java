package com.inheritance.app.extended;

import com.inheritance.app.base.Sorter;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExtendedSorter extends Sorter {
    public ExtendedSorter(List<String> stringList) {
        super(stringList);
    }

    @Override
    public void sort() {
        Set<String> uniqueSet = new HashSet<>(stringList);
        stringList.clear();
        stringList.addAll(uniqueSet);
        Collections.sort(stringList);
    }
}
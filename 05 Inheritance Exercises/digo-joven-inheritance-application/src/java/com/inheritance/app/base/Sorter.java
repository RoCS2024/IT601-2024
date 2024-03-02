package com.inheritance.app.base;

import java.util.Collections;
import java.util.List;

public class Sorter {
        public List<String> stringList;

        public Sorter(List<String> stringList) {
            this.stringList = stringList;
        }

        public void sort() {
            Collections.sort(stringList);
        }

        public void display() {
            System.out.println(stringList);
        }
}

package com.github.fabriciolfj.javacodeproblems.streamofnullable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = Arrays.asList(1,2,null,3,null,6);
        var result = Test.collectionAsStream(list);

        System.out.println(result.count());

    }


}

package com.miketigris.common;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by xuguirong on 06/05/2017.
 */
public class PartTwo {

    public static void main(String[] args) {

        List<Dish> menu = new ArrayList();
        menu.add(Dish.builder().age(10).name("tomato").carleries(400).build());
        menu.add(Dish.builder().age(20).name("apple").carleries(500).build());
        menu.add(Dish.builder().age(30).name("mango").carleries(600).build());
        menu.add(Dish.builder().age(40).name("baeery").carleries(200).build());
        menu.add(Dish.builder().age(50).name("bee").carleries(100).build());

        List<Dish> lowCarleres = new ArrayList();
        for (Dish lowdish : menu) {
            if (lowdish.getCarleries() < 400) {
                lowCarleres.add(lowdish);
            }
        }

        Collections.sort(lowCarleres, Comparator.comparingInt(Dish::getCarleries));

        List<String> logdishName7 = new ArrayList();
        for(Dish d : lowCarleres){
            logdishName7.add(d.getName());
        }

        System.out.println(logdishName7);


        List<String> logdishName8 = new ArrayList();
        logdishName8 = menu.parallelStream().filter(d->d.getCarleries()<400)
                .sorted(Comparator.comparingInt(Dish::getCarleries))
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(logdishName8);


        String[] words = {"hello","world"};



        List<String> ss = Arrays.stream(words).map(d->d.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        System.out.println(ss);


        Integer[] integers = {1,2,3,4,5,6,7,8};
        List<Integer> ii = Arrays.stream(integers).map(i->i*i).collect(Collectors.toList());

        System.out.println(ii);

        Integer[] integers1 = {1,2,3};
        Integer[] integers2 = {4,5};
        List<Integer> integers11 = Arrays.asList(integers1);
        List<Integer> integers22 = Arrays.asList(integers2);

//        List<Integer[]> integers3 = integers11.stream()
//                .flatMap(d->integers22.stream().map(j -> new int[]{d,j}))
//                        .collect(Collectors.toList());
    }

}

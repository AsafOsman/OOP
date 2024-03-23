package oopConcepts.ArraysOrCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysOrCollections {
    public static void main(String[] args) {
        int[] grades = new int[3]; //En fazla 3 eleman eklenebilir.
        int[] grades2 = {85, 93, 45, 75};

        //Arrayi ekrana basmak istersek
        System.out.println(Arrays.toString(grades2));

        //sabit boyut
        grades[0] = 85;
        grades[1] = 95;
        grades[2] = 65;
        //grades[3] = 65; //ArrayIndexOutOfBoundsException Verir.

        // grades dizisi icinde 70 degeri var mı
        // cevap --> for --> if


        //Not ortalamasi hesaplayalim
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double avg = total / grades.length;
        System.out.println(avg);

        //********************** LIST **********************

        List<Integer> stfGrades = new ArrayList<>();
        // eleman ekliyoruz
        stfGrades.add(92);
        stfGrades.add(99);
        stfGrades.add(99);
        stfGrades.add(94);
        stfGrades.add(100);

        stfGrades.remove(Integer.valueOf(100));
        System.out.println(stfGrades);

        //LİST icinde 70 degeri var mı
        System.out.println(stfGrades.contains(70));

        //list icindeki elemanlarin ortalamasi( contains , streamAPI , isEmpty , replace gibi komutlar kullanilir.
        int totalGrades = stfGrades.stream().reduce(Math::addExact).get();
        double avgGrade  = totalGrades / stfGrades.size();
        System.out.println(avgGrade);

    }

}

import CodeTest.Hamburger;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.stream.Stream;
import java.math.BigInteger;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        hamburger();
        solution();
    }

    static void hamburger(){
        Hamburger ham = new Hamburger();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        //System.out.println(ham.solution(ingredient));
    }
    static void solution(){
        Solution Sol = new Solution();

        String s = "aaabbaccccabba";


        System.out.println(Sol.solution(s));
    }
}

class Solution{
    public int solution(String s){

        return 0;
    }
}
package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Hamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        int temp = 0;
        ArrayList<Integer> IntegerArrayList = Arrays.stream(ingredient)
                .boxed()
                .collect(Collectors.toCollection(ArrayList<Integer>::new));
        for (int i = 0; i < 250000; i++) {
            if (ingredient.length < 4){
                break;
            }
            for (int j = 0; j < ingredient.length - 3; j++) {
                if (ingredient[j] == 1 && ingredient[j + 1] == 2 && ingredient[j + 2] == 3 && ingredient[j + 3] == 1) {

                    answer += 1;
                }
            }
            if (answer == temp){
                break;
            }
            temp = answer;
        }

        return answer;
    }
}

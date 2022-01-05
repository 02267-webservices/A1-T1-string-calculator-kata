package dtu.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    List<Integer> stack = new ArrayList<>();

    public void input(String stringNumbers) {
        List<String> numbersList = Arrays.asList(stringNumbers.split(",|\\\\n"));
        for(String number : numbersList){
            if(isNumeric(number)){
                int int1 = Integer.parseInt(number);
                stack.add(int1);
            }
        }
    }

    public boolean isNumeric(String str) {
        return str.matches("\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public void add() {
        if(stack.size() > 0) {
            int sum = 0;
            for(int e : stack) {
                sum += e;
            }
            stack.add(sum);
        }
    }

    public int display() {
        int stackSize;
        if(stack.size() == 0){
            stackSize = 0;
        }
        else {
            stackSize = stack.get(stack.size() -1);
        }
        return stackSize;
    }


}

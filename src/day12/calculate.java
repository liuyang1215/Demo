package day12;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class calculate {
	List<Object> toSuffix(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("+", 0);
        map.put("-", 0);
        map.put("*", 1);
        map.put("/", 1);
        List<Object> list = new ArrayList<Object>();
        String[] number = s.split("[^\\d]");
        String[] operator = s.split("\\d+");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < number.length; i++) {
            if (operator[i].length() != 0) {
                while (!stack.isEmpty()
                        && map.get(operator[i]) <= map.get(stack.peek())) {
                    list.add(stack.pop());
                }
                stack.push(operator[i]);
            }
            list.add(Double.parseDouble(number[i]));
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
 
    double calculate(List<Object> list) {
        Stack<Double> stack = new Stack<Double>();
        for (Object obj : list) {
            if (obj instanceof Double) {
                stack.push((Double) obj);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                if (obj.equals("+"))
                    stack.push(a + b);
                if (obj.equals("-"))
                    stack.push(a - b);
                if (obj.equals("*"))
                    stack.push(a * b);
                if (obj.equals("/"))
                    stack.push(a / b);
            }
        }
        return stack.pop();
    }

}


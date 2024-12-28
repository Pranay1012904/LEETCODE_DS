package Operation.StringOps;

import java.util.*;

public class ValidParathesis {

    public static void main(String[] args) {
        validity();
    }

    public static void validity() {
        String regex = "[(])";

        List<String> regList = Arrays.asList(regex.split(""));//note it down
        int size = regList.size();
        boolean flag = true;
        if(regList.size()%2!=0 || (regList.get(0).equals(")") || regList.get(0).equals("}") || regList.get(0).equals("]")))
            flag= false;
        Stack<String> stack = new Stack<>();
        int i = 0;

        while (flag && i < size) {
            if (
                    (regList.get(i).equals("(") ||
                            regList.get(i).equals("{") ||
                            regList.get(i).equals("["))
            ) {
                stack.push(regList.get(i));
                i++;
            } else if ( !stack.isEmpty() &&
                    (regList.get(i).equals(")") && stack.get(stack.size() - 1).equals("(") ||
                            regList.get(i).equals("}") && stack.get(stack.size() - 1).equals("{") ||
                            regList.get(i).equals("]") && stack.get(stack.size() - 1).equals("["))
            ) {
                stack.pop();
                i++;
            } else
                flag = false;
        }

        if(!stack.isEmpty() || !flag)
            flag= false;

        System.out.print(flag);
    }
}

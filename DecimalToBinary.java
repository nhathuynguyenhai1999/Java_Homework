package James_Module2;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimalNum) {
        Stack<Integer> stack = new Stack<>();

        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            stack.push(remainder);
            decimalNum = decimalNum / 2;
        }

        StringBuilder binaryResult = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryResult.append(stack.pop());
        }

        return binaryResult.toString();
    }

    public static void main(String[] args) {
        int decimalNum = 30;
        String binaryResult = decimalToBinary(decimalNum);
        System.out.println(decimalNum + " = (" + binaryResult + ")B");
    }
}

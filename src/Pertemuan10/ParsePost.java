package Pertemuan10;

public class ParsePost {
    private MyStack theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new MyStack(20);
        char ch;
        int num1, num2, interAns;

        for (int j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            if (ch >= '0' && ch <= '9') {
                theStack.push(ch);
            } else {
                num2 = theStack.pop() - '0';
                num1 = theStack.pop() - '0';
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push((char) (interAns + '0'));
            }
        }
        return theStack.pop() - '0';
    }
}

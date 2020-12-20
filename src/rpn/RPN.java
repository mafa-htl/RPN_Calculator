/**class RPN
 * @author Matteo Falkenberg
 * @version 1.10, 20.12.2020
 */

package rpn;

import java.util.Stack;

public class RPN {

    private Stack<Double> stack = new Stack<>();

    public void pushToStack(double number){
        stack.push(number);
    }

    public String getStackList(){
        String stackList = "";

        for (double r : stack) {
            stackList = stackList + r + "\n";
        }
        return stackList;
    }

    public void clearStack(){
        stack.clear();
    }

    public boolean addLastTwo(){
        if(stack.size() >= 2){
            double lastNum = stack.pop();
            double secondLastNum = stack.pop();
            stack.push(secondLastNum + lastNum);
            return true;
        }
        return false;
    }

    public boolean subtractLastTwo(){
        if(stack.size() >= 2){
            double lastNum = stack.pop();
            double secondLastNum = stack.pop();
            stack.push(secondLastNum - lastNum);
            return true;
        }
        return false;
    }

    public boolean multiplyLastTwo(){
        if(stack.size() >= 2){
            double lastNum = stack.pop();
            double secondLastNum = stack.pop();
            stack.push(secondLastNum * lastNum);
            return true;
        }
        return false;
    }

    public boolean divideLastTwo(){
        if(stack.size() >= 2){
            double lastNum = stack.pop();
            double secondLastNum = stack.pop();
            stack.push(secondLastNum / lastNum);
            return true;
        }
        return false;
    }

    public boolean reverseLast(){
        if(stack.size() >= 1){
            double lastNum = stack.pop();
            stack.push( Math.pow(lastNum, -1));
            return true;
        }
        return false;
    }

    public boolean switchLastTwo(){
        if(stack.size() >= 2){
            double lastNum = stack.pop();
            double secondLastNum = stack.pop();
            stack.push(lastNum);
            stack.push(secondLastNum);
            return true;
        }
        return false;
    }

}

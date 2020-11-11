public class StackX {
    int maxSize;
    int top;
    int stackArray [];

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        stackArray = new int [maxSize];
    }

    public void push(int value){
        if (top == maxSize-1){
            System.out.println("Stack is FULL");
        }else{
            stackArray[++top] = value;
        }
    }

    public int pop(){
        if (top == -1){
            System.out.println("Array is EMPTY");
            return -99;
        }else{
            return (stackArray[top--]);
        }
    }

    public int peek(){
        if (top == -1){
            System.out.println("Array is EMPTY");
            return -99;
        }else{
            return (stackArray[top]);
        }
    }

}

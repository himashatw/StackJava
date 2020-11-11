import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int inp = scanner.nextInt();
        StackX stackX = new StackX(inp);

        //calling methods

        stackX.push(99);
        stackX.push(100);
        stackX.push(101);

        System.out.println(stackX.peek());
    }
}

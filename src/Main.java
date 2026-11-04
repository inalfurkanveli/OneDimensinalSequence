/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Process {
    String name;
    int remaningTime;

    public Process(String name, int remaningTime) {
        this.name = name;
        this.remaningTime = remaningTime;
    }
}
class Vehicle1{
    String carType;


    public Vehicle1(){
        this.carType=carType;
    }


};
class Car1 extends Vehicle1{
    String carType;
    String color ;
    int carValue=12000;
    public Car1(String carType, int carValue, String color) {
        this.carType = carType;
        this.carValue = carValue;
        this.color = color;
    }
    public Car1(){
        this.carType=carType;
    }

    public int value(){
        if (carType=="sedan"){
             carValue=15000;
        }else if (carType=="motorcycle"){
             carValue=10000;
        }else if (carType=="hagcback"){
             carValue=20000;
        }
        return carValue;
    }


}


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // N : process number T: quantum timing

        int n = scan.nextInt();
        int t = scan.nextInt();

        Queue<Process> queue = new LinkedList<>();
        Stack<Process> stack = new Stack<>();

        Stack<String> stack1=new Stack<>();

        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int time = scan.nextInt();
            queue.add(new Process(name, time));
        }
        int finishedCount = 1;

        while (!queue.isEmpty() || !stack.isEmpty()) {
                if (queue.isEmpty() && !stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    queue.add(stack.pop());
                }
            }


            Process currentProcess = queue.poll();

            if (currentProcess != null) {

                if (currentProcess.remaningTime > t) {
                    currentProcess.remaningTime -= t;
                    stack.push(currentProcess);
                } else {
                    System.out.println(finishedCount + "." + currentProcess.name);
                    finishedCount++;
                }
            }
        }
            scan.close();
        System.out.println("Please enter the your vehicle");
        String vehicle1= scan.next();
        stack1.push(vehicle1);
    }
}
*/
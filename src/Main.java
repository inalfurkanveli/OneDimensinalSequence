
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


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // N : process number T: quantum timing

        int n = scan.nextInt();
        int t = scan.nextInt();

        Queue<Process> queue = new LinkedList<>();
        Stack<Process> stack = new Stack<>();

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
    }
}

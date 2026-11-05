import java.util.*;

class ArrayQueue<E> {
    // Redicata e pretstavena na sledniot nacin:
    // length go sodrzi brojot na elementi.
    // Ako length > 0, togash elementite na redicata se zachuvani vo elems[front...rear-1]
    // Ako rear > front, togash vo  elems[front...maxlength-1] i elems[0...rear-1]
    E[] elems;
    int length, front, rear;

    // Konstruktor ...

    @SuppressWarnings("unchecked")
    public ArrayQueue(int maxlength) {
        elems = (E[]) new Object[maxlength];
        clear();
    }

    public boolean isEmpty() {
        // Vrakja true ako i samo ako redicata e prazena.
        return (length == 0);
    }

    public int size() {
        // Ja vrakja dolzinata na redicata.
        return length;
    }

    public E peek() {
        // Go vrakja elementot na vrvot t.e. pocetokot od redicata.
        if (length > 0)
            return elems[front];
        else
            throw new NoSuchElementException();
    }

    public void clear() {
        // Ja prazni redicata.
        length = 0;
        front = rear = 0;  // arbitrary
    }

    public void enqueue(E x) {
        // Go dodava x na kraj od redicata.
        if (length == elems.length)
            throw new NoSuchElementException();
        elems[rear++] = x;
        if (rear == elems.length) rear = 0;
        length++;
    }

    public E dequeue() {
        // Go otstranuva i vrakja pochetniot element na redicata.
        if (length > 0) {
            E frontmost = elems[front];
            elems[front++] = null;
            if (front == elems.length) front = 0;
            length--;
            return frontmost;
        } else
            throw new NoSuchElementException();
    }
}

class Process {
    String name;
    int time;

    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

 public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // The number of operations and the duration for each operation are obtained from the user.
         int processNumber = scan.nextInt();
         int processTime = scan.nextInt();
         ArrayQueue<Process> queue = new ArrayQueue<>(processNumber);
         // add every element in queue with for loop;
         for (int i = 0; i < processNumber; i++) {
             //we get for  every operation  name and execution time from user.
             String name = scan.next();
             scan.nextLine();
             int time = scan.nextInt();
             queue.enqueue(new Process(name, time));
         }
         // we declerated that int 1 because for output.
         int outPrintIndex = 1;
         while (!queue.isEmpty()) {
             Process currentProcess = queue.dequeue();

             if (currentProcess.time > processTime) {
                 currentProcess.time -= processTime;
                 queue.enqueue(currentProcess);
             } else {
                 System.out.println(outPrintIndex + ". " + currentProcess.name);
                 outPrintIndex++;
             }
         }

     }
 }



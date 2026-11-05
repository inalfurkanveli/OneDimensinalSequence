/*
import java.util.Scanner;
import java.util.Stack;


class Vehicle {
    int value;
    String name;

    public Vehicle() {
    }

    ;

    public Vehicle(int value, String name) {
        this.value = value;
        this.name = name;
    }


}

class Car extends Vehicle {
    String carType;

    public Car() {
        super();
    }

    public Car(int value, String name, String carType) {
        super(value, name);
        this.carType = carType;
    }
}

public class stackExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value, value2;
        String name, name2, carType, carType2;

        System.out.println("Enter the value of a vehicle1");

        value = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the value of a vehicle2");
        value2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of a vehicle1");

        name = sc.nextLine();
        System.out.println("Enter the name of a vehicle2");
        name2 = sc.nextLine();
        System.out.println("Enter the type of a vehicle");
        carType = sc.nextLine();
        System.out.println("Enter the type of a vehicle2");
        carType2 = sc.nextLine();

        Car car = new Car(value, name, carType);
        Car car2 = new Car(value2, name2, carType2);
        Stack<Car> stack = new Stack<>();
        stack.push(car);
        stack.push(car2);
        while (!stack.isEmpty()) {
            Car curr = stack.pop();

            System.out.println("Car name: " + curr.name +"" +

                    " Car value:  " + curr.value +
                    " Car type is : " + curr.carType);

        }
        stack.clear();
    }
}
*/
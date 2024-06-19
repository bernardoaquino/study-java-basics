import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Concatenation
        String msg1 = "Test";
        String msg2 = "Test2";
        System.out.println(msg1 + " " + msg2);

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);

        // Ternary Operator
        int n1 = 10;
        int n2 = 20;
        int greaterNumber = (n1 > n2) ? n1 : n2;
        System.out.println("Greater number is: " + greaterNumber);

        // Post and Pre Increment
        int a = 10;
        ++a; // 11
        ++a; // 12
        System.out.println(a++); // 12
        System.out.println(++a); // 14

        // SWitch Case
        int b = 1;
        switch (b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }

        // For Loop
        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----After loop-----");
        System.out.println(i);

        // While Loop
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        System.out.println("-----After loop-----");
        System.out.println(j);

        // Do-While Loop
        int k = 1;
        do {
            System.out.println(k);
            k+=2;
        } while (k <= 10);
        System.out.println("-----After loop-----");
        System.out.println(k);

        int l = 10;
        do {
            System.out.println("-----Run without check the condition-----");
            System.out.println(l);
        } while (l < 5);

        // Continue Statement
        System.out.println("-----Continue Statement-----");
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                continue; // Jump to next iteration
            }
            System.out.println(m);
        }

        // Array - 3 ways to declare
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println("-----Array1----");
        System.out.println(arr[0]);

        int[] arr2 = new int[3]; // [0, 0, 0]
        System.out.println("-----Array2 - Before-----");
        System.out.println(arr2[0]);
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        System.out.println("-----Array2 - After----");
        System.out.println(arr2[0]);

        int[] arr3;
        arr3 = new int[2];
        arr3[0] = 100;
        arr3[1] = 200;
        System.out.println("-----Array3----");
        System.out.println(arr3[0]);

        // Array - Loop
        System.out.println("-----Array3 - For Loop----");
        for (int n = 0; n < arr3.length - 1; n++) {
            System.out.println(arr3[n]);
        }

        System.out.println("-----Array3 - While Loop----");
        int o = 0;
        while (o < arr3.length) {
            System.out.println(arr3[o]);
            o++;
        }

        System.out.println("-----Array3 - Foreach Loop----");
        for (int element: arr3) {
            System.out.println(element);
        }

        // Dimensional Array
        int[][] arr4 = new int[][]{
                {1, 2, 3}, // 0
                {4, 5, 6}, // 1
        };

        System.out.println("-----Dimensional Array----");
        for (int p = 0; p < arr4.length; p++) {
            // arr4[0] = {1, 2, 3} / length = 3
            for (int q = 0; q < arr4[p].length; q++) {
                // arr4[0][0] = 1
                System.out.print(arr4[p][q] + " ");
            }
            System.out.println();
        }

        // String - Is a continuous memory location where is stored characters
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println("-----String----");
        System.out.println(str1.charAt(0)); // H

        // String - Loop
        System.out.println("-----String - For Loop----");
        for (int r = 0; r < str2.length(); r++) {
            System.out.println(str2.charAt(r));
        }

        // String Concatenation
        String result1 = str1 + " " + str2;
        String result2 = str1.concat(" ").concat(str2);
        String result3 = str1.concat(" " + str2);
        System.out.println("-----String - Concatenation----");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // String - Comparison - 3 ways
        System.out.println("-----String - Comparison----");
        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if(str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (str1.compareTo(str2) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // String - Substring
        System.out.println("-----String - Substring----");
        // begin inde = inclusive, end index = exclusive (n-1)
        System.out.println(str1.substring(0, 2)); // He
        System.out.println(str1.substring(2)); // llo

        // String - IndexOf
        System.out.println("-----String - IndexOf----");
        String s1 = "My name is John";

        int index = s1.indexOf("name");
        int index2 = s1.indexOf("i", 4); // 8 - Start searching from index 4
        System.out.println(index); // 3
        System.out.println(index2);

        // String - Replace
        System.out.println("-----String - Replace----");
        String newStr1 = str1.replace('H', 'C');
        String newStr2 = newStr1.replace('l', 'p');
        System.out.println(newStr1); // Cello
        System.out.println(newStr2); // Ceppo

        // Class
        Hello hello = new Hello();
        hello.printMsg();
        System.out.println(hello.a);
        System.out.println(hello.b);

        // Class - Single level inheritance
        B objB = new B();
        System.out.println("-----String - Single level Inheritance----");
        objB.addSum(20, 10);
        System.out.println(objB.a);

        // Class - Multilevel inheritance
        E objE = new E();
        System.out.println("-----String - Multilevel Inheritance----");
        objE.substract(20, 5);
        objE.printMsg();
        System.out.println(objE.xyz);

        // Class - Hierarchical Inheritance
        System.out.println("-----String - Hierarchical Inheritance----");
        Dog dog = new Dog();
        dog.eat();
        Fish fish = new Fish();
        fish.eat();

        // Abstract Class
        System.out.println("-----String - Abstract Class----");
        Dog2 dog2 = new Dog2();
        dog2.walk();
        Fish2 fish2 = new Fish2();
        fish2.walk();

        // Interface
        System.out.println("-----String - Interface----");
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 20)); // 30
        System.out.println(calculator.substract(20, 10)); // 10
        System.out.println(calculator.a);
    }
}

// Class - Create a simple class
class Hello {
    int a = 10;
    int b = 20;

    void printMsg() {
        System.out.println("-----String - Class----");
        System.out.println("Hello World");
    }
}

// Class - Single level inheritance
class A {
    int a = 10;
    void addSum(int n1, int n2) {
        System.out.println("Sum: " + (n1 + n2));
    }
}

class B extends A {}

// Class - Multilevel inheritance
class C {
    int xyz = 10;
    void printMsg() {
        System.out.println("Hello from class C.");
    }
}

class D extends C {
    void substract(int n1, int n2) {
        System.out.println("Substract: " + (n1 - n2));
    }
}

class E extends D {}

// Class - Hierarchical Inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {}

class Fish extends Animal {}

// Abstract Class
abstract class Animal2 {
    abstract void walk(); // Method without body
}

class Dog2 extends Animal2 {
    @Override // Annotation - Not mandatory, but good practice
    void walk() {
        System.out.println("Dog is walking...");
    }
}

class Fish2 extends Animal2 {
    @Override // Annotation - Not mandatory, but good practice
    void walk() {
        System.out.println("Fish is swimming...");
    }
}

// Interface
interface F {
    int a = 10;
    int sum(int n1, int n2);
}

interface G {
    int substract(int n1, int n2);
}

class Calculator implements F, G {
    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int substract(int n1, int n2) {
        return n1 - n2;
    }
}
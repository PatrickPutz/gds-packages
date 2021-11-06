package org.campus02.putz.stack;

public class DemoStackApp {
    public static void main(String[] args) {

        Stack<Integer> stapel = new Stack(new Integer[7]);

        stapel.push(7);
        stapel.push(5);
        stapel.push(6);

        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());
        stapel.push(3);
        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());

        Stack<String> stapel2 = new Stack(new String[7]);

        stapel2.push("Sieben");
        stapel2.push("Fünf");
        stapel2.push("Sechs");

        System.out.println("stapel2.pop() = " + stapel2.pop());
        System.out.println("stapel2.pop() = " + stapel2.pop());
        stapel2.push("Drei");
        System.out.println("stapel2.pop() = " + stapel2.pop());
        System.out.println("stapel2.pop() = " + stapel2.pop());
        System.out.println("stapel2.pop() = " + stapel2.pop());

    }
}

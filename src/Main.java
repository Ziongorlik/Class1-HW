public class Main {
    public static void main(String[] args) {

        // Exercise-1
        int x = 7;
        double d = 44.3;
        String s = "abc";

        // Exercise-2
        System.out.println(x + d);
        System.out.println(x + s);
        System.out.println();

        // Exercise-3
        System.out.println("The final value of a is: 9");
        System.out.println("The final value of b is: 8");
        System.out.println("The final value of c is: 15");
        System.out.println();

        // Exercise-4
        System.out.println("The eight primitive data types supported by the Java programming language are:");
        System.out.println("1. byte");
        System.out.println("2. int");
        System.out.println("3. short");
        System.out.println("4. long");
        System.out.println("5. double");
        System.out.println("6. float");
        System.out.println("7. boolean");
        System.out.println("8. character");
        System.out.println();

        // Exercise-5
        System.out.println("Local variable: a variable that is declared in a method constructor or blocks, initialized when the method or the constructor block starts,\n" +
                "and will be destroyed once its end. The variable will only be accessible from within the method.\n");

        // Exercise-6
        System.out.println("Global variable: a variable that is declared inside a class but outside any method, constructor, block, or property.\n" +
                "The variable can be accessed anywhere in the class.\n");

        // Exercise-7
        System.out.println("The output will be:");
        System.out.println("2");
        System.out.println("2.0");
        System.out.println();

        // Exercise-8
        System.out.println("One String will be created.");
        System.out.println();

        // Exercise-9
        System.out.println("The output will be : 7");
        System.out.println();

        // Exercise-10
        System.out.println("The output will be : 8");
        System.out.println();

        // Exercise-11
        String hello = "hello";
        String world = "world";
        System.out.println(hello + world);

        //You can add a space at the end of the first word.
        hello = "hello ";
        world = "world";
        System.out.println(hello + world);

        //You can add a space at the beginning of the second word.
        hello = "hello";
        world = " world";
        System.out.println(hello + world);

        //You can add a space between the two words when printing.
        hello = "hello";
        world = "world";
        System.out.println(hello + " " + world);
        System.out.println();

        // Exercise-12
        System.out.println("The program will not compile because \"super\" is a reserved word");
        System.out.println();

        // Exercise-13
        s = "123";
        int number = Integer.parseInt(s);
        number /= 2;
        System.out.println("The number is " + number);
        System.out.println();

        // Exercise-14
        System.out.println("String a2 = new String(\"a\"); explicitly creates a new and referentially distinct instance of a String object.");
        System.out.println("String a1 = \"text\"; may reuse an instance from the string constant pool if one is available.");
        System.out.println();

        // Exercise-15
        System.out.println("Because String is an object and all objects starts with a capital letter.");

    }
}

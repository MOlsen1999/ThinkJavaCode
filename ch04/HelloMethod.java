public class HelloMethod {
    public static void main(String[] args) {
        String firstName = "Fred";
        String secondName = "Wilma";
        String lastName = "Flintstone";

        printHelloWorld(firstName, lastName);
        printHelloWorld(secondName, lastName);

        printOhNo();

        printNumberNoSign(5);
    }

    public static void printNumberNoSign(int number);

    {
        int positiveNumber = Math.abs(number);
        System.out.println("The Number is: " + positiveNumber);
    }

    public static void printHelloWorld(String fname, String lName) {
        System.out.println("Hello World " + fname + " " + lName);
    }

    public static void printOhNo() {
        System.out.println("Oh No!!!!!!!!!!!!!!!!!");
    }

}
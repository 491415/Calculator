import java.util.ArrayList;
import  java.util.Scanner;

//TODO: Make it work with negative numbers as well!!
public class Main {

    public static void clearList(ArrayList<Integer> list) {
        int i = list.size() - 1;
        while (i >= 0) {
            list.remove(i);
            i--;
        }
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

//TODO: Fix subtraction method
    public static int sub(ArrayList<Integer> list) {
        int sub = 0;
        for (Integer num : list) {
            sub -= num;
        }
        return sub;
    }

    public static double div(int number1, int number2) {
        return number1 * 1.0 / number2;
    }

    public static int multi(ArrayList<Integer> list) {
        int multi = 1;
        for (Integer num : list) {
            multi *= num;
        }

        return multi;
    }

    public static double pitagora(double number1, double number2) {
        return Math.pow(number1, 2) + Math.pow(number2, 2);
    }

    public static int factorial(int number) {
        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static double exponent(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static double squareRoot(int number1) {
        return Math.sqrt(number1);
    }

    public static double percentage (double number1, double number2) {
        double percent = number1 /100;
        return percent * number2;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("*****************************");
        System.out.println("Welcome to simple Calculator! (Currently with only positive numbers!!!)");
        System.out.println("*****************************");
        while (true) {
            System.out.println("");
            System.out.println("Please select number for desired calculation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. More complex calculations");
            System.out.println("0. Quit");
            System.out.println("Instructions for Addition, Subtraction and Multiplication: If you want to get result, press 0.");
            int selected = Integer.parseInt(reader.nextLine());
            if (selected == 1) {
                while (true) {
                    System.out.print("Please enter number for addition: ");
                    int n = Integer.parseInt(reader.nextLine());
                    if (n != 0) {
                        numbers.add(n);
                    } else {
                        System.out.println("Addition = " + sum(numbers));
                        clearList(numbers);
                        break;
                    }
                }
            } else if (selected == 2) {
                while (true) {
                    System.out.print("Please enter number for subtraction: ");
                    int n = Integer.parseInt(reader.nextLine());
                    if (n != 0) {
                        numbers.add(n);
                    } else {
                        System.out.println("Subtraction = " + sub(numbers));
                        clearList(numbers);
                        break;
                    }
                }
            } else if (selected == 3) {
                while (true) {
                    System.out.print("Please enter first number for division: ");
                    int n = Integer.parseInt(reader.nextLine());
                    System.out.print("Please enter second number for division: ");
                    int m = Integer.parseInt(reader.nextLine());
                    System.out.println("Division = " + div(n, m));
                    break;
                }
            } else if (selected == 4) {
                while (true) {
                    System.out.print("Please enter number for multiplication: ");
                    int n = Integer.parseInt(reader.nextLine());
                    if (n != 0) {
                        numbers.add(n);
                    } else {
                        System.out.println("Multiplication = " + multi(numbers));
                        clearList(numbers);
                        break;
                    }
                }
            } else if (selected == 5) {
                while (true) {
                    System.out.println("");
                    System.out.println("Please select more complex calculation: ");
                    System.out.println("1. Pythagorean theorem");
                    System.out.println("2. Factorial");
                    System.out.println("3. Exponentiation");
                    System.out.println("4. Square root");
                    System.out.println("5. Percentage");
                    int nextSelected = Integer.parseInt(reader.nextLine());

                    if (nextSelected == 1) {
                        System.out.print("Please enter value for a^2: ");
                        int a = Integer.parseInt(reader.nextLine());
                        System.out.print("Please enter value for b^2: ");
                        int b = Integer.parseInt(reader.nextLine());
                        System.out.println("Pythagorean theorem = " + pitagora(a, b));
                        System.out.println("");
                        break;
                    }
                    if (nextSelected == 2) {
                        System.out.print("Please enter number for factorial calculation: ");
                        int n = Integer.parseInt(reader.nextLine());
                        System.out.println("Factorial of number " + n + " = " + factorial(n));
                        System.out.println("");
                        break;
                    }
                    if (nextSelected == 3) {
                        System.out.print("Please enter number for calculation: ");
                        int n = Integer.parseInt(reader.nextLine());
                        System.out.print("Please enter desired exponent: ");
                        int exp = Integer.parseInt(reader.nextLine());
                        System.out.println("Exponentation = " + exponent(n, exp));
                        System.out.println("");
                        break;
                    }
                    if (nextSelected == 4) {
                        System.out.print("Please enter number for calculation: ");
                        int n = Integer.parseInt(reader.nextLine());
                        System.out.println("Square root = " + squareRoot(n));
                        System.out.println("");
                        break;
                    }
                    if (nextSelected == 5) {
                        System.out.print("Please enter percent number: ");
                        int n = Integer.parseInt(reader.nextLine());
                        System.out.print("Please enter number from which you want to calculate percentage: ");
                        int m = Integer.parseInt(reader.nextLine());
                        System.out.println(n + " percent of " + m + " = " + percentage(n,m) + "%");
                        System.out.println("");
                        break;
                    }
                    else {
                        break;
                    }
                }
            }
            else {
                    break;
                }
            }
        }
    }
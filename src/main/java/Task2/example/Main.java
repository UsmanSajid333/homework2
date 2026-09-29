package Task2.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        // for length
        System.out.print("Enter Length :");
        int length= scanner.nextInt();

        //for width
        System.out.print("Enter Width :");
        int width= scanner.nextInt();

        // asking for price using float
        System.out.print("Enter price :");
        double price= scanner.nextDouble();
        // applying formula
        int area = length * width;

        double totalArea = area + (area * 5 / 100.0);

        double totalCost = totalArea * price;
        // printing final answer
        System.out.println("Total amount = " + totalCost);
        }
    }


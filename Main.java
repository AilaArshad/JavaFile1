import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("****<Question 1>****");
        double basicSalary = 1_05_000;
        double dearnessAllowance = basicSalary * (40.0 / 100);
        double houseRent = basicSalary * (20.0 / 100);
        double grosssalary = basicSalary + dearnessAllowance + houseRent;
        System.out.println("Gross Salary: " + grosssalary);

        //Question 2
        System.out.println("\n****<Question 2>****");
        System.out.println("Distance in meters: " + (2614 * 1000));
        System.out.println("Distance in feet: " + (2614 * 3280.84));
        System.out.println("Diatance in inches: " + (2614 * 39370.1));
        System.out.println("Diatance in centimeters: " + (2614 * 100000));

        //Question 3
        System.out.println("\n****<Question 3>****");
        double totalMarks = 80 + 90 + 75 + 60 + 100;
        System.out.println("Aggregate Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + (totalMarks / 500) * 100);

        //Question 4
        System.out.println("\n****<Question 4>****");
        double tempertaure;
        tempertaure = (108 - 32) * (5.0 / 9);
        System.out.println("Temperature in centigrade: " + tempertaure);

        //Question 5
        System.out.println("\n****<Question 5>****");
        double length, width, radius;
        length = width = radius = 36.0;
        System.out.println("Area of Rectangle: " + (length * width));
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
        System.out.println("Area of Circle: " + (Math.PI * Math.pow(radius, 2)));
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));

        //Question 6
        System.out.println("\n****<Question 6>****");
        System.out.println("Power Function: " + (Math.pow(12, 8)));

        //Question 7
        System.out.println("\n****<Question 7>****");
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            int d = num % 10;
            num /= 10;
            sum += d;
        }
        System.out.println("Sum of Digits: " + sum);

        //Question 8
        System.out.println("\n****<Question 8>****");
        int totalPopulation = 80_000;
        int totalmen = 41_600;
        int totalLiteracy = 38_400;
        int literateMen = 28_000;
        int totalwomen = totalPopulation - totalmen;
        int literatewomen = totalLiteracy - literateMen;
        System.out.println("Illetrate men: " + (totalmen - literateMen));
        System.out.println("Illetrate women: " + (totalwomen - literatewomen));

        //Question 9
        System.out.println("\n****<Question 9>****");
        System.out.println("Enter amount: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int num100Notes = amount / 100;
        int remainingAmount = amount % 100;
        int num50Notes = remainingAmount / 50;
        remainingAmount %= 50;
        int num10Notes = remainingAmount / 10;
        System.out.println("Number of 10-unit notes: " + num10Notes);
        System.out.println("Number of 50-unit notes: " + num50Notes);
        System.out.println("Number of 100-unit notes: " + num100Notes);

        //Question 10
        System.out.println("\n****<Question 10>****");
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Selling Price: ");
        double sellingPrice = value.nextDouble();
        System.out.println("Enter Profit: ");
        double profit = value.nextDouble();
        System.out.println("Enter number of items: ");
        double no_ofItem = value.nextDouble();
        double costPrice = sellingPrice - profit;
        double pricePerItem = costPrice / no_ofItem;
        System.out.println("Cost Price per item: " + pricePerItem);
    }
}
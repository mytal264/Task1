import java.util.Scanner;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        int option = menu();
        while (option!=0){
            switch (option) {
                case 1: { circle();
                    break; }
                case 2: { temperature();
                    break; }
                case 3: { factorial();
                    break; }
                case 4: { sumNumberRange();
                    break; }
                case 5: { checkIfPrimeNumber();
                    break; }
                case 6: { palindromic();
                    break; }
                case 7: { primeNumberRange();
                    break; }
                case 8: { gcd();
                    break; }
                case 9: { quadraticEquation();
                    break; }
                case 10: { compoundInterest();
                    break; }
                case 11: { ifFibonacci();
                    break; }
                case 12: { narcissisticNumber();
                    break; }
            }
            option=menu();
        }
        System.out.println("The End.");
    }
    public static int menu (){
        System.out.println("Select the calculation operation according to the following menu:");
        System.out.println("1 - Area and circumference of a circle");
        System.out.println("2 - Temperature conversion");
        System.out.println("3 - Factorial");
        System.out.println("4 - Sum of numbers in range");
        System.out.println("5 - If prime number");
        System.out.println("6 - Palindromic");
        System.out.println("7 - Prime numbers in range");
        System.out.println("8 - GCD");
        System.out.println("9 - Quadratic equation");
        System.out.println("10 - Compound Interest");
        System.out.println("11 - If in fibonacci sequence");
        System.out.println("12 - Narcissistic number");
        System.out.println("0 - End.");
        return scanner.nextInt();
    }
    public static void circle() {
        final double PI = 3.14;
        System.out.println("Enter circle's radius");
        double radius = scanner.nextDouble();
        double area = radius * radius * PI;
        double circumference = 2 * radius * PI;
        System.out.println("The circle's area is " + area + " and the circumference is " + circumference);
    }
    public static void temperature(){
        System.out.println("Enter '1' if the temperature is in Celsius, or '2' if in Fahrenheit");
        int temperatureScale = scanner.nextInt();
        System.out.println("What is the temperature?");
        double temp = scanner.nextDouble();
        if (temperatureScale==1){
            double convertedTemp = temp*9/5+32;
            System.out.println("The temperature in Fahrenheit is "+convertedTemp);
        } else {
            double convertedTemp = (temp-32)*5/9;
            System.out.println("The temperature in Celsius is "+convertedTemp);
        }
    }
    public static void factorial(){
        int num , factorial=1;
        do{
            System.out.println("Enter a number");
            num = scanner.nextInt();
        } while (num<0);
        for (int i=1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void sumNumberRange(){
        int num1 , num2 , sum;
        do {
            System.out.println("Enter first number");
            num1 = scanner.nextInt();
            System.out.println("Enter final number");
            num2 = sum = scanner.nextInt();
            if (num1==num2) System.out.println("Error! You entered two equal numbers.");
        }while (num1==num2);
        do {
            sum = sum+num1;
            if (num1>num2) num1--;
            else num1++;
        }while (num1!=num2);
        System.out.println(sum);
    }
    public static boolean ifPrimeNumber(int num){
        int i;
        for (i=2;i<num;i++){
            if (num%i==0) break;
        }
        return i==num;
    }
    public static void checkIfPrimeNumber(){
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (ifPrimeNumber(num)) System.out.println("The number is a prime number");
        else System.out.println("The number is not a prime number");
    }
    public static int countDigits(int num){
        int digits = 0;
        do {
            num = num/10;
            digits++;
        }while (num!=0);
        return digits;
    }
    public static void palindromic(){
        int num;
        do {
            System.out.println("Enter a five digits number");
            num = scanner.nextInt();
        }while (countDigits(num)!=5 || num<0);
        int unity = num%10;
        int dozens = num/10%10;
        int thousands = num/1000%10;
        int tenThousands = num/10000;
        if (unity==tenThousands && dozens==thousands) {
            System.out.println("The number is palindromic");
        } else System.out.println("The number is not palindromic");
    }
    public static void primeNumberRange() {
        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter final number");
        int finalNum = scanner.nextInt();
        int count = 0;
        for (int i=firstNum;i<=finalNum;i++){
            if (ifPrimeNumber(i)) System.out.print(i+"  ");
            else count++;
        }
        if (count == finalNum - firstNum + 1) {
            System.out.println("There isn't a prime number in this range");
        } else System.out.println();
    }
    public static void gcd(){
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        int i;
        if (num1>num2) i = num2;
        else i = num1;
        do {
            if (num1 % i == 0 && num2 % i == 0){
                System.out.println("The GCD of these two numbers is " + i);
                break;
            } else i--;
        }while (i!=0);
    }
    public static void quadraticEquation(){
        System.out.println("Enter parameter a");
        double a = scanner.nextDouble();
        System.out.println("Enter parameter b");
        double b = scanner.nextDouble();
        System.out.println("Enter parameter c");
        double c = scanner.nextDouble();
        double part1Square = b * b;
        double part2Square = 4 * a * c;
        double denominator = 2 * a;
        if (part1Square < part2Square) {
            System.out.println("There is not a solution for this equation");
        } else if (part1Square == part2Square) {
            double x1 = -b / denominator;
            System.out.println("There is one solution for this equation: x= "+x1);
        } else { part1Square = Math.sqrt(part1Square - part2Square);
                double x1 = (-b + part1Square)/denominator;
                double x2 = (-b - part1Square)/denominator;
                System.out.println("There is two solutions for this equation:");
                System.out.println("x1= " + x1 + " x2= " + x2);
        }
    }
    public static void compoundInterest(){
        System.out.println("Enter the amount of money you invest");
        double initialInvestment = scanner.nextDouble();
        double investmentFund = initialInvestment;
        System.out.println("Enter the regular monthly interest rate");
        double monthlyInterest = scanner.nextDouble();
        monthlyInterest = 1 + monthlyInterest / 100;
        for (int i=1;i<=36;i++) {
            investmentFund = investmentFund * monthlyInterest;
            if (i % 3 == 0) {
                if (i % 12 == 0){
                    System.out.println("The amount of money to withdraw after "+i+" months is " + investmentFund);
                } else {
                    double profit = investmentFund-initialInvestment;
                    System.out.println("The amount of money to withdraw after "+i+" months is " +
                            (initialInvestment + profit / 2));
                }
            }
        }
    }
    public static void ifFibonacci(){
        int a1=0,a2=1,aN=0;
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        while (aN < num) {
            aN = a1+a2;
            a1=a2;
            a2=aN;}
        if (aN==num) System.out.println("The number is in fibonacci sequence");
        else System.out.println("The number isn't in fibonacci sequence");
    }
    public static void narcissisticNumber(){
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int numBelow=num+1 , numAbove=num-1;
        do {
            numBelow--;
            numAbove++;
        }while (!ifNarcissistic(numBelow)&&!ifNarcissistic(numAbove));
        if (ifNarcissistic(numBelow)){
            if (numBelow==num) System.out.println("The number you entered is narcissistic number");
            else System.out.println("The nearest narcissistic number is "+numBelow);
        } else System.out.println("The nearest narcissistic number is "+numAbove);
    }
    public static boolean ifNarcissistic(int num){
        int sum=0 , sumSquare=1 , checkNum=num , digits=countDigits(num);
        do{
            for (int i=0;i<digits;i++){
                sumSquare = sumSquare*(checkNum%10);
            }
            sum = sum + sumSquare;
            sumSquare = 1;
            checkNum = checkNum/10;
        }while (checkNum!=0);
        return sum==num;
    }
}
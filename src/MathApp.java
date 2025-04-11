public class MathApp {
    public static void main(String[] args){
        double bobsalary = 55000;
        double graysalary = 62000;
        double highestsalary=  Math.max(bobsalary,graysalary);// Compare the highest two salaries

        System.out.println("the highest salary is : $ " + highestsalary);
        System.out.println();

        double carprice = 23345;
        double truckprice = 48987;
        double lowestprice = Math.min(carprice,truckprice);//compare the lowest price

        System.out.println("the lowest price is : % " + lowestprice);
        System.out.println();

        double radius = 7.25;//Area of a circle with radius 7.25
        double area = Math.PI * Math.pow(radius,2);//A=pi*r^2
        System.out.printf("the area of the circle is %.2f\n", area);
        System.out.println();

        double number= 5;
        double root = Math.sqrt(number);//  Square root of 5.0
        System.out.printf("the square root of %.1f is %.2f\n" , number, root);
        System.out.println();

        int x1= 5 , y1 = 10;
        int x2= 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        // Distance between (5, 10) and (85, 50)
        System.out.printf("the distance between the points is %.2f\n", distance);
        System.out.println();

        double negativenumber = -3.8;
        double positivevalue = Math.abs(negativenumber);
        //Absolute value of -3.8
        System.out.printf("the absolute positive number of %.1f is %.2f", negativenumber,positivevalue);
        System.out.println();

        //Generate a random number between 0 and 1
        double randomnumber = Math.random();
        System.out.println("the random number between 0 and 1 is "+ randomnumber);
    }
}

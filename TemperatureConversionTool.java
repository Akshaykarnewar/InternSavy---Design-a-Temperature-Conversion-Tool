import java.util.Scanner;

public class TemperatureConversionTool 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Welcome to the Temperature Conversion Tool!");
    
    System.out.print("\nPlease enter a temperature in Fahrenheit (F): ");
    double fahrenheit = s.nextDouble();

    // convert Fahrenheit to Celsius
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
    System.out.println("The temperature in Celsius (C) is " + celsius);

    // convert Celsius to Fahrenheit
    System.out.print("\nPlease enter a temperature in Celsius (C): ");
    celsius = s.nextDouble();
    fahrenheit = (celsius * 9.0 / 5.0) + 32;
    System.out.println("The temperature in Fahrenheit (F) is " + fahrenheit);

    System.out.println("\nThank you for using the Temperature Conversion Tool!");
    s.close();
  }
}
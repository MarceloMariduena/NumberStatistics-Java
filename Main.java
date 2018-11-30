/* @author: Marcelo Mariduena */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Declaring variables.
    double total = 0;
    int i = 0;
    double min = 0;
    double max = 0;
    double temp = 0;

    // Scanner object named input.
    Scanner input = new Scanner(System.in);

    // Informs and prompts the user.
    System.out.println("This program provides information on numerical inputs.");
    System.out.println("Enter as many numbers as you want. Input -9999 to exit");

    while (temp != -999) {
      // Program takes an input and assigns it "temp" variable.
      temp = input.nextDouble();

      // Exits the program if input value was "-999".
      if (temp == -999){
        break;
      }
      if (temp < min) {
        min = temp;
      } 
      if (temp > max) {
        max = temp;
      }
      
      total += temp;
      i++;
    }

    double average = total/i;
    System.out.println("The average was " + average);
    System.out.println("The minimum input was " + min);
    System.out.println("The maximum num was " + max);

  }
}

package cse360assignment02;

/**
 * A class that is able to get the total, add, and subtract. Includes a toString
 * @author Cooper Gretzema
 */
public class AddingMachine {
  private int total;
  
  /**
   * Constructor in order to initialize an AddingMachine Object
   * @return AddingMachine
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * Method to get the private instance variable total from AddingMachine Object
   * @return total  The private instance variable total
  */
  public int getTotal () {
    return 0;
  }
  /**
   * Method to add a new number to the total stored in the AddingMachine
   * @param value  the value that is to be added to the total
  */
  public void add (int value) {
  }
  /**
   * Method to subtract a new number to the total stored in the AddingMachine
   * @param value  the value that is to be subtracted to the total
  */
  public void subtract (int value) {
  }
  /**
   * Method to print a history of all operations and the final total
   * @return history  a history of all operations and the current total
  */
  public String toString () {
    return "";
  }
  /**
   * Method to clear all the operations on the calculator and set total to 0
   * @return void
  */
  public void clear() {
  }
}
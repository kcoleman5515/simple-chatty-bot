// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {

    // Simple int declarations
    int two = 2;
    int ten = 10;
    // Arithmetics to create new values
    int twelve = two + ten;
    int eight = ten - two;
    int twenty = two * ten;
    int five = ten / two;
    int zero = ten % two;
    // Negative numbers just add the minus at the beginning
    int minusTwo = -two;
    // Long numbers receive underscores for readability
    int million = 1_000_000;

    // Printing out a simple variable (where it's pointing to)
    int number = 100;
    System.out.println(number);

    // L is the literal for longs
    long one = 1L;
    long twentyTwo = 22L;
    long bigNumber = 100_000_000_000L;

    long result = bigNumber + twentyTwo - one;
    System.out.println(result);

    // Forms of the assignment operator
    int n = 10;
    n += 4;

  }
}

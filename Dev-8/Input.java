import java.util.*;

/**
 * Class to input double matrix.
 */
class Input {

/**
 * Method to input double array matrix from command line
 */
  private Scanner scan = new Scanner(System.in);
  private int matrixNumber = 0;

  public double[][][] get() {
    System.out.print("Input number of matrix which you want to multiplicate: ");
    matrixNumber = scan.nextInt();
    int[] rawNumber = new int[matrixNumber];
    int[] lineNumber = new int[matrixNumber];

    for(int i = 0; i < matrixNumber; i++) {
      System.out.println();
      System.out.print("Input raw of matrix �: " + (i + 1) + ": ");
      rawNumber[i] = scan.nextInt();
      System.out.print("Input line of matrix �: " + (i + 1) + ": ");
      lineNumber[i] = scan.nextInt();
    }
    double[][][] mass = new double[matrixNumber][rawNumber[1]][lineNumber[0]];


    if(lineNumber[0] == rawNumber[1]) {
      System.out.println();
      for(int i = 0; i < matrixNumber; i++) {
        System.out.println("Input matrix � " + (i + 1) + ": ");
        for(int j = 0; j < lineNumber[i]; j++) {
          System.out.println("Input line � " + (j + 1) + ": ");
          for(int k = 0; k < rawNumber[i]; k++) {
            System.out.print("Input element � " + (k + 1) + ": ");
            mass[i][j][k] = scan.nextDouble();
          }
          System.out.println();
        }
      }
    }
    else {
        System.out.println("Input valid matrix!");
    }

    return mass;
  }
}
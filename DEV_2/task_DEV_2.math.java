package task_DEV_2.calcul;

import java.math.*;

public class Maths {

  /**
   *calculat results of operation
   */

  double add(double a, double b) {
    double answer = a+b;
    return answer;
    }

  double subtract(double a, double b) {
    double answer = a-b;
    return answer;
    }

  double multiply(double a, double b) {
    double answer = a*b;
    return answer;
    }

  double divide(double a, double b) {
    double answer = a/b;
    return answer;
    }

  double power(double a, double b){
    double answer =a;

    for (int i=a; i<=b; i++){
        answer *= a;
        }

    return answer;
    }

}
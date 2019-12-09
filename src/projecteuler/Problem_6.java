package projecteuler;
/*
->The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

->The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

->Hence the difference between the sum of the squares of the first 
ten natural numbers and the square of the sum is 3025 − 385 = 2640.

->Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.
*/
//Answer: 25164150
class SolveProblem6{
    double[] arr = new double[100];
    int sum = 0;
    void getSolve(){
        for(int i=1; i < 101; i++){
            System.out.println("i::"+i+"=");
            arr[i-1] = i;
        } 
        sum = (int)powSumOfElem(arr); // (1+//+10)^2;
        powEveryElem(arr); // 1^2 + ... + 10^2;
        System.out.println("sum::"+sum);
        divide(arr,sum);
    }
    void powEveryElem(double[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.pow(arr[i], 2);
        }
    }
    double powSumOfElem(double[] arr){
      double sum = 0;
      for(int x = 0; x<arr.length; x++){
          System.out.println("elem::"+arr[x]);
          sum += arr[x];
      }
      System.out.println("sum::"+sum);
      sum = Math.pow(sum, 2);
      return sum;
    }
    void divide(double[] arr, int sum){
        int arsum=0;
        for(int x=0;x < arr.length; x++){
            arsum += arr[x];
        }
        sum = sum-arsum;
        System.out.println("finsum::"+sum);
    }
}
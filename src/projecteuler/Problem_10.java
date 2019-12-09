package projecteuler;
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
Answer:: 142913828922
*/
class SolveProblem10{
    int primecounter = 0;
    final int border = 2000000;
    long sum;
    void getSolve(){
        int error;
        for(int i = 1; ; i++){
            error = checkPrime(i);
            if(error == 2){
              // System.out.println("Prime::"+i);
               sum += i;
               primecounter++;
               if(primecounter==border){
                   break;
               }
               if(primecounter % 1000 == 0){
                   System.out.println("1000");
               }
            }
        }
        System.out.println("Prime::"+sum);
    }
    
    int checkPrime(int prime){
        int error = 0;
        for(int i = 1; i <= prime; i++){
            if(prime % i == 0){
                error++;
            }
        }
    return error;
    }
    
}
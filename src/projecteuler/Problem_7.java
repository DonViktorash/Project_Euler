package projecteuler;
/*
->By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
    we can see that the 6th prime is 13.
->What is the 10 001st prime number?
*/
class SolveProblem7{
    public final int prime = 0;
    int count = 0;
    int primecounter = 1;
    void getSolve(){
        int error = 0;
        for(int prime = 1;primecounter < 10002 ; prime++){
            error = checkPrime(prime);
            if(error == 2){
                System.out.println("This number is prime::"+prime);
                System.out.println("Primecounter::"+primecounter);
                primecounter++;
            } 
        }
    }
    int checkPrime(int prime){
        int error = 0;
        for(int x=1;x <= prime; x++){
            if(prime%x==0){
                error++;
            }
        }
        return error;
    }
}
package projecteuler;
/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
class SolveProblem3{
    public final long  num = 600851475143L;
    int count = 0;
    int test;
    int result = 1;
    void test(){
        for(int i = 0; i <= num; i++){
            test = primeFactor(i,num);
            if(result == num){
                System.out.println("exit");
                break;
            }
            if(test == 2){
                System.out.println("Prime::"+i);
                result *= i;
            }
        }
    }
    int primeFactor(int i, long num){
        count = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0){
                if(num % i == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
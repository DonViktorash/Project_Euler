package projecteuler;
/*
CORRECT, BUT NOT WORKING
->The following iterative sequence is defined for the set of positive integers:

->n → n/2 (n is even)
->n → 3n + 1 (n is odd)

->Using the rule above and starting with 13, we generate the following sequence:

->13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
->It can be seen that this sequence (starting at 13 and finishing at 1) 
contains 10 terms. Although it has not been proved yet (Collatz Problem),
it is thought that all starting numbers finish at 1.

->Which starting number, under one million, produces the longest chain?

->NOTE: Once the chain starts the terms are allowed to go above one million.
*/
class SolveProblem14{
    int chain;
    int max = -1;
    long border = 1000001;
    void getSolve(){
        for(long num = 1; num < border; num++){
            someMeth(num);
           
        }
        //someMeth(13);
        System.out.println("Max->::"+(++max));
    }
    void someMeth(long num){
        chain = 0;
        long test = num;
        //System.out.println("num"+num);
        while(num != 1){
            if(num%2 == 0){
                //System.out.println("Even::"+num);
                num = num/2;
                chain++;
            }else
                if(num%2 != 0){
                  //System.out.println("NotEven::"+num);
                    num = (3*num) + 1;
                    chain++;
                }
        }
        if(chain > max){
            max = chain;
            System.out.print("num::"+test+",");
            System.out.println("Max::"+max);
            chain = 0;
        }
    }
}
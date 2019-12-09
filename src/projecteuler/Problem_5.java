package projecteuler;
/*
->2520 is the smallest number that can be divided by each of the 
numbers from 1 to 10 without any remainder.
->What is the smallest positive number that is evenly divisible 
by all of the numbers from 1 to 20?
*/
class SolveProblem5{
    public final int n = 2520; //  1 - 10 без остатка
    int test;
    int bound = 20;
    void solve(){
        for(int i=232792550;i <232792570 ;i++){
           test = getResult(i);
           //System.out.println("test:"+test+",i:"+i);
           if(test == bound){
            System.out.println("Correct::"+i);
            return;
           }
        }
    }
    int getResult(int i){
        int count = 0;
        for(int j = 1; j <= bound; j++){
            if(i % j == 0){
                count++;
                System.out.println("i::"+i+"count:"+count);
            }
        }
        if(count == bound){
            return count;
        }
        return 0;
    }
}
package projecteuler;
/*
->2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

->What is the sum of the digits of the number 2^1000?
-> answer-> 1366, ne resheno
*/

class SolveProblem16{
    long i;
    int length;
    int count = 0;
    int sum = 0;
    long[] arr = new long[1];
    void getSolve(){
        i = (long) Math.pow(2,15);
        System.out.println("i::"+i);
        count = logic(i);
        sum(count,i);
    }
    int logic(long i){ 
        for(int j = 10;i!=0;){
            System.out.println("i,delim::"+i);
            i /= j;
            count++;
        } 
        System.out.println("count::"+count);
        return count;
    }
    int sum(int count, long i){
        for(int j = 0; j < count; j++){
            System.out.println("i%10->"+(i%10));
            sum += i%10;
            i = i / 10;
        }
        System.out.println("sum::"+sum);
        System.out.println("i::"+i);
        return 1;
    }
}
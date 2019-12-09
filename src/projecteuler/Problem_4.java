package projecteuler;
/*
->A palindromic number reads the same both ways. 
->The largest palindrome made from the product of two 2-digit 
numbers is 9009 = 91 × 99.
->Find the largest palindrome made from the product of two 3-digit
numbers.
*/
class SolveProblem4{
    int max = -1;
    int f;
    void getResult(){
        for(int i = 100; i<999 ;i++){
            for(int j = 100;j<999;j++){
               f = findPalindrom(i*j);
               if(f>max){
                   max = f;
               }
            }
        }
        System.out.println("max:"+max);
    }
    int findPalindrom(int pal){
       int c = pal;
           if((pal / 100000) == (pal % 10)){
               pal%=100000;
               pal/=10;
               
               if((pal / 1000) == (pal % 10)){
                  pal%=1000;
                  pal/=10; 
               }
               
               if((pal / 10) == (pal % 10)){
                  pal%=10;
                  pal/=10;
                  //System.out.println("that was palindrom"+c);
                  return c;
               }
           }
       return 0;
    }
}
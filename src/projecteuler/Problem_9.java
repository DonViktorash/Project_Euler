package projecteuler;
/*
->A Pythagorean triplet is a set of three 
natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
->For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
->There exists exactly one Pythagorean 
triplet for which a + b + c = 1000.
->Find the product abc.

*/

class SolveProblem9{
    void getSolve(){
        int f=0;
        for(int c = 1; c <= 1000; c++){
          //f =  
            //System.out.println(f);
            logic(c);
        }
    }
    void logic(double c){
        double sum;
        double powc = 0;
        for(double b = 1; b<c; b++){
            for(double a=1; a<b; a++){
                //System.out.println("a,b,c::"+a+"/"+b+"/"+c);
                sum = Math.pow(a, 2) + Math.pow(b, 2);
                powc = Math.pow(c, 2);
                if(sum == powc){
                    System.out.println("This is solve->"+(int)a+"/"+(int)b+"/"+(int)c);
                    if((a + b + c) == 1000){
                        System.out.println("1000 is here"+(a*b*c));
                    }
                }
                
            }
        }
    }
}
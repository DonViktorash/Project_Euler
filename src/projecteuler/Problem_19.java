package projecteuler;

class SolveProblem19{
    abstr a = new abstr();
    void getSolve(){
        a.getArrMonths();
    }
    
}
class abstr{
    int[] arr = {0,1,0,1,0,1,0,1,0,1,0,1};
    int[] months = {31,28,31,30,31,30,31,30,31,30,31,30};
    String[] str = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    //int[] months = {31,22,31,30,31,30,31,30,31,30,31,30};
    void getArrMonths(){
        int z = 0;
        for(int test=0; test < months.length; test++){ 
            System.out.println("New month::");
            int f = months[test];
            System.out.println("Dlinna:"+f);
            for(int i=0; i<f; i++){
                if(z!=7){
                    System.out.print("i::"+i+"z::"+z);
                    System.out.print(str[z]+",");
                    z++;
                }else if(z == 7){
                    System.out.print("i::"+i);
                    z = -1;
                    System.out.println();
                    z++;
                }
            }
            System.out.println();
        }
    }
}
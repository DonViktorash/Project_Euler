package projecteuler;
import java.io.*;
class SolveProblem18{
    void getSolve()
    throws IOException{
       FileInputStream fin = null;
       int i = 0;
       int[] arr = new int[256];
       int count = 0;
        try{
            fin = new FileInputStream("num.txt");
            do{
              i = fin.read();
              System.out.print((char)i);
              arr[count] = (char)i;
              count++;
            }while(i != -1);  
        }
        catch(IOException exc){
            System.out.println("Error with open::"+exc);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Array Exc::"+exc);
        }
        finally{
            if(fin != null) fin.close();
        }
        System.out.println();
        for(i = 0; i < arr.length; i++){
            System.out.print((char)arr[i]);
        }
        System.out.println("test::"+(char)(arr[0]+arr[1]));
    }
}
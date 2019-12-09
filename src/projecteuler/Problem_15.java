package projecteuler;
/*
->Starting in the top left corner of a 2×2 grid, 
and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.

->How many such routes are there through a 20×20 grid?

*/

class SolveProblem15{
    void getSolve(){
        creatMatrix();
    }
    void creatMatrix(){
        int[][] arr = new int[20][20];
        for(int i = 0; i < 20; i++){
            for(int j=0; j < 20; j++){
                arr[i][j] = 1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
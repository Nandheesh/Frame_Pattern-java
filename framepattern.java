The program must accept an integer matrix of size MxN as the input. The program must print the desired pattern as shown in the Example Input/Output section. 

Boundary Condition(s): 
1 <= M, N <= 50 1 <= Each Integer Value <= 999 

Input Format: 
The first line contains the integers M and N separated by a space. The next M lines each contain N integers separated by space(s). 

Output Format: The first M+2 lines contain the desired pattern as shown in the Example Input/Output sections. 

Example 

Input/Output 1: 
Input: 3 x 4
8 6 5 8 
4 8 5 2 
3 7 6 8 
Output: 
* * * * * * 
* 8 6 5 8 * 
* 4 8 5 2 * 
* 3 7 6 8 * 
* * * * * * 

Example 
Input/Output 2: 
Input: 5 x 3 
  7 2 4 
  2 5 5 
  4 9 1 
  5 2 6 
  2 9 2 
Output: 
* * * * * 
* 7 2 4 * 
* 2 5 5 * 
* 4 9 1 * 
* 5 2 6 * 
* 2 9 2 * 
* * * * *


import java.util.*;
class Main{
  public static void main(String[] ar){
    Scanner num = new Scanner(System.in);
        int a = num.nextInt() , b = num.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = num.nextInt()
            }
        }
        for(int i=0;i<=a+1;i++){
            for (int j = 0; j <= b+1; j++) {
                if (i == 0 || i == a + 1 || j == 0 || j == b + 1) 
                  System.out.print("*" +" ");
                else
                  System.out.print(arr[i-1][j-1]+" ");
            }
            System.out.println("");
        }
  }
}

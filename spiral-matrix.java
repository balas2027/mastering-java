import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int[][] matrix = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        };
        
        
        
        ArrayList<Integer> al = new ArrayList<>();
        
       
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
         
        while(bottom >= top && right >= left) 
        {
         //left -> right
         for(int i = left; i <= right ; i++ )
         {
             al.add(matrix[top][i]);
         }
         top++;
         
         //top -> bottom (right)
         for(int i = top ;i <= bottom ;i++)
         {
             al.add(matrix[i][right]);
         }
         right--;
         
         //right -> left 
         for(int i = right; i >= left ; i--)
         {
             al.add(matrix[bottom][i]);
         }
         bottom--;
         
         //bottom -> top (left)
         for(int i = bottom ; i >= top ;i--)
         {
             al.add(matrix[i][left]);
         }
         left++;
        }
        if(al.size() == 0)
        {
            System.out.print("empty list");
        }
        for(int i = 0; i < al.size();i++)
        {
            if(i % matrix[0].length == 0)
            {
                System.out.println();
            }
            System.out.print(al.get(i) + " ");
        }
    }
}
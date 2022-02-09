class Matristekisayiciftleriniardisilhalegetirmek
{
    public static void main(String[] args) throws Exception
    {
        int mat[][]={{3,5},{6,9},{7,5},{7,6},{3,9}};
        int i, j, k, row, col, r, temp, num;
        row=5;
        col=2;
        for(i=0;i<row-1;i++)
        {
            num=mat[i][1];
            r=i;
            for (j = i+1; j < row; j++) 
            {
                for ( k = 0; k < col; k++) 
                {
                    if(num == mat[j][k])
                    {
                        r=j;
                    }    
                }   
            }
            temp=mat[i+1][0];
            mat[i+1][0]=mat[r][0];
            mat[r][0]=temp;
            
            temp=mat[i+1][1];
            mat[i+1][1]=mat[r][1];
            mat[r][1]=temp;
            
            if(mat[i+1][1]==num)
            {
                mat[i+1][1]=mat[i+1][0];
                mat[i+1][0]=num;
            }
        }
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                System.out.print(mat[i][j]+" ");
                 
            } 
            System.out.println();    
         }
    }
}

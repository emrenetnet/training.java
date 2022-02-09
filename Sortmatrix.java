class Sortmatrix
{
    public static void main(String args[]) throws Exception
    {
        int m[][]={{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i,j,row,col,temp;
        row=4;
        col=3;
        for(i=0;i<row*col-1;i=i+1)
        {
            for(j=0;j<row*col-1-i;j=j+1)
            {
                if(m[j/col][j%col]>m[(j+1)/col][(j+1)%col])
                {
                    temp=m[j/col][j%col];
                    m[j/col][j%col]=m[(j+1)/col][(j+1)%col];
                    m[(j+1)/col][(j+1)%col]=temp;
                }
            }
        }
        for (i = 0; i < row; i=i+1) 
        {
            for (j = 0; j < col; j=j+1) 
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();    
        }
    }
}

public class SecandMax 
{
    public static void main(String[] args) throws Exception
    {
        int x[]={3, 5, 18, 9, 21, 20, 4, 17, 8, 1};
        int i, size, max1, max2;
        size=10;
        max1=x[0];
        max2=x[1];
        for(i=1; i<size; i++)
        {
            if(x[i]>max1)
            {
                max2=max1;
                max1=x[i];
            }
            else if(x[i]>max2)
            {    
                max2=x[i];
            }   
        }
        System.out.println("Dizinin büyük ikinci elemanı:"+max2);   
    }    
}

import java.util.Scanner;

public class GameFourNumbers                                                            /*Sınıf isimlendirme*/
{
    public static void main(String[] args) throws Exception                        
    {
        java.util.Random generator=new java.util.Random(System.currentTimeMillis());    /*Rastgele sayı üretimi için generator nesnesinin oluşturulması*/
        Scanner Keyboard=new Scanner(System.in);
        int nums[]=new int[4];                                                          
        int guess[]=new int[4];
        int i, j, size, input, num, sumPos, sumNeg, isGameOver, count, flag;
        size=4;
        count=0;
        while(count!=size)
        {
            num=generator.nextInt(10);
            flag=0;
            for (i = 0; i < count; i = i + 1)
            {
                if(nums[i]==num)
                {
                    flag=1;
                }
            }
            if (flag==0)
            {
                nums[count]=num;
                count=count+1;    
            }       
        }
        System.out.println();
        System.out.println("Oyuna başlayabilirsiniz.");

        isGameOver=0;
        count=0;
        while (isGameOver==0)
        {
            count=count+1;
            System.out.println();
            System.out.print(count + ".tahmini giriniz :");
            input=Keyboard.nextInt();
            for (i = size-1; i>=0; i=i-1)                                               //Klavyeden girilen sayı basamaklarına ayrılıyor.
            {
                guess[i]=input%10;
                input=input/10;    
            }
            sumPos=0;
            sumNeg=0;
            for (i = 0; i<size; i=i+1) 
            {
                for (j = 0; j<size; j=j+1) 
                {
                    if (guess[i]==nums[j]) 
                    {
                        if (i==j) 
                        {
                            sumPos=sumPos + 1;
                        }
                        else
                        {
                            sumNeg=sumNeg+1;
                        }
                    }   
                }    
            }
            for (i=0; i<size; i++)
            {
                System.out.print(guess[i]);
            }
            System.out.println(" +"+sumPos+" -"+sumNeg);
            if (sumPos==4) 
            {
                isGameOver=1;
                System.out.println(count+"adımda bildiniz.");
            }
        }
    }   
}

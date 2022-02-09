import java.util.*;

class AmiralBattiOyunu
{
    public static void main (String[] args) throws Exception
    {
        java.util.Random generator = new java.util.Random(System.currentTimeMillis());
        int board[][]=new int [10][10];                                                             //gemilerin yerleştirildiği matris.
        int player[][]=new int [10][10];                                                            //oyuncunun hamlelerinin tutulduğu matris.
        int ship[]={0, 4, 3, 2, 1};                                                                 //gemilerin adedini tutan dizi 0 nolu eleman kullanılmıyor. 
        int i, j, row, col, size;
        int num, dir, shipSize, count, r, c, rl, cl, flag;
        int right, down, hit;
        row=10;
        col=10;
        size=5;
        count=0;
        shipSize=1;
        Scanner Keyboard=new Scanner(System.in);
        while(shipSize<=4)
        {
            dir=generator.nextInt(2);                                                               //yön üretiliyor (0 sağa, 1 aşağıya) 
            if(dir==0)                                                                              //yöne göre satır sütun sınırları, yerleştirilecek geminin sınırları belirleniyor.
            {
                rl=row;
                cl=col-shipSize+1;
                right=2+shipSize;
                down=3;
            }
            else
            {
                rl=row-shipSize+1;
                cl=col;
                right=3;
                down=2+shipSize;
            }
            r=generator.nextInt(rl);                                                                //Geminin nereye yerleştirileceği yerin boş olup olmadığına bakılıyor.
            c=generator.nextInt(cl);
            flag=0;
            for(i=r-1;i<(r-1)+down;i=i+1)
            {
                for(j=c-1;j<(c-1)+right;j=j+1)
                {
                    if(i>=0 && i<row && j>=0 && j<col)
                    {
                        if(board[i][j]!=0)
                        {
                            flag=1;                                                                 // flag'in 0'a eşit olması genimim yerleştirileceği yerin boş olduğunu gösteriyor.
                        }
                        if(flag==0)                                                                 // gemi yerleştiriliyor.
                        {
                            for(i=r;i<r+down-2;i=i+1)
                            {
                                for(j=c;j<c+right-2;j=j+1)
                                {
                                    board[i][j]=shipSize;
                                }
                            }                                          
                                    count=count+1;                                                  // adet bir arttırılıyor.
                                    if(ship[shipSize]==count)                                       // gemiden istenen adet yerleştirilmişse bir sonraki gemiye geçiliyor.
                                    {
                                        shipSize=shipSize+1;
                                        count=0;
                                    }
                                
                            
                        }
                    }

                }
            }
        }
        for(i=0;i<row;i=i+1)                                                                       // Gemilerin yerleştirildiği matris yazdırılıyor.
        {
            for(j=0;j<col;j=j+1)
            {
                System.out.print(board[i][j]+" ");
                
            }
            System.out.println();
        }
        count=0;                                                                                    // Toplamda yirmi atış yapıldığında oyun bitiyor.
        hit=0;
        while(hit<20)
        {
            count=count+1;                                                                          // atış sayısı bir arttırılıyor.
            System.out.print("satır giriniz:");                                                     // atış yapılıyor.
            r=Keyboard.nextInt();
            System.out.print("sütunu giriniz:");
            c=Keyboard.nextInt();
            if (board[r][c]!=0)                                                                     // atışın isabeli olup olmadığına bakılıyor eğer isabetli ise oyuncunun matrisine gemi numarası yazdırılıyor değilse 9 sayısı yazdırılıyor. 
            {
                hit=hit+1;
                player[r][c]=board[r][c];
            }
            else
            {
                player[r][c]=9;                                                                     
            }
            for(i=0;i<row;i=i+1)
            {
                for(j=0;j<col;j=j+1)
                {
                    System.out.print(player[i][j]);
                    
                }
                System.out.println();
            }
        }
        System.out.println("Tebrikler!" + count + "adimda bildiniz.");
    }    
}

import java.util.Scanner;

public class TicTocToe 
{
    public static void main(String[] args) throws Exception
    {
        Scanner Keyboard = new Scanner(System.in);
        int board[][]=new int [3][3];
        int i, j, flag, row, col, player, countPlay;
        int r=0;           
        int c=0;
        row=3;
        col=3;
      
        System.out.println("oyuna başlayabilirsiniz.");
        
        for(i=0; i<row; i=i+1)                                              //Oyun tahtası yazdırılıyor.
        {
            for(j=0;j<col;j=j+1)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        flag=0;
        player=1;
        countPlay=0;
        while (flag==0)                                                         //Oyuncu oynayacağı yeri bildiriyor. 
        {
            System.out.println(player+". oyuncu oynayacak.");
            System.out.print("Satır numarasını giriniz:");
            r=Keyboard.nextInt();
            System.out.print("Sütun numarasını giriniz:");
            c=Keyboard.nextInt();
        }
        board[r][c]=player;                                                     //Oyun tahtaya yerleştiriliyor.
        countPlay=countPlay+1;
        if(board[0][0]!=0)                                                      //Oyun bitti mi kontrol ediliyor. Birinci köşegene bakılıyor.
        {
            if(board[0][0]==board[1][1])
            {
                if(board[1][1]==board[2][2])
                {
                    flag=1;
                }
            }
        }
        if(board[0][2]!=0)                                                            //İkinci köşegene bakılıyor.
        {
            if(board[0][2]==board[1][1])
            {
                if(board[1][1]==board[2][0])
                {
                    flag=1;
                }
            }
        }
        if(board[r][0]==board[r][1])                                                    //Oynanan satır kontrol ediliyor.
        {
            if(board[r][1]==board[r][2])
            {
                flag=1;
            }
        }
        if(board[0][c]==board[1][c])                                                    //Oynanan Sutün kontrol ediliyor.
        {
            if(board[1][c]==board[2][c])
            {
                flag=1;
            }
        }
        for(i=0; i<row; i=i+1)                                                          //Oyun tahtasının son durumu yazılıyor.
        {
            for(j=0; j<col; j=j+1)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        if(flag==1)                                                                     //Oyun bittiyse kazanan yazılıyor.
        {
            System.out.println(player+"nolu oyuncu kazandı.");
        }
        if(player==1)
        {
            player=2;
        }
        else
        {
            player=1;
        }
        if(countPlay==9)
        {
            if(flag==0)
            {
                flag=1;
                System.out.println("Oyun berabere bitti.");
            }
        }
    }
}

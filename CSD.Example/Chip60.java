class Chip60
{
    public static void main(String[] args) throws Exception 
    {
        java.util.Random generator=new java.util.Random(System.currentTimeMillis());
        int sixty[]=new int[91];
        int five[]=new int[5];
        int i,j, sizes, sizef, count, num, flag, sum;
        double ratio, win, total;
        sizes = 91;
        sizef = 5;
        win=0;
        total=100000;
        for (i = 0; i <= total; i++) {
            for(j=0;j<sizes;j=j+1){
                sixty[j]=0;                 //60 Değişik sayı oluşturuluyor.
            }
            count = 0;
            while(count!=60)
            {
                num=generator.nextInt(90)+1;
                if (sixty[num]==0) {
                    sixty[num] = 1;
                    count=count+1;
                }
            }
            sum = 0;
            count = 0;
            while(count!=sizef){
                num=generator.nextInt(90)+1;
                flag = 0;
                for(j=0;j<count;j=j+1)
                if(num==five[j])
                flag=1;
                if(flag==0)
                {
                    five[count] = num;
                    count=count+1;
                    sum=sum+sixty[num];
                }
            }
            if(sum==5)
            win=win+1;                                 //Beş değişik sayı oluşturuluyor, Altmış taşın içinde olup olmadığına bakılıyor.
        }
        ratio=win/total;
        System.out.println("kazanma olasiligi="+ratio);
    }
}

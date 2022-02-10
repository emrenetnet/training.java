import java.nio.file.spi.FileSystemProvider;

public class MergeArray
{
    public static void main(String[] args) throws Exception
    {
        int x[]={-1, 4, 6, 7, 12, 15, 16, 26, 27, 34};
        int y[]={3, 5, 9, 20, 23, 30, 37, 39, 41, 45};
        int z[]=new int[20];

        int i, sizexy, sizez, px, py, pz;
        sizexy=10;
        sizez=20;

        px=0;
        py=0;
        pz=0;
       
        while(pz!=sizez)
        {
            if(x[px]<y[py])
            {
                z[pz]=x[px];
                px=px+1;
                pz=pz+1;
                if(px==sizexy)
                {
                    for(i=py; i<sizexy; i=i+1)
                    {
                        z[pz]=y[i];
                        pz=pz+1;
                    }
                }
            }
            else
            {
                z[pz]=y[py];
                pz=pz+1;
                py=py+1;
                if(py==sizexy)
                {
                    for(i=px; i<sizexy; i=i+1)
                    {
                        z[pz]=x[i];
                        pz=pz+1;
                    }
                }
            }
        }
        for(i=0; i<sizez; i=i+1)
            System.out.print(z[i]+" ");
    }   
}

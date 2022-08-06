import java.util.Scanner;
public class Carteirinha
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int m,k,i,escutado,l,q;
        String r ="";

        while(scan.hasNext())
        {
            m = scan.nextInt();
            k = scan.nextInt();
            int tocado[] = new int[m];
            int duracao[] = new int[m];
            int musica[] = new int[k];
            for(i=0;i<m;i++)
            {
                tocado[i]= i+1;

            }
            for(i=0;i<m;i++)
            {
                duracao[i] = scan.nextInt();

            }
            for(i=0;i<k;i++)
            {
                musica[i] = scan.nextInt();

            }
            escutado = duracao[0];
            for(i=0;i<k;i++)
            {
                for( l=0;l<m;l++)
                {
                    if(musica[i]==tocado[l])
                    {
                        tocado[l]=0;
                        escutado = escutado + duracao[l];
                    }
                }
            }
            for(int p =0; p<m;p++)
            {
                if(tocado[p] != 0)
                {
                    escutado = 0;
                    for(q =0; q<m;q++)
                    {
                        tocado[q]=1;
                    }
                    r = r+"-1\n";
                    break;
                }
            }
            for(int p =0; p<m;p++)
            {
                if(tocado[p]==0)
                {
                    r = r+escutado+"\n";
                    break;
                }
            }

        }
        System.out.print(r);
    }
}
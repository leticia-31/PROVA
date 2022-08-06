import java.util.Scanner;
public class Aluvid21
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int diferenca = 0;
        String soma = "";
        while(in.hasNext())
        {
            int n,maior,menor,indicemaior,indicemenor;

            n = in.nextInt();

            int idades[] = new int[n];
            
            diferenca = 0;
            maior = 0;
            indicemaior =0;
            menor = 1000;
            indicemenor=n;
            
                for(int i=0;i<n;i++)
                {
                    idades[i] = in.nextInt();
                }
            for(int j=0;j<n/2;j++)
            {
                for(int i=0;i<n;i++)
                {   
                    if(idades[i]!= -1 && idades[i]>maior)
                    {
                        maior = idades[i];
                        indicemaior = i;
                    }
                    if(idades[i]!=-1 && idades[i]<menor)
                    {
                        menor = idades[i];
                        indicemenor = i;
                    }
                }
                diferenca = diferenca + (maior - menor);
                
                idades[indicemaior] = -1;
                idades[indicemenor] = -1;
                maior = 0;
                indicemaior =0;
                menor = 1000;
                indicemenor=n;
            }
            soma = soma + diferenca +"\n";
        }
        System.out.print(soma);
    }
}

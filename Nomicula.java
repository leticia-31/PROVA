import java.util.Scanner;
public class Nomicula
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String nome,nomechar,matricula,r,restomatricula,restonome;
        while(in.hasNext())
        {
            nome = in.next();
            matricula = in.next();
            nomechar = "";
            restomatricula = "";
            restonome="";
            r = "";
            int tamanhonome = nome.length();
            int tamanhomatricula = matricula.length();
            if(tamanhonome == tamanhomatricula)
            {
                for(int i =0; i<tamanhonome;i++)
                {
                    nomechar = nomechar + (nome.charAt(i)) + (matricula.charAt(i));
                    r = nomechar +"\n";
                }
            }
            else if(tamanhonome < tamanhomatricula)
            {
                for(int i =0; i<tamanhonome;i++)
                {
                    nomechar = nomechar + (nome.charAt(i)) + (matricula.charAt(i));
                }
                restomatricula = matricula.substring(tamanhonome);
                r = nomechar+restomatricula+"\n";
            }
            else if(tamanhonome > tamanhomatricula)
            {
                for(int i =0; i<tamanhomatricula;i++)
                {
                    nomechar = nomechar + (nome.charAt(i)) + (matricula.charAt(i));
                }
                restonome = nome.substring(tamanhomatricula);
                r = nomechar+restonome+"\n";
            }
            System.out.print(r);
        }
    }
}
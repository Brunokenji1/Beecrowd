using System;

class URI
{

    static void Main(string[] args)
    {
        int[] par = new int[5];
        int[] impar = new int[5];
        int n;
        int contpar = 0, contimpar = 0;
        for (int i = 0; i < 15; i++)
        {
            n = int.Parse(Console.ReadLine());
            if (n % 2 == 0)
            {
                par[contpar] = n;
                contpar++;
                if (contpar > 4)
                {
                    for (int j = 0; j < 5; j++)
                    {
                        Console.WriteLine("par[" + j + "] = " + par[j]);
                        par[j] = 0;
                    }
                    contpar = 0;
                }


            }
            else if (n % 2 == 1 || n %2 == -1)
            {
                impar[contimpar] = n;
                contimpar++;
                if(contimpar > 4)
                {
                    for(int j=0; j<5; j++)
                    {
                        Console.WriteLine("impar[" + j + "] = " + impar[j]);
                        impar[j] = 0;
                    }
                    contimpar = 0;
                }
            }

        }
        if(contimpar >= 0)
        {
            for (int i = 0; i < contimpar; i++)
            {
                Console.WriteLine("impar[" + i + "] = " + impar[i]);
            }
        }
        if(contpar >= 0)
        {
            for (int i = 0; i < contpar; i++)
            {
                Console.WriteLine("par[" + i + "] = " + par[i]);
            }
        }
 
        

    }

}

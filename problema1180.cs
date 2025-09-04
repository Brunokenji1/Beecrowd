using System;

class URI
{

    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
       
        int menor, index;
        int[] numeros = new int[n];
        string[] entrada = new string[n];
        
        
        entrada = Console.ReadLine().Split();
        for(int i = 0; i<n; i++)
        {
            numeros[i] = int.Parse(entrada[i]);
        }
        menor = numeros[0];
        index = 0;
        for(int i = 1; i < n; i++)
        {
            if (numeros[i] < menor)
            {
                menor = numeros[i];
                index = i;
            }
        }
        Console.WriteLine("Menor valor: " + menor);
        Console.WriteLine("Posicao: " + index);

    }
}

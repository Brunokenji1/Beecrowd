using System;

class URI
{

    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] numeros = new int[n];

        int somaS=0, somaB=0, somaA=0, acertoS=0, acertoB=0, acertoA=0;

        for (int i=0; i < n; i++)
        {
            string[] entrada = new string[n];
            string[] entradaAcertos = new string[n];
            string nome = Console.ReadLine();
            entrada = Console.ReadLine().Split();
            somaS += int.Parse(entrada[0]);
            somaB += int.Parse(entrada[1]);
            somaA += int.Parse(entrada[2]);
            entradaAcertos = Console.ReadLine().Split();
            acertoS += int.Parse(entradaAcertos[0]);
            acertoB += int.Parse(entradaAcertos[1]);
            acertoA += int.Parse(entradaAcertos[2]);
        }
        double porcentagemS = (acertoS*100) / (double)somaS;
        double porcentagemB = (acertoB*100) / (double) somaB;
        double porcentagemA = ( acertoA*100) / (double)somaA; 
        Console.WriteLine($"Pontos de Saque: {porcentagemS:F2} %.");
        Console.WriteLine($"Pontos de Bloqueio: {porcentagemB:F2} %.");
        Console.WriteLine($"Pontos de Ataque: {porcentagemA:F2} %.");



    }
}

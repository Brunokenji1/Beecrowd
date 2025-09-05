using System; 

class URI {

    static void Main(string[] args) { 
        double[,] matriz = new double[12, 12];
        double soma=0, media;
        string opc = Console.ReadLine();
    
        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                matriz[i, j] = double.Parse(Console.ReadLine());
                if(i<j){
                    soma+=matriz[i, j];
                }
            
            }
        }
        if(opc == "S"){
            Console.WriteLine($"{soma:F1}");
        }
        else if(opc == "M"){
            media = soma/66;
            Console.WriteLine($"{media:F1}");
        }
    
  }

}

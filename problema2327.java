    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        int[] totalLinha=new int[n];
        int [] totalColuna=new int[n];
        int[] totalDiagona1= new int[n];
        int[] totalDiagonal2=new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                matriz[i][j] = sc.nextInt();
            }

        }

        int cont=n;
        int somaDiagrama1=0, somaDiagrama2=0;
        for(int i=0; i<n; i++){
            int somaLinha=0, somaColuna=0;
            for(int j=0; j<n; j++) {
                somaLinha+=matriz[i][j];
                somaColuna+=matriz[j][i];
                if(i==j){
                    somaDiagrama1+=matriz[i][j];
                }
                if(j==cont-1){
                    somaDiagrama2+=matriz[i][j];
                    cont--;
                }
            }
            totalColuna[i]=somaColuna;
            totalLinha[i]=somaLinha;
        }

        int numeroAnterior=totalColuna[0];

        for(int i=0; i<n; i++){
            if(numeroAnterior==totalColuna[i] && numeroAnterior==totalLinha[i] && numeroAnterior==somaDiagrama1 && numeroAnterior==somaDiagrama2){
                numeroAnterior=totalColuna[i];
            }
            else{
                numeroAnterior=-1;
                break;
            }
        }
        System.out.println(numeroAnterior);
    }
}

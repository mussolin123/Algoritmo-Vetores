class Main2{
    public static void main(String[] args) {
        int [] [] matriz;
        int valor = 10;
        int i, j;
        int n_linhas = 4, n_colunas = 4;

        matriz = new int [n_linhas] [n_colunas];

            for(i=0;i<n_linhas;i++){
                for(j=0;j<n_colunas;j++){
                    matriz[i][j] = valor;
                    valor = valor + 10;
                }

            }

            for(i=0;i<n_linhas;i++){
                for(j=0;j<n_colunas;j++){
                    System.out.printf(" %d", matriz[i] [j]);
        
    }

    System.out.println();
        }
    }
}
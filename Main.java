class Main{
    public static void main(String[] args) {
        int [] [] v = {
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,120},
            {130,140,150,160}};
            
            int i, j;
            int n_linhas = 4, n_colunas = 4;

            for(i=0;i<n_linhas;i++){
                for(j=0;j<n_colunas;j++){
                    System.out.printf(" %d",v[i][j]);
                }

                System.out.println();
            }
        
    }
}
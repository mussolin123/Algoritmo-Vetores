//Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

//Entrada
//A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

//Saída
//Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.


import java.io.IOException;
import java.util.Scanner;
 
public class Vetor {
    
 
    public static void main(String[] args) throws IOException {
 
       int n = 100, i;
       float [] A = new float[n];
       Scanner entrada = new Scanner(System.in);

       //entrada
        for (i=0;i<n;i++){
            A[i]= entrada.nextFloat();
        }

        entrada.close();

       //processamento       
        for(i=0;i<n;i++){
            if(A[i] <= 10.0f){
            System.out.printf("A[%d] = %.1f\n",i,A[i]);
                }
            }
        }
    }

    

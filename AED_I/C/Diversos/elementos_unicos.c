#include <stdio.h>
#include <stdlib.h>

int contador (int *vetor){
    
}

int main (){
    int N, i, *vetor;
    scanf("%d", &N);
    
    vetor = calloc(N, sizeof(int));
    for (i = 0; i < N; i++){
        scanf("%d", vetor[i]);
    }
}
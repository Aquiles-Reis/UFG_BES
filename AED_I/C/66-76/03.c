#include <stdio.h>
#include <stdlib.h>

int main (){
    
    int a, n, i, j, k, *vet, t;
    
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        scanf("%d", &k);
        vet = (int*)calloc(k, sizeof(int));

        for (j = 0; j < k; j++){
            scanf("%d", &vet[j]);
        }

        for (a = 0; a < k; a++) {
            for (j = 0; j < k - 1 - a; j++){
                if (vet[j] > vet[j+1]){
                    t = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = t;
                }
            }
        }
        for (j = 0; j < k; j++){
            printf("%d ", vet[j]);
        }
        printf("\n");
    }
}
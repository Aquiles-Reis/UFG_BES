#include <stdio.h>
#include <stdlib.h>

int main(){
    int t, A, B, C, k, i, x = 0, *vet;
    scanf("%d", &t);
    vet = (int*)calloc(t, sizeof(int));

    for (i = 0; i < t; i++){
        scanf("%d %d %d %d", &A, &B, &C, &k);
        if (C == k) {
            x = 0;
        } else {
            while (((A*(x*x)) + (B*x) + C <= k)){
                x++;
            }
        }
        vet[i] = x;
        x = 0;
    }
    for (i = 0; i < t; i++) {
        printf("%d\n", vet[i]);
    }
}
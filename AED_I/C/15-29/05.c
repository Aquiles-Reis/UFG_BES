#include <stdio.h>
#include <stdlib.h>

int f (int n) {
    if (n == 1) {
        printf("1");
    }
    if (n > 1) {
        f(n/2);
        printf("%d", n%2);
    }
}

int main (){
    int n, i, *vet, k;
    scanf("%d", &n);
    vet = (int *)calloc(n, sizeof (int));
    for (i = 0; i < n; i++){
        scanf("%d", &k);
        vet[i] = k;
    }
    for (i = 0; i < n; i++){
        f(vet[i]);
        printf("\n");
    }
}
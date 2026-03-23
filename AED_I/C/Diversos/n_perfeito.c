#include <stdio.h>
#include <stdlib.h>

int main (){
    int N, n, i, *array, soma = 0;
    scanf("%d", &N);
    n = N/2;
    array = (int *)calloc(n, sizeof(int));

    for (i = 1; i <= n; i++) {
        if (N%i == 0) {
            array[i - 1] = i;
        }
    }
    for (i = 0; i < n; i++) {
        soma += array[i];
    }
    printf("%d = 1", N);
    for (i = 1; i <= n; i++) {
        if (array[i] >= 2) {
            printf(" + %d", array[i]);
        } else if (array[i] == 0) {
            break;
        }

    }
    if (soma == N) {
        printf(" = %d (NUMERO PERFEITO)", soma);
    } else {
        printf(" = %d (NUMERO NAO E PERFEITO)", soma);
    }
}
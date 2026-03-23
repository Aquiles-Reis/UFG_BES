#include <stdio.h>
#include <stdlib.h>

int fibonacci (int n) {
    int i, a1 = 1, a2 = 1, ant;
    for (i = 0; i < n - 2; i++){
        ant = a2;
        a2 += a1;
        a1 = ant;
    }
    return a2;
}

int main (){
    int k, n, i;
    int *array;
    scanf("%d", &k);
    array = (int *)calloc(k, sizeof (int));

    for (i = 0; i < k; i++){
        scanf("%d", &n);
        if (n < 3){
            return 1;
        }
        array[i] = fibonacci(n);
    }
    for (i = 0; i < k; i++) {
        printf("%d\n", array[i]);
    }
}

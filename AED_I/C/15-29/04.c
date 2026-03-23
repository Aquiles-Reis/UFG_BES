#include <stdio.h>
#include <stdlib.h>

int res = 0;

int f (int i, int *vet) {
    if (res == i) return 0;
    printf("%d", vet[res]);
    res += 1;
    return f(i, vet);
    
}

int main (){
    int n, *vet = NULL, i = 0;
    scanf("%d", &n);
    while (n > 0) {
        vet = realloc(vet, (i + 1) * sizeof(int));
        vet[i] = n%10;
        n = n/10;
        i++;
    }
    f(i, vet);
}
#include <stdio.h>

int notas[6] = {2, 5, 10, 20, 50, 100};

int f (int ind, int S, int *vet){
    int i, x = 0;
    
    if (S == 0) return 1;
    if (S < 0 || ind >= 6) return 0;
    for (i = 0; i <= vet[ind]; i++) {
        x += f(ind + 1, S - i * notas[ind], vet);
    }
    return x;
}
int main (){
    int S, vet[6], i; 
    scanf("%d", &S);
    for (i = 0; i < 6; i++) {
        scanf("%d", &vet[i]);
    }
    printf("%d", f(0, S, vet));
}

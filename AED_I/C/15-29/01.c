#include <stdio.h>

int contagem (int n){
    if (n == 0) return 0;
    contagem(n-1);
    printf("%d ", n);
}

int main (){

    int n;
    scanf("%d", &n);
    contagem(n);
}
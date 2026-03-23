#include <stdio.h>

int main (){
    int N, u, c;
    scanf("%d", &N);
    
    u = (N/100) + (((N/10)%10) * 3) + ((N%10) * 5);
    c = u%7;

    printf("O NOVO NUMERO E = %d", (N * 10) + c);
}
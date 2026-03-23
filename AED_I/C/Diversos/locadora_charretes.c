#include <stdio.h>

int main (){
    float valorTotal;
    int H;
    scanf("%d", &H);

    valorTotal = ((H/3)*10 + (H%3)*5);
    printf("O VALOR A PAGAR E = %.2f", valorTotal);
}
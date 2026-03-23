#include <stdio.h>

int main (){
    float raio, alt, pi = 3.14159, valor, area;
    scanf("%f %f", &raio, &alt);
    area = ((2 * (raio * raio * pi)) + (2 * pi * raio * alt));
    valor = area * 100;
    printf("O VALOR DO CUSTO E = %.2f", valor);
}
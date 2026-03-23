#include <stdio.h>

int main (){
    float n, i, K, s, j, I;
    scanf("%f %f %f %f", &n, &i, &K, &s);
    I = i;
    printf("Tabuada de soma:\n");
    for (j = 0; j < K; j++){
        printf("%.2f + %.2f = %.2f\n", n, i, (n + i));
        i += s;
    }
    i = I;
    printf("Tabuada de subtracao:\n");
    for (j = 0; j < K; j++){
        printf("%.2f - %.2f = %.2f\n", n, i, (n - i));
        i += s;
    }
    i = I;
    printf("Tabuada de multiplicacao:\n");
    for (j = 0; j < K; j++){
        printf("%.2f x %.2f = %.2f\n", n, i, (n * i));
        i += s;
    }
    i = I;
    printf("Tabuada de divisao:\n");
    for (j = 0; j < K; j++){
        printf("%.2f / %.2f = %.2f\n", n, i, (n / i));
        i += s;
    }
}
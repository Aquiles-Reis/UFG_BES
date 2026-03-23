#include <stdio.h>

int main (){
    int Nm, N1, N2, valor;
    char C; 
    scanf("%d", &Nm);
    scanf("%d %c %d", &N1, &C, &N2);

    switch (C)
    {
    case '+':
        valor = N1 + N2;
        if (valor > Nm){
            printf("overflow");
        } else {
            printf("no overflow");
        }
        break;
    
     case 'x':
        valor = N1 * N2;
        if (valor > Nm){
            printf("overflow");
        } else {
            printf("no overflow");
        }
        break;
    }
}
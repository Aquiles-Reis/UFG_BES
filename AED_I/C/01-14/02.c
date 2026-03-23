#include <stdio.h>

int main () {
    int N1, N2, inverN1, inverN2;
    scanf("%d %d", &N1, &N2);
    inverN1 = ((N1%10) * 100) + (((N1/10)%10) * 10) + (N1/100);
    inverN2 = ((N2%10) * 100) + (((N2/10)%10) * 10) + (N2/100);
    if (inverN1 > inverN2) {
        printf("%d", inverN1);
    } else {
        printf("%d", inverN2);
    }
}
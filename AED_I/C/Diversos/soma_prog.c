#include <stdio.h>

int main (){

    int a1, r, n, i, Sn = 0;
    scanf("%d %d %d", &a1, &r, &n);

    for (i = 0; i < n; i++) {
        Sn += (a1 + (r * i));
    }
    printf("%d", Sn);
}
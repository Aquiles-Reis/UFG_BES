#include <stdio.h>
#include <stdlib.h>

int main (){
    int P, S, i, p1, d1, *array;
    scanf("%d %d", &P, &S);
    array = (int *)calloc(P, sizeof(int));

    for (i = 0; i < S; i++) {
        scanf("%d %d", &p1, &d1);
        array[p1 - 1] = 1;
        if (p1 - 1 + d1 <= P - 1) {
            array[p1 - 1 + d1] = 1;
        }
        if (p1 - 1 - d1 >= 0) {
            array[p1 - 1 - d1] = 1;
        }
    }
    for (i = 0; i < P; i++) {
        printf("%d\n", array[i]);
    }

}
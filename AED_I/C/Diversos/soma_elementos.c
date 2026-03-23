#include <stdio.h>

int main (){
    int N, vals, result = 0, i;
    scanf("%d", &N);

    for (i=0; i<N; i++){
        scanf("%d", &vals);
        result += vals;
    }
    printf("%d", result);
}
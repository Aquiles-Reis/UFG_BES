#include <stdio.h>

int main (){
    int N, i, primo = 1;
    scanf("%d", &N);
    if (N == 1){
        printf("NAO PRIMO");
        return 0;
    }
    for (i = 2; i * i <= N; i++) {
        if (N%i == 0) {
            primo = 0;
        }
    }
    if (primo) {
        printf("PRIMO\n");
    } else {
        printf("NAO PRIMO\n");
    }
}
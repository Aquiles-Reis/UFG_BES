#include <stdio.h>

int main (){
    int N, i, nums, resto, inver, anterior;
    scanf("%d", &N);
    for (i=0; i<N; i++){
        scanf("%d", &nums);
        anterior = nums;
        inver = 0;
        while (nums > 0) {
            resto = nums%10;
            inver = inver*10 + resto;
            nums /= 10;
        }
        if (inver == anterior){
            printf("yes ");
        } else {
            printf("no ");
        }
    }
}
#include <stdio.h>

int main (){
    int N, i, nums, j, isprimo;
    scanf("%d", &N);
    
    isprimo = 1;
    
    for (i = 0; i < N; i++) {
        scanf("%d", &nums);
        for (j = 2; j * j <= nums; j++) {
            if (nums%j == 0) {
                isprimo = 0;
                break;
            }
        }
        if (isprimo) {
            printf("primo\n");
        } else {
            printf("composto\n");
        }
    }
}
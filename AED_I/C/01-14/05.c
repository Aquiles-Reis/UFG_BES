#include <stdio.h>

int main() {
    int N, i, nums, resto, j = 0, k;
    char array[32];
    scanf("%d", &N);
    if (N < 1 || N > 100){
        return 1;
    }

    for (i = 0; i < N; i++) {
        scanf("%d", &nums);

        do {
            resto = nums % 4;
            switch (resto) {
                case 0: array[j++] = 'A'; break;
                case 1: array[j++] = 'C'; break;
                case 2: array[j++] = 'G'; break;
                case 3: array[j++] = 'T'; break;
            }
            nums /= 4;
        } while (nums > 0);

        // imprime em ordem reversa
        for (int k = j - 1; k >= 0; k--) {
            printf("%c", array[k]);
        }
        printf("\n");
        j = 0;
    }
}
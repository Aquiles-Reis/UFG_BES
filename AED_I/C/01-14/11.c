#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m, n, i, j, nums;
    char operatio;
    int *matriz;
    scanf("%d %d", &m, &n);

    matriz = (int *)calloc(m * n, sizeof(int));

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &matriz[(i * n) + j]);
        }
    }
    scanf(" %c", &operatio);

    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &nums);
            switch (operatio) {
            case '+': matriz[(i * n) + j] += nums; break;
            case 'x': matriz[(i * n) + j] *= nums; break;
            }
        }
    }
    
    if (operatio == 'x' && m != n) {
        printf("ERROR");
    } else {
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                printf("%d ", matriz[(i * n) + j]);
            }
            printf("\n");
        }
    }
}
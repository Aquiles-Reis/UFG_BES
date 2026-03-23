#include <stdio.h>
#include <stdlib.h>

char vet[10] = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

int main (){
    int n, *res, i, j, x = 0, t;
    char s[10001];
    
    scanf("%d", &n);
    t = n;
    res = (int *)calloc(n, sizeof(int));
    for (i = 0; i < n; i++){
        res[i] = 0;
    }
    while (n--) {
    scanf("%s", s);
    for (j = 0; s[j] != '\0'; j++) {
        for (i = 0; i < 10; i++){
            if (s[j] == vet[i]) {
                res[x]++;
                break;
            }
        }
    }
    x += 1;
    }
    for (i = 0; i < t; i++){
        printf("%d\n", res[i]);
    }
    return 0;
}
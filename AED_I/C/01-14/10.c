#include <stdio.h>
#include <math.h>

float areaCirculo (float a){
    return (3.14159265 * a * a);
}
float areaElipse (float a, float b){
    return (3.14159265 * a * b);
}
float areaTriangulo (float a, float b, float c){
    return (sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c)));
}
float areaTrapezio (float a, float b, float c){
    return (((a + b) / 2) * c);
}

int main (){
    int N, i, inteiro;
    float a, b, c, area;
    char figura;
    scanf("%d", &N);
    for (i = 0; i < N; i++) {
        scanf(" %c", &figura);
        switch (figura)
        {
        case 'C':
            scanf("%f", &a);
            area = areaCirculo(a);
            inteiro = round(area);
            printf("%d\n", inteiro);
            break;  
        case 'E':
            scanf("%f %f", &a, &b);
            area = areaElipse(a, b);
            printf("%d\n", (int)round(area));
            break;
        case 'T':
            scanf("%f %f %f", &a, &b, &c);
            area = areaTriangulo(a, b, c);
            printf("%d\n", (int)round(area));
            break;
        case 'Z':
            scanf("%f %f %f", &a, &b, &c);
            area = areaTrapezio(a, b, c);
            printf("%d\n", (int)round(area));
            break;
        }
    }
}
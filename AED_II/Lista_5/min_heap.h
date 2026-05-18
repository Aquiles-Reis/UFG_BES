#define MAX 100

typedef struct {
    int dados[MAX];
    int tamanho;
} Heap;

Heap* create();
void insert(Heap *h, int valor);
int deleteMinVal(Heap *h);
void reHeapDown(Heap *h, int i);
void reHeapUp(Heap *h, int i);
void imprimir(Heap *h);
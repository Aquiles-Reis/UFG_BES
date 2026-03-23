typedef struct NO* ArvBin;

ArvBin* cria_ArvBin(void);
void imprimeArvore(struct NO* raiz, int nivel);
ArvBin* inserirNO_iterativo(ArvBin* raiz, int valor);
void pre_Ordem(struct NO* raiz);
void em_Ordem(struct NO* raiz);
void pos_Ordem(struct NO* raiz);
int contarFolhas(struct NO* raiz);

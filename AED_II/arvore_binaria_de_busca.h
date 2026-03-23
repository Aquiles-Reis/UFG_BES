typedef struct NO* ArvBin;

ArvBin* cria_ArvBin();

ArvBin* insere_NO_ArvBin(ArvBin* raiz, int valor);

ArvBin* remove_NO_ArvBin(ArvBin* raiz, int valor);

ArvBin* imprime_Arvore(ArvBin* raiz, int nivel); 

int busca_NO_ArvBin(ArvBin* raiz, int valor);

void pre_Ordem(struct NO* raiz);

void em_Ordem(struct NO* raiz);

void pos_Ordem(struct NO* raiz);

ArvBin* libera_NO();

ArvBin* libera_ArvBin();
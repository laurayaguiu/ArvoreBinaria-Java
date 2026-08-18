# 🌳 Árvore Binária em Java

Implementação de uma árvore binária em Java, desenvolvida para fins de estudo dos principais percursos em árvores.

## Percursos

- **Pré-ordem**: Raiz → Esquerda → Direita
- **Em ordem**: Esquerda → Raiz → Direita
- **Pós-ordem**: Esquerda → Direita → Raiz

## Representação da Expressão

O projeto utiliza uma árvore binária para representar a expressão matemática:

**(a × b) + ((x − y) ÷ (c + e))**

Na árvore, os **operadores** são representados pelos nós internos, enquanto os **operandos** são representados pelas folhas.

### Estrutura da Árvore

```text
                 +
               /   \
              *     /
             / \   / \
            a   b -   +
               / \ / \
              x  y c  e
```

## Objetivo

Praticar conceitos de node, árvores binárias, manipulação de nós e implementação de percursos recursivos em Java.
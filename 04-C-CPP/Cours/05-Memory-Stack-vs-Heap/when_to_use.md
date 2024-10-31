#when to use Heap and when to use stack

## When to use Heap ?
Eng : 
    - if you need to allocate a large block of memory (e.g. a large array or a big struct),
    and you need to keep it around for a while, or you need to allocate a variable whose size you don't know at compile time, you should allocate it on the heap.
    - if you need variables like arrays and structs that can change size dynamically ( e.g arrays that can grow or shrink as needed) then you will need to allocate them on the heap , and use dynamic memory function like malloc() , calloc()  , realloc  and free() to manage the memory.

Fr : 
    - si vous avez besoin d'allouer un grand bloc de mémoire (par exemple, un grand tableau ou une grande structure),et vous devez le garder pendant un certain temps, ou vous devez allouer une variable dont vous ne connaissez pas la taille au moment de la compilation, vous devez l'allouer sur le tas.
    - si vous avez besoin de variables comme des tableaux et des structures dont la taille peut changer dynamiquement (par exemple des tableaux qui peuvent grandir ou rétrécir au besoin), vous devrez les allouer sur le tas, et utiliser des fonctions de mémoire dynamique comme malloc(), calloc(), realloc et free() pour gérer la mémoire.


## When to use Stack ?
Eng : 
    - if you are dealing with small variables that only need to presist as long as the function using them is alive , then you should allocate them on the stack. it's easier and faster.

Fr :
    - si vous travaillez avec de petites variables qui ne doivent persister que tant que la fonction qui les utilise est en vie, vous devez les allouer sur la pile. c'est plus facile et plus rapide.
section .data
    array dd 1, 3, 5, 7, 9, 11, 13, 15, 17, 19   ; Tableau trié
    array_size equ ($ - array) / 4              ; Taille du tableau (en nombre d'éléments)
    target dd 11                                ; Élément à rechercher

section .text
    global _start

_start:
    ; Charger l'adresse de début et de fin du tableau
    mov ebx, array
    mov esi, ebx
    add esi, (array_size - 1) * 4

binary_search_loop:
    ; Vérifier si l'adresse de début est supérieure à l'adresse de fin
    cmp ebx, esi
    jg binary_search_not_found

    ; Calculer l'adresse du milieu du tableau
    mov eax, ebx
    sub eax, esi
    shr eax, 1
    add eax, ebx

    ; Comparer la valeur au milieu du tableau avec la cible
    mov edx, dword [eax]
    cmp edx, dword [target]
    je binary_search_found
    jb binary_search_lower_half
    ja binary_search_upper_half

binary_search_lower_half:
    ; Si la valeur au milieu est inférieure à la cible, chercher dans la moitié supérieure du tableau
    add ebx, 4
    jmp binary_search_loop

binary_search_upper_half:
    ; Si la valeur au milieu est supérieure à la cible, chercher dans la moitié inférieure du tableau
    sub esi, 4
    jmp binary_search_loop

binary_search_found:
    ; L'élément a été trouvé
    ; À ce stade, l'adresse de l'élément trouvé est dans le registre eax

    ; Terminer le programme
    mov eax, 1
    xor ebx, ebx
    int 0x80

binary_search_not_found:
    ; L'élément n'a pas été trouvé

    ; Terminer le programme
    mov eax, 1
    xor ebx, ebx
    int 0x80

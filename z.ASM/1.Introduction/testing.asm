section .data
    message db 'Hy', 0xA   ; Message to print, 0xA is newline character
    msglen equ $ - message  ; Length of the message

section .text
    global _start

_start:
    ; Output 'H' and 'y' characters
    mov eax, 4            ; syscall number for sys_write
    mov ebx, 1            ; file descriptor 1 (stdout)
    mov ecx, message      ; message addres
    mov edx, msglen       ; message length
    int 0x80              ; call kernel

    ; Exit program
    mov eax, 1            ; syscall number for sys_exit
    xor ebx, ebx          ; exit status 0
    int 0x80              ; call kernel

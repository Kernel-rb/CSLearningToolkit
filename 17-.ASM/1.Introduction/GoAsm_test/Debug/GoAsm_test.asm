include C:\masm32\include\windows.inc

.Data
wcount QWORD 0
hello DB "Hello GoAsm", 0

.Code
start:
    Arg -11
    invoke GetStdHandle, STD_OUTPUT_HANDLE
    Arg 0, ADDR wcount, 27
    Arg ADDR hello, Rax
    invoke WriteFile, Rax, ADDR hello, 13, ADDR wcount, 0
    XOR Rax, Rax
    RET

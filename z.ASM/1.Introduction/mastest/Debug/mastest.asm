include \masm32\include\masm32rt.inc

.data 
Hello db"Hello World!",0
include ECProtos.inc ; .Code
start:
    invoke StdOut, addr Hello
    invoke ExitProcess,0
End start
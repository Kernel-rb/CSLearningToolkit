#include  <stdio.h>

int main(){
    typedef enum { false, true } bool;

    struct student {
        char  *name ;
        int   note;
        bool  pass;
    };

    // method 1
    struct student studentN1;
    studentN1.name = "Saif";
    studentN1.note =  17;
    studentN1.pass = true ; 

    // method 2 
    struct student studentN2 = {.name = "kernel" , .note= 8  , .pass = false};

    printf("studentN1 Info => ( %s,%d , %d)    and   studentN2 info => (%s , %d , %d) \n" ,studentN1.name, studentN1.note,studentN1.pass  ,studentN2.name  , studentN2.note , studentN2.pass);




    return 0;
    
    

}
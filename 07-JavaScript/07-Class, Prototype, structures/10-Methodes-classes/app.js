class Myclass {
    static methodClass(){
        console.log('Method class');
    }
    autreMethod(){
        console.log('Autre method');
    }
}
Myclass.methodClass();
const instance = new Myclass();
instance.autreMethod();
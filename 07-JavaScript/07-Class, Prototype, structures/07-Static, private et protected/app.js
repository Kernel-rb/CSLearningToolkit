// -----------Static : permet d'acceder à une méthode sans instancier la classe----------------
class Example{
    static myFunction() {
        console.log('Hello from static function');
    }
}

Example.myFunction();

// -----------------Private : permet de rendre une propriété ou une méthode privée----------------
class Example2{
    #privateProperty = 4;
    #methodePrivate() {
        console.log('Hello from private method');
    }

    utiliserProprietePrivee() {
        console.log(this.#privateProperty);
    }
}

let instance = new Example2();
instance.utiliserProprietePrivee();


// -----------------Protected : permet de rendre une propriété ou une méthode protégée----------------

class Parent{
    #proprieteProtegee = "Je suis protégé";

    afficherProprieteProtegee() {
        console.log(this.#proprieteProtegee);
    }
}

class Enfant extends Parent{
    utiliserProprieteProtegee() {
        this.afficherProprieteProtegee();
    }
}

let enfantinstance = new Enfant();
enfantinstance.utiliserProprieteProtegee();
/* 

Clase 1 Cris - JavaScript

console.log("Hola soy la consola de js");

let age = 18;

if (age < 18){
    console.log("Eres menor de edad");
} else if (age == 18){ 
    console.log("Eres mayor de edad");
} 

Clase 2 Cris - JavaScript (04/10)

· LOOPS

exemplo:
for (primera casa; ultima casa; avanza una casa){
    repartirFlyers();
}

//onde comeca, onde termina, avança uma casa++ (por onde vai)

exemplo:
for (let step 0; step < 10; step++) {
    repartirFlyers();
}

exemplo codigo:

for (let step=0; step <= 10; step++) {
    console.log(step);
    }

//usar sempre menor ou igual onde termina, igual dá loop infinito x.x

 · Funciones

function verstirse()
{
    quitarPijama();
    vestirse();
    ponerLosSapatos();
}

vestirse();
  
· Parametro: 

function pedirAyuda(persona){
return "Por favor ayudame" + persona;
}
pedirAyuda("compi");
pedirAyuda("formadoras");
pedirAyuda("RP");

// · Argumento:

function pedirAyuda(persona="compi"){ 
//compi es el argumento a q llama la funcion
return "Por favor ayudame" + persona;
}
pedirAyuda();
pedirAyuda("formadoras");
pedirAyuda("RP");

saludar Nia
function saludar(){
    console.log("Hola Nia")
}
saludar();


saludar Vita 
function saludar(coder){ //coder es el parametro, 
    return "Hola " + coder;
}

console.log(saludar("Lara")); //lara es argumento, nome de la caja
saludar("Nia");
saludar("Vita");


function sumar(number1, number2){
    return number1+number2;
}

console.log(sumar(1,2));

/* Arrays (lista que armazena um ou um grupo de valores)

let fruits = ["apples", "oranges", "wattermellons"];
console.log(fruits[2])

Objectos (lista que armazena um ou um grupo de valores) 

const person = {
    name: "Thais",
    age: 31,
    adress: {
        street: "calle diagonal",
        number: 12
    },
email: "thais@gmail.com"
}
console.log(person.name, person.adress.number, person)
*/
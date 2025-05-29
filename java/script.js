//console.log(document)

//paso 1: capturar la etiqueta a la cual queremos cambiar contenido

let title = document.getElementById("patata");
// console.log(title);

//paso 2: cambiear el contenido
title.textContent = "Hola soy el DOM desde JS";

//anadir contenido nuevo
//paso 1: crear etiqueta

let paragraph = document.createElement("p");
//console.log(paragraph)


//anadimos contenido 
paragraph.innerHTML = "Hola soy un parrafo";
console.log(paragraph)

//paso 3: posicionar contenido
let section = document.querySelector("section")
console.log(section);
//el padre (section) //el hijo appendChild
section.appendChild(paragraph);

//
let coursesElements = document.getElementsByClassName("course")
console.log(coursesElements)

/* coursesElements[0].textContent = "React"
coursesElements[1].textContent = "PHP"
coursesElements[2].textContent = "Angular" */

let courseList = ["React", "PHP", "Python"];

for (let index = 0; index < courseList.length; index++){
    coursesElements[index].textContent = courseList[index];
}

//Eventos

/* document.addEventListener("click", function()){
console.log("Hola soy un evento")
}) */

let button1 = document.getElementById("button1");
function printConsole(){
    console.log("soy un evento del boton")
}

function addStyleButton(){
    button1.classList.add("button1-style")
}

button1.addEventListener("click", addStyleButton);
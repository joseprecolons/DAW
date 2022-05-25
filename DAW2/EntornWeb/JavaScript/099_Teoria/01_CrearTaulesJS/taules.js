let taula = document.getElementById("laMevaTaula");
let caption = taula.createCaption();


caption.innerHTML = "Taula Josep";

let numFiles = 4;
let numColumnes = 5;

for (let i = 0; i < numFiles; i++) {
    let fila = taula.insertRow(i);
    for (let j = 0; j < numColumnes; j++) {
        let cela = fila.insertCell(j);
        cela.innerHTML = "Nova cela" + j;
    }
}


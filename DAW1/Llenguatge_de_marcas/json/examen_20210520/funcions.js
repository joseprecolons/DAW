var contingutJSON =
  {
    "alumnes":         [
        {
          "nom": "Dolores",
          "cognoms": [
            "Fuertes",
            "de Barriga",
           ],
          "escape": "terror"
        },
        {
          "nom": "Macias",
          "cognoms": [
            "Pajas",
            "Grandes",
           ],
          "escape": "misteri"
        },
          {
          "nom": "Matilde",
          "cognoms": [
            "Pilate",
            "Vello",
           ],
          "escape": "intriga"
        },
    {
          "nom": "Luz",
          "cognoms": [
            "Cuesta",
            "Mogollon",
           ],
          "escape": "terror"
        },
    {
          "nom": "Benito",
          "cognoms": [
            "Camelas",
            "Hermoso",
           ],
          "escape": "intriga"
        }
      ]};

// Variables
var x = 0;
var y = 0;
var preus = [20, 25, 30]; //Array on guardo els diferents preus
var escape = new Array(contingutJSON.alumnes.length); //Array on guardaré les opcios que venen per defecte del escape
var preuTotal = 0;

//Posu els valors per defecte que venen amb el json
for (var i = 0; i < escape.length; i++) {
  if (contingutJSON.alumnes[i].escape == "misteri") {
    escape[i] = 0;
  } else if (contingutJSON.alumnes[i].escape === "intriga") {
    escape[i] = 1;
  } else {
    escape[i] = 2;
  }
}

for (var i = 0; i < preus.length; i++) {
  preuTotal += preus[i];
}
mostra();


//funció que serveis per mostrar la informació
function mostra() {
    document.getElementById("nom").innerHTML = contingutJSON.alumnes[x].nom;
    for(var i = 0; i < contingutJSON.alumnes[x].cognoms.length; i++) {
        document.getElementById('c' + (i+1)).innerHTML = contingutJSON.alumnes[x].cognoms[i];
    }
    document.getElementById("escape").innerHTML =  contingutJSON.alumnes[x].escape;
    document.getElementById("preu").innerHTML =  preus[escape[x]];
    var element = document.getElementsByName("canviarPreu");
    for (var i = 0; i < element.length; i++) {
      element[i].checked = false;
    }
    element[escape[x]].checked = true; 

    //calculo el preu total cada vegada que es mostra, per si hi ha algun canvi
    preuTotal = 0;
    for (var i = 0; i < contingutJSON.alumnes.length; i++) {
      preuTotal += preus[escape[i]];
    }

    document.getElementById("preuTotal").innerHTML = preuTotal;
};

//funció per veure quin radiobutton está checked
function agafarPreu() {
  for (var i = 0; i < contingutJSON.alumnes.length; i++) {
      if (document.getElementById('r' + (i+1)).checked) {
          escape[x] = i;
          break;
      }
  }
};

//funció per anar al següent alumne
function doSeguent() {
  agafarPreu();
    if (x == contingutJSON.alumnes.length-1){
        x = 0;
    } else {
        x++;
    }
    mostra();
};

//funció per anar a l'alumne anterior
function doAnterior() { 
  agafarPreu();
    if (x == 0){
        x = contingutJSON.alumnes.length-1;
    } else {
        x--;
    }
    mostra();
};

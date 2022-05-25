let primerNombre;
let segonNombre;

function llegirValors() {
  primerNombre = parseInt(document.getElementById("primerNombre").value);
  segonNombre = parseInt(document.getElementById("segonNombre").value);
}

function noEsNombre() {
  if (isNaN(primerNombre) || isNaN(segonNombre)) {
    return true;
  } else {
    return false;
  }
}

function suma() {
  llegirValors();
  if (noEsNombre()) {
    alert("Això no es un nombre!");
    document.getElementById("resultat").innerHTML = "";
  } else {
    document.getElementById("resultat").innerHTML = primerNombre + segonNombre;
    alert("Has pitjat el botó suma!");
  }
}

function resta() {
  llegirValors();
  if (noEsNombre()) {
    alert("Això no es un nombre!");
    document.getElementById("resultat").innerHTML = "";
  } else {
    document.getElementById("resultat").innerHTML = primerNombre - segonNombre;
    alert("Has pitjat el botó resta!");
  }
}

function producte() {
  llegirValors();
  if (noEsNombre()) {
    alert("Això no es un nombre!");
    document.getElementById("resultat").innerHTML = "";
  } else {
    document.getElementById("resultat").innerHTML = primerNombre * segonNombre;
    alert("Has pitjat el botó producte!");
  }
}

function divisio() {
  llegirValors();
  if (noEsNombre()) {
    alert("Això no es un nombre!");
    document.getElementById("resultat").innerHTML = "";
  } else if(primerNombre == 0 || segonNombre == 0) {
    alert("No es pot dividir entre 0");
    document.getElementById("resultat").innerHTML = "";
  } else {
    document.getElementById("resultat").innerHTML = primerNombre / segonNombre;
    alert("Has pitjat el botó divisió!");
  }
}
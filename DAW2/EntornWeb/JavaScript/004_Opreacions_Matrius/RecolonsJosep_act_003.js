window.onload = styles;
let matriu_act03 = new Array();

function afegeixElementAMatriu() {
    let element = document.getElementById("elementAAfegir").value;
    if (element == "") {
        alert("ATENCIÓ \nEl camp, no te cap valor, per tant no hi ha res per afegir");
    } else {
        matriu_act03.push(element);
        alert("Valor afegit: " + element + "\nIndex que ocupa a l'array: " + matriu_act03.length);
        document.getElementById("elementAAfegir").value = "";
        if (document.getElementById("divResultat").style.padding == "20px") {
            mostraElementsMatriu();
        }
    }
}

function mostraElementsMatriu() {
    let text = "";
    for (let i = 0; i < matriu_act03.length; i++) {
        text += "Index: " + i + " | Valor: " + matriu_act03[i] + "<br>";
    }
    if (text == "") {
        alert("ATENCIÓ \nLa matriu no te cap valor guardat");
    } else {
        document.getElementById("resultat").innerHTML = text;
        document.getElementById("divResultat").style.padding = "20px";
    }
}

function netejaMatriu() {
    if (matriu_act03.length == 0) {
        alert("ATENCIÓ \nLa matriu no te cap valor, per tant ja esta neta")
    } else {
        let confirmar = confirm("Estas segur de que vols esborrar tots els elements de l'array?");
        if (confirmar) {
            matriu_act03.length = 0;
            alert("Has esborrat tots els elements de la matriu");
            document.getElementById("resultat").innerHTML = "";
            document.getElementById("divResultat").style.padding = "0px";
        } else {
            alert("La matriu segueix mantenint tots els elements");
        }
    }
}

function styles() {
    var element = document.getElementById("titol");
    element.classList.add("tittleStyle");

    var element2 = document.getElementById("divResultat");
    element2.classList.add("resultatStyle");

    document.getElementById("btAfegeix").style.background = "green";
    document.getElementById("btMostra").style.background = "blue";
    document.getElementById("btNeteja").style.background = "red";
}
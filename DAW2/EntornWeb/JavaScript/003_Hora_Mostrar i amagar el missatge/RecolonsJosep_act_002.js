horaActualitzada();
missatge();

function horaActualitzada() {
    var data = new Date();
    var hora = data.getHours();
    var minuts = data.getMinutes();
    var segons = data.getSeconds();

    if (hora < 10) hora = "0" + hora;
    if (minuts < 10) minuts = "0" + minuts;
    if (segons < 10) segons = "0" + segons;

    var horaActual = hora + ":" + minuts + ":" + segons;
    document.getElementById("rellotge").innerHTML = horaActual;
}

function missatge() {
    var msg;
    var msgbd = "Bon dia!";
    var msgbt = "Bona tarda!";
    var msgbv = "Bon vespre!";
    var msgbn = "Bona nit!";

    var data = new Date();

    var hora = data.getHours();

    if (hora < 14 && hora > 7) msg = msgbd;
    if (hora >= 14 && hora < 18) msg = msgbt;
    if (hora >= 18 && hora < 20) msg = msgbv;
    if (hora > 20 || hora < 7) msg = msgbn;

    document.getElementById("missatge").innerHTML = msg;
}


function amagaMostrarInfo() {
    if (document.getElementById("missatge").style.display == "block") {
        document.getElementById("missatge").style.display = "none";
    } else {
        document.getElementById("missatge").style.display = "block";
    }

    document.getElementById("amaga_mostra").addEventListener(
        "click",
        function (event) {
            if (event.target.value === "Amaga") {
                event.target.value = "Mostra";
            } else {
                event.target.value = "Amaga";
            }
        },
        false
    );
}
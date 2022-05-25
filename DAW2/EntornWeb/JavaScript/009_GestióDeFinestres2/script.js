'use strict';
//amb let, no funciona
var windows = [];
var focused;
const n = 100;

function text() {
    let posX = focused.screenX;
    let posY = focused.screenY;
    let ample = focused.outerWidth;
    let alcada = focused.outerHeight;

    let doc = focused.document;

    doc.getElementById("msg").innerHTML = "<p>L'amplada de la finestra " + ample + "px. <br /> L'alçada de la finestra és " + alcada + "px. <br /></p>";
    doc.getElementById("msg").innerHTML += "<p>Posició X: " + posX + ". <br> Posició Y: " + posY + ". <br></p>";
}

function openWindow(value) {
    if (window.windows[value]) {
        alert("La finestra " + (value + 1) + " ja está oberta");
        return
    } else {
        windows[value] = window.open("", "pagina" + (value + 1) + "", "left=0, top=0, width=200, height=250, location=yes, directories=yes");
        focused = windows[value];
    }
    focused.document.write("<h2 id='title'>Pàgina" + (value + 1) + "</h2>");
    focused.document.write("<p id='msg'></p>");
    text();
}

function focusWindow(value) {
    windows[value].focus();
    focused = windows[value];
}

function moveWindow(v1, v2) {
    focused.moveBy(v1, v2);
    text();
}

function reSize(value) {
    value *= n;
    focused.resizeBy(value, value);
    text(focused);
    text();
}

function closeWindow(value) {
    if (!window.windows[value]) {
        alert("La finestra " + (value + 1) + " no existeix");
        return
    } else {
        windows[value].close();
        windows[value] = null;
    }
}
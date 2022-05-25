var window1;
var window2;
var focused;

function text() {
    let posX = focused.screenX;
    let posY = focused.screenY;
    let ample = focused.outerWidth;
    let alcada = focused.outerHeight;

    let doc = focused.document;

    doc.getElementById("title").innerHTML = "<h2 id='title'>Pàgina</h2>";
    doc.getElementById("msg").innerHTML = "<p>L'amplada de la finestra " + ample + "px. <br /> L'alçada de la finestra és " + alcada + "px. <br /></p>";
    doc.getElementById("msg").innerHTML += "<p>Posició X: " + posX + ". <br> Posició Y: " + posY + ". <br></p>";
}

function open1() {
    window1 = window.open("", "pagina1", "left=0, top=0, width=200, height=250, location=yes, directories=yes");
    window1.document.write("<h2 id='title'></h2>");
    window1.document.write("<p id='msg'></p>");
    focused = window1;
    text();
}

function open2() {
    window2 = window.open("", "pagina2", "left=0, top=0, width=200, height=250, location=no, directories=no");
    window2.document.write("<h2 id='title'></h2>");
    window2.document.write("<p id='msg'></p>");
    focused = window2;
    text();
}

function focus1() {
    window1.focus();
    focused = window1;
}

function focus2() {
    window2.focus();
    focused = window2;
}

function moveWindow(direction) {
    switch (direction) {
        case 1:
            focused.moveBy(-50, 0);
            text();
            break;
        case 2:
            focused.moveBy(0, 50);
            text();
            break;
        case 3:
            focused.moveBy(0, -50);
            text();
            break;
        case 4:
            focused.moveBy(50, 0);
            text();
            break;
    }
}

function bigger() {
    focused.resizeBy(100, 100);
    text(focused);
    text();
}

function lower() {
    focused.resizeBy(-100, -100);
    text(focused);
    text();
}

function close1() {
    window1.close();
}

function close2() {
    window2.close();
}

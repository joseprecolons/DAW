var contingutJSON ={
    
            "planetes": [{
                "nom": "Mercuri",
                "tipus": "rocos",
                "radi": 145,
                "massa": 214
            },
            {
                "nom": "Venus",
                "tipus": "rocos",
                "radi": 145,
                "massa": 214
            },
            {
                "nom": "La Terra",
                "tipus": "rocos",
                "radi": 145,
                "massa": 214,
                "satelits": ["la lluna"]
            },
            {
                "nom": "Mart",
                "tipus": "rocos",
                "radi": 145,
                "massa": 214,
                "satelits": ["Fobos",
                "Deimos"]
            },
            {
                "nom": "Jupiter",
                "tipus": "gasos",
                "radi": 145,
                "massa": 214,
                "satelits": ["Io",
                "Europa",
                "Ganimedes"]
            }]
   
};


var x = 0;
var y = 0;

mostra();

function mostra() {
    document.getElementById("nom").innerHTML = contingutJSON.planetes[x].nom;
    document.getElementById("tipus").innerHTML =  contingutJSON.planetes[x].tipus;
    document.getElementById("radi").innerHTML =  contingutJSON.planetes[x].radi;
    document.getElementById("massa").innerHTML =  contingutJSON.planetes[x].massa;
	if (contingutJSON.planetes[x].satelits == null) {
		document.getElementById("satelits").innerHTML = "";
	}else{
    document.getElementById("satelits").innerHTML =  contingutJSON.planetes[x].satelits[y];
	}
};

function seguentP() {
    if (x == contingutJSON.planetes.length-1){
        alert("Final Planetes");
    } else {
		x++;
		y = 0;
		if (contingutJSON.planetes[x].satelits == null) {
			document.getElementById("satelits").innerHTML = "";
		}
    }
	mostra();
};

function anteriorP() {
    if (x == 0){
        alert("Inici Planetes");
    } else {
		x--;
		y = 0;
		if (contingutJSON.planetes[x].satelits == null) {
			document.getElementById("satelits").innerHTML = "";
		}
    }
	mostra();
};

function seguentS() {
    if (y == contingutJSON.planetes[x].satelits.length -1){
        alert("Final Satelits");
    } else {
		y++;
		if (contingutJSON.planetes[x].satelits == null) {
			document.getElementById("satelits").innerHTML = "";
		}
    }
	mostra();
};

function anteriorS() {
    if (y == 0){
		alert("Inici Satelits");
    } else {
		y--;
		if (contingutJSON.planetes[x].satelits == null) {
			document.getElementById("satelits").innerHTML = "";
		}
    }
	mostra();

};


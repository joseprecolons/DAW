var x = 0;
var y = 0;
var nom = "";
var maxX = contingutJSON.habitatge.length-1;
var maxY = contingutJSON.habitatge[x].habitants.length -1;

debugger;

function informacio() {
    document.getElementById("contador").value = x+1;
    document.getElementById("contador2").value = y+1;
    document.getElementById("carrerP").value = contingutJSON.habitatge[x].carrer;
    document.getElementById("numeroP").value = contingutJSON.habitatge[x].numero;
    document.getElementById("portaP").value = contingutJSON.habitatge[x].porta;
    document.getElementById("nifHabitant").value = contingutJSON.habitatge[x].habitants[y].NIF;
    document.getElementById("nomHabitant").value = contingutJSON.habitatge[x].habitants[y].nom;
    document.getElementById("cognomHabitant").value = contingutJSON.habitatge[x].habitants[y].cognom;
    document.getElementById("dataNaixHabitant").value = contingutJSON.habitatge[x].habitants[y].dataNaix;
    document.getElementById("sexeHabitant").value = contingutJSON.habitatge[x].habitants[y].sexe;
};
    
function myFunction() {
    if (x == maxX){
        x = 0;
    } else {
        x++;
    }
    informacio();
};

function myFunction2() {
    if (x == 0){
        x = maxX;
    } else {
        x--;
    }
    informacio();
};

function myFunction3() {
    if (y == maxY){
        y = 0;
    } else {
        y++;
    }
    informacio();
};

function myFunction4() {
    if (y == 0){
        y = maxY;
    } else {
        y--;
    }
    informacio();
};

function afegirHabitatge(){
    contingutJSON.habitatge.push({"carrer":document.getElementById("carrerP").value, "numero":document.getElementById("numeroP").value, 
    "porta":document.getElementById("portaP").value});

    max = contingutJSON.habitatge.length + 1;
    alert("S'ha afegit un habitatge");
    informacio();
};

function afegirHabitant(){
    contingutJSON.habitatge[x].habitants.push({"NIF":document.getElementById("nifHabitant").value, "nom":document.getElementById("nomHabitant").value,
    "cognom":document.getElementById("cognomHabitant").value, "dataNaix":document.getElementById("dataNaixHabitant").value, 
    "sexe":document.getElementById("sexeHabitant").value});

    max = contingutJSON.habitatge[x].habitants.length + 1;
    alert("S'ha afegit un habitant");
    informacio();
};

function mostrar(){
    informacio();
};

function modificar(){
    contingutJSON.habitatge[x].carrer = document.getElementById("carrerP").value;
    contingutJSON.habitatge[x].numero = document.getElementById("numeroP").value;
    contingutJSON.habitatge[x].porta = document.getElementById("portaP").value;
    contingutJSON.habitatge[x].habitants[y].NIF = document.getElementById("nifHabitant").value;
    contingutJSON.habitatge[x].habitants[y].nom = document.getElementById("nomHabitant").value;
    contingutJSON.habitatge[x].habitants[y].cognom = document.getElementById("cognomHabitant").value;
    contingutJSON.habitatge[x].habitants[y].dataNaix = document.getElementById("dataNaixHabitant").value;
    contingutJSON.habitatge[x].habitants[y].sexe = document.getElementById("sexeHabitant").value;
    alert("S'han modificat les dades");
    informacio();
};

function borrar(){
    contingutJSON.habitatge.splice(x,1);
    alert("S'ha borrat un habitatge");
    maxX = contingutJSON.habitatge.length-1;
    informacio();
};

function borrarHabitant(){
    contingutJSON.habitatge[x].habitants.splice(y,1);
    alert("S'ha borrat un habitant");
    maxY = contingutJSON.habitatge[x].habitants.length -1;
    informacio();
};

   var contingutJSON =
   {
     "quiz":         [
         {

           "question": "Which one is correct team name in NBA?",
           "options": [
             "New York Bulls",
             "Los Angeles Kings",
             "Golden State Warriros",
             "Huston Rocket"
           ],
           "answer": "4"
         },

         {
           "question": "5 + 7 = ?",
           "options": [
             "10",
             "11",
             "12",
             "13"
           ],
           "answer": "3"
         },
         {
           "question": "If soccer is called football in England, what is American football called in England",
           "options": [
             "American football",
             "Combball",
             "Handball",
             "Touchdown"
           ],
           "answer": "1"
         },
         {
            "question": "What is the largest country in the world?",
            "options": [
              "Russia",
              "Canada",
              "China",
              "United States"
            ],
            "answer": "1"
          },
          {
            "question": "An organic compound is considered an alcohol if it has what functional group?",
            "options": [
              "Aldehyde",
              "Carbonyl",
              "Alkyl",
              "Hydroxyl"
            ],
            "answer": "4"
          },
          {
            "question": "What is the 100th digit of Pi?",
            "options": [
              "4",
              "7",
              "9",
              "2"
            ],
            "answer": "3"
          },
          {
            "question": "A doctor with a PhD is a doctor of what?",
            "options": [
              "Psychology",
              "Philosophy",
              "Phrenology",
              "Physical Therapy"
            ],
            "answer": "2"
          },
          {
            "question": "What year did World War I begin?",
            "options": [
              "1905",
              "1925",
              "1914",
              "1919"
            ],
            "answer": "3"
          },
          {
            "question": "What is isobutylphenylpropanoic acid more commonly known as?",
            "options": [
              "Morphine",
              "Ketamine",
              "Aspirin",
              "Ibuprofen"
            ],
            "answer": "4"
          },
          {
            "question": "What state is the largest state of the United States of America?",
            "options": [
              "Alaska",
              "California",
              "Texas",
              "Washington"
            ],
            "answer": "1"
          }

       ]};
       

var x = 0;
var y = 0;
var maxX = contingutJSON.quiz.length -1;
var respostes = new Array(contingutJSON.quiz.length);
var respostesComprovacio = new Array(contingutJSON.quiz.length);

mostra();

//Si vols saber que fa la funció llegeix el seu nom. Sinó vols llegir-lo, aquesta funció serveix per mostrar les dades.
function mostra() {
    document.getElementById('contador').innerHTML = x+1;
    document.getElementById('pregunta').innerHTML = contingutJSON.quiz[x].question;
    for (var i = 0; i < contingutJSON.quiz[x].options.length; i++) {
        document.getElementById('en' + (i+1)).innerHTML = contingutJSON.quiz[x].options[i];
    }
    var element = document.getElementsByName("resposta");
    for (var i = 0; i < element.length; i++) {
      element[i].checked = false;
    }
    element[respostes[x]-1].checked = true; 
};


//Si vols saber que fa la funció llegeix el seu nom. Sinó vols llegir-lo, aquesta funció serveix per guardar les respostes del usuaris, i han encertat o no.
function agafarResposta() {
    for (var i = 0; i < contingutJSON.quiz[x].options.length; i++) {
        if (document.getElementById('r' + (i+1)).checked) {
            respostes[x] = i+1;
            if (respostes[x] == contingutJSON.quiz[x].answer) {
                respostesComprovacio[x] = true;
            } else {
                respostesComprovacio[x] = false;
            }
            break;
        }
    }
};

//Si vols saber que fa la funció llegeix el seu nom. Sinó vols llegir-lo, aquesta funció serveix per anar a la següent pregunta.
function doSeguent() {

    agafarResposta();

    if (x == contingutJSON.quiz.length-1){
        x = 0;
    } else {
        x++;
    }
    mostra();
};


//Si vols saber que fa la funció llegeix el seu nom. Sinó vols llegir-lo, aquesta funció serveix per anar a l'anterior pregunta
function doAnterior() { 

    agafarResposta();

    if (x == 0){
        x = contingutJSON.quiz.length-1;
    } else {
        x--;
    }
    mostra();
};

//Si vols saber que fa la funció llegeix el seu nom. Sinó vols llegir-lo, aquesta funció serveix per mostrar el resultat.
function resultat() {
    var correctes = 0;
    for (var i = 0; i < contingutJSON.quiz.length; i++) {
        if (respostesComprovacio[i]) {
            correctes++;
        }
    }

    alert(correctes + " / " + contingutJSON.quiz.length);
   
  }


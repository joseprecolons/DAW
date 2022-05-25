<?php
session_start();
include("inc/functions.php");

$nivell = explode(',', $_SESSION["nivell"]);
$numCeles = $nivell[0] * $nivell[1] - $nivell[2];
$arrayInicial = [];

for ($i = 0; $i < $nivell[0]; $i++) {
    for ($j = 0; $j < $nivell[1]; $j++) {
        $arrayInicial[$i][$j] = "";
    }
}

$arrayInicial = omplirBombes($arrayInicial, $nivell);
$arrayInicial = comrovarBombes($arrayInicial, $nivell);

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/style.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Busca Mines</title>
</head>

<script>
    $.noClick = function() {
        $(document).ready(function(){
            $("td img").prop("onclick", null);
        });
    };

    $.addEvent = function(resultat) {
        resultat = (!$("td img").prop('none'))? resultat + 1: resultat;
        return resultat;
    };


    $(document).ready(function(){
   	    $("td img").mousedown(function(e){
   		//1: izquierda, 2: medio/ruleta, 3: derecho
        	if(e.which == 3) {
                let isBlank = this.src.indexOf('imgs/blank.gif') != -1;
                this.src = isBlank ? this.src.replace('imgs/blank.gif', 'imgs/bombflagged.gif')
                : this.src.replace('imgs/bombflagged.gif', 'imgs/blank.gif');
        	}
    	});
    });
</script>

<body>

    <?php
    echo '<div class="table">';
    echo '<table border="1">';
    echo '<caption>Bombes: '. $nivell[2].' <br> <img src="./imgs/facesmile.gif" onclick="location.reload()" id="caraReload"></img></caption>';

    for ($i = 0, $bombCounter = 1; $i < $nivell[0]; $i++) {
        echo '<tr>';
        for ($j = 0; $j < $nivell[1]; $j++) {
            $function;
            if ($arrayInicial[$i][$j] == "*") {
                echo '<td style=width:20px><img onclick="clickBomba('. $bombCounter. "9". $i. $j.', '. $nivell[2]. ', '. $bombCounter. ')" id="blank'. $bombCounter. '9'.$i,$j.'" class="blank'.$bombCounter. '" style="position:fixed; display:block" src="./imgs/blank.gif">' . $arrayInicial[$i][$j] . '</td>';
                $bombCounter++;
            } else {
                echo '<td style=width:20px><img onclick="clickCela('. "9". $i. $j.', '.$numCeles.', '.$numCeles.')" id="blank9'.$i,$j.'" style="position:fixed; display:block" src="./imgs/blank.gif">' . $arrayInicial[$i][$j] . '</td>';
            }
        }
        echo '</tr>';
    }

    echo '</table>';
    echo '</div>';

    
    //Taula per saber a on son les bombes
    // echo '<table border="1">';
    // for ($i = 0; $i < $nivell[0]; $i++) {
    //     echo '<tr>';
    //     for ($j = 0; $j < $nivell[1]; $j++) {
    //         echo '<td style="width:20px; color:white";>' . $arrayInicial[$i][$j] . '</td>';
    //     }
    //     echo '</tr>';
    // }
    // echo '</table>';
    ?>
</body>

<script>

    document.addEventListener('contextmenu', event => event.preventDefault());
    var resultat = 0;

    function clickCela(numCela, numCeles) {
        // console.log(numCela);
        resultat = $.addEvent(resultat);
        element = document.getElementById("blank"+numCela);
        if (element.src.indexOf('imgs/bombflagged.gif') == -1) {
                element.style.display = "none"; 
        }

        if (!(resultat < numCeles)) {
            $.noClick();
            document.getElementById("caraReload").src = "imgs/facewin.gif";
        }
    }

    function clickBomba(numCela, dificultat, bombCounter) {
        counter = 1;
        // console.log(numCela + "bomba, " + dificultat + ", " + bombCounter);
        element = document.getElementById("blank"+numCela);
        // console.log(element);
        element.src = "imgs/bombdeath.gif";
        document.getElementById("caraReload").src = "imgs/facedead.gif";
        for (let i = 0; i < dificultat; i++) {
            if (counter != bombCounter) {
                elementBomb = document.getElementsByClassName("blank" + counter);
                // console.log(elementBomb);
                elementBomb[0].src = "imgs/bombrevealed.gif";
            }
            counter++;
        }
        $.noClick();
    }
</script>

</html>
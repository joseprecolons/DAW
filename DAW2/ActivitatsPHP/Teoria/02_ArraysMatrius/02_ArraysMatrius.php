<?php

/*ARRAYS*/

$arrNoms = array();

$arrNoms = ["Marcel", "Marti", "Joel", "Gerard"];

echo "<p>El primer element de l'array " .$arrNoms[0] ."</p>";
echo "<p>El primer element de l'array " .$arrNoms[1] ."</p>";
echo "<p>El primer element de l'array " .$arrNoms[2] ."</p>";
echo "<p>El primer element de l'array " .$arrNoms[3] ."</p>";

for ($i = 0; $i < count($arrNoms); $i++){
    if ($arrNoms[$i] == "Marti") {
        $arrNoms[$i] = "Josep";
        echo "<p> S'ha cambiat el valor de la posició " .$i."</p>";
    }
    echo "<p>L'element número " .$i ." de l'array, te el valor de " .$arrNoms[$i] ."</p>";
}

/*MATRIUS*/

$matriu = array(array(1,2), array(3,4));
$matriu[0][2] = 25;
$matriu[1][2] = 35;

for ($i = 0; $i < count($matriu); $i++){
    for ($j = 0; $j < count($matriu[$i]); $j++) {
       echo "<p>L'element número " .$i ." de l'array, te el valor de " .$matriu[$i][$j] ."</p>"; 
    }
    
}


?>
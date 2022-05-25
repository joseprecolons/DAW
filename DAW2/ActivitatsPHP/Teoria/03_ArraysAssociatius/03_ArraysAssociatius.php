<?php

$dades = array();

/*Arrays Associatius*/

$dades[0]["nom"] = "Josep";
$dades[0]["dni"] = "77622690J";
$dades[0]["edat"] = 21;

$dades[1]["nom"] = "Pol";
$dades[1]["dni"] = "65348790E";
$dades[1]["edat"] = 21;

echo "<p> Nom: " .$dades[0]["nom"] ."</p>";
echo "<p> DNI: " .$dades[0]["dni"] ."</p>";
echo "<p> Edat: " .$dades[0]["edat"] ."</p>";

echo "<p> Nom: " .$dades[1]["nom"] ."</p>";
echo "<p> DNI: " .$dades[1]["dni"] ."</p>";
echo "<p> Edat: " .$dades[1]["edat"] ."</p>";


echo "Dades de la matriu actual abans de unset <br>";
// Mostra la matriu per pantalla directament
print_r($dades);
echo "<br>";


//Destrueix les dades
unset($dades);

echo "Dades de la matriu després abans de unset <br>";

?>
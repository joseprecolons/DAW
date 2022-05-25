<?php

$nom = isset($_POST["nom"]) ? $_POST["nom"] : $_GET["nom"];
$cognom = isset($_POST["cognom"]) ? $_POST["cognom"] : $_GET["cognom"];

$directoriFitxer = "files/fitxer.txt";
$elMeuFitxer = fopen($directoriFitxer, "w");

if ($elMeuFitxer) {
    header("location:resultat.php?resultat=OK");

    $lineaTxt = "Nom: " . $nom . " - Cognom: " . $cognom . "\n";
    fwrite($elMeuFitxer, $lineaTxt);
} else {
    header("location:resultat.php?resultat=KO");
}

fclose($elMeuFitxer);

?>

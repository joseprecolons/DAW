<?php

require_once ("inc/funcions.php");

$nom = recollirDades("nom");
$cognom = recollirDades("cognom");
$edat = recollirDades("edat");
$aficions = recollirDades("aficions");
$pes = recollirDades("pes");
$sexe = recollirDades("sexe");
$religios = recollirDades("religios");




?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php 
    if ($msgError != "") {
        echo '<span style="color:red;"> ' . $msgError . '</span>';
    } else {
        echo '<p>El teu nom és ' . $nom;
        echo '<p>El teu cognom és ' . $cognom;
        if ($edat == 1) {
            echo '<p> La teva edat es inferior a 20 anys';
        } elseif ($edat == 2) {
            echo '<p> La teva edat està entre 20 i 39 anys';
        } elseif ($edat == 3) {
            echo '<p> La teva edat està entre 40 i 59 anys';
        } else {
            echo '<p> La teva edat és més de 60 anys';
        }

        if ($aficions == 1) {
            echo '<p> La teva afició són els videojocs';
        } elseif ($aficions == 2) {
            echo '<p> La teva afició és el handbol';
        } elseif ($aficions == 3) {
            echo '<p> La teva afició és el footbol';
        } else {
            echo '<p> Les teves aficions són altres';
        }

        echo '<p> El teu pes és de ' . $pes . ' kg';
        echo '<p> El teu sexe és ' . $sexe;

        if ($religios == "on") {
            echo '<p> Ets una persona religiosa';
        } else {
            echo '<p> No ets una persona religiosa';
        }

    }
        
?>

</body>
</html>
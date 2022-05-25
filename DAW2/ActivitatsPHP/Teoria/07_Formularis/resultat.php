<?php
    $resultat = isset($_GET["resultat"])?$_GET["resultat"]:"";
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
    echo "<h1>Resultat de la operació</h1><br>";
    if ($resultat == "OK") {
        echo "L'enviament de dades s'ha processat correctament";
    } else {
        echo "Error en el processament de les dades!!";
    }
        // echo "<p><b>Les dades enviades pel formulari són<b>";
        // echo "<p>Nom: ".$nom;
        // echo "<p>Cognom: ".$cognom;
    
        ?>

</body>
</html>
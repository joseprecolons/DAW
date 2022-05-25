<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Número Aleatori</title>
</head>
<body style="text-align: center;">

    <h1> Número Aleatori 1 - 10</h1>

    <?php
        /*Aquesta pàgina mostrará un número aleatori de 1 a 10 cada vegada que carregui la pàgina */

        $iniciHTML = "<p><span style='border: 2px solid black; padding: 10px; font-size: 60px'>";
        $valor = rand(1,10);
        $finHTML = "</span></p>";

        echo $iniciHTML . $valor . $finHTML;
?>
    
</body>
</html>


<?php
include("inc/funcions.php");
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comptar daus</title>
</head>

<body>
    <h1>Comptar days (Formulari)</h1>
    <p>Escull un nombre de daus (entre 2 i 10) y un color:</p>
    <form action="fullDaus.php" method="POST">
        <strong>Nombre de daus:</strong>
        <input type="number" name="numDaus" id="numDaus" min="2" max="10" required><br>

        <strong>Color:</strong>
        <?php
        $valors = array(
            "0" => ".....",
            "1" => "blau",
            "2" => "vermell"
        );

        echo getDesplegable("color", "color", $valors);
        ?><br>
        <strong>Elements: </strong>
        <input type="checkbox" name="titol" id="titol">Títol
        <input type="checkbox" name="nDausSeleccionats" id="nDausSeleccionats">Nombre daus seleccionat
        <input type="checkbox" name="tornada" id="tornada">Enllaç al formulari (tornada)
        <br>
        <button type="submit">Mostrar</button>
        <button type="reset">Esborrar</button>
    </form>

</body>

</html>
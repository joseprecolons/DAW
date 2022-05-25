<?php
session_start();
session_destroy();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Retrat Robot</title>
</head>
<body>
<form action="gestionarInformacio.php" method="POST" class="form">
        <h1>Retrat Robot</h1>
        <input type="text" name="nom" id="nom" placeholder="Nom jugador" required>
        <input type="number" name="tirades" id="tirades" min="1" placeholder="Número de tirades" required>
        <button type="submit" value="25" name="comensar">Començar</button>
    </form>
</body>
</html>
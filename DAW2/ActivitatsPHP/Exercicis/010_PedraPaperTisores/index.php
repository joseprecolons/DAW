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
    <link href="styles/styleIndex.css" rel="stylesheet" type="text/css">
    <title>Pedra, paper, tisores, lagarto, spock</title>
</head>

<body>

    <form action="gestionarInformacio.php" method="POST" class="form">
        <h1>Pedra, paper, tisores, lagarto, spock</h1>
        <input type="text" name="nom1" id="nom1" placeholder="Nom jugador 1" required>
        <input type="text" name="nom2" id="nom2" placeholder="Nom jugador 2" required>
        <input type="number" name="tirades" id="tirades" min="1" placeholder="Número de tirades" required>
        <button type="submit">Començar el joc</button>
    </form>
    
</body>

</html>
<?php
session_start();
include("inc/functions.php");
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

<body>
    <form action="gestionarVariablesSessio.php" method="post" class="form">
        <input type="text" name="nom" id="nom" placeholder="Nom">
        <?php
        $valors = array(
            "0" => "Principiant",
            "1" => "Intermig",
            "2" => "Expert"
        );
        echo getDesplegable("nivell", "nivell", $valors);
        ?>
        <button type="submit">Jugar</button>
    </form>
</body>

</html>
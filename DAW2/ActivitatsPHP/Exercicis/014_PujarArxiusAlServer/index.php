<!DOCTYPE html>
<html lang="en">

<?php
$img = isset($_GET["img"]) ? $_GET["img"] : "";

?>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
    <script src="js/script.js"></script>
    <link rel="stylesheet" href="styles/style.css">
    <title>Obtenir dades socis JQUERY</title>
</head>

<body>
    <menu>
        <li><input id="pujarAvatar" type="button" value="Pujar avatar soci" /></li>
        <li><input id="pujarImatge" type="button" value="Pujar imatges professions" /></li>
        <li><input id="llistaSocis" type="button" value="Llistat socis" /></li>
        <li><input id="galeriaProfessio" type="button" value="Galeria professions" /></li>
    </menu>
    <div id="response-container" class="response-container">
    </div>

    <?php
    if ($img != "") {
        if ($img == "OK") {
            echo "<p class='resMsg' style='color:green'>La imatge s'ha pujat correctament :)</p>";
        } else if ($img == "KO") {
            echo "<p class='resMsg' style='color:red'>Algo ha sortit malament :(</p>";
        }
    }
    ?>
</body>

</html>
<?php
    require_once("inc/funcions.php");
    require_once("inc/constant.php");

    $error = isset($_GET["error"])?$_GET["error"]:"";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulari insert dades BBDD</title>
</head>

<?php
    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    if (!$mysqli) {
        echo 'Error: Connexió amb BBDD';
        exit();
    }
?>

<body>
    <form action="inc/operaciobbdd.php" method="post">
    Nom soci: <input type="text" name="nomSoci" id="nomSoci">
    <?php
        $select = getSelectDataProfessions($mysqli, "idProfessio", "idProfessio");
        echo "Professió ". $select;
    ?>
        <input type="hidden" name="operacio" value="nou">
        <input type="submit"></input>
    </form>


<?php
    if ($error == "0") {
        $msg = "L'operació d'inserció s'ha fet correctament";
    } else if ($error == "1"){
        $msg = "Error en la connexio de la BBDD";
    } else if ($error == "2") {
        $msg = "Error en l'operació INSERT del registre";
    }
?>

    <span color="red"><?=$msg?></span>

</body>
</html>
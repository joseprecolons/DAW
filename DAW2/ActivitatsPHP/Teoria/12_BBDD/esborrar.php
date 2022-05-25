<?php
    require_once("inc/funcions.php");
    require_once("inc/constant.php");

    $operacio = isset($_POST["operacio"]) ? $_POST["operacio"] : "";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Esborrar dades BBDD</title>
</head>
<body>

<?php
    $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
    if (!$mysqli) {
        echo 'Error: Connexió amb BBDD';
        exit();
    }

    if($operacio != "1") {
?>
    <form action="esborrar.php" method="post">
        <?php
            echo getSelectDataSocis($mysqli, "sociEsborrar", "sociEsborrar");
        ?>
        <input type="hidden" name="operacio" value="1">
        <button type="submit">Esborrar</button>
    </form>

<?php
    } else {
        $idSoci = isset($_POST["sociEsborrar"])?$_POST["sociEsborrar"]:"";
        if ($idSoci == "") {
            echo "No es pot esborrar el registre perquè no s'han rebut dades";
        } else {
            $sql = 'DELETE FROM '._TABLESOCIS.' WHERE id_soci ='.$idSoci;
            $result = $mysqli -> query($sql);

            if (!$result) {
                echo 'Error en la SQL DELETE' . $mysqli -> errno. ' - ' .$mysqli -> eror;
            } else {
                echo "El registra s'ha esborrat correctaent ";
                echo "<a href='index.html'>Tornar a la pàgina principal</a>";
            } 
        }


    }
?>
</body>
</html>
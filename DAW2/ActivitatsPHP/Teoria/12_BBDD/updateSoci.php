<?php
    require_once("inc/funcions.php");
    require_once("inc/constant.php");

    $nomSoci = recollirDades("sociUpdate");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actualitzar dades BBDD</title>
</head>
<body>

<?php
        $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
        if (!$mysqli) {
            echo 'Error: Connexió amb BBDD';
            exit();
        }

        $sql = "SELECT id_soci, nom_soci FROM ". _TABLESOCIS;
        $result = $mysqli -> query($sql);

        while ($row = $result -> fetch_array()) {
            if ($row["id_soci"] == $nomSoci) {
                echo '<input type="text" name="'.$row["id_soci"].'" id="'.$row["id_soci"].'" value="'.$row["nom_soci"].'"></input><br>';
            }
        }

        $select = getSelectDataProfessions($mysqli, "idProfessio", "idProfessio");
            echo "Professió: ". $select;
    ?>

</body>
</html>
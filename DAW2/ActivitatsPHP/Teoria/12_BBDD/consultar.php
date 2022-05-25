<?php
    require_once("inc/funcions.php");
    require_once("inc/constant.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consultar dades bbdd</title>
</head>
<body>
    <?php
        $mysqli = connectaBBDD(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
        if (!$mysqli) {
            echo 'Error: Connexió amb BBDD';
            exit();
        }

        $sql = 'SELECT s.nom_soci, p.nom_professio FROM '. _TABLESOCIS. ' s 
            INNER JOIN '. _TABLEPROFESSIONS. ' p 
            ON s.id_professio = p.id_professio';

        $result = $mysqli -> query($sql);

        if (!$result) {
            echo 'Error en la SQL INSERT' . $mysqli -> errno. ' - ' .$mysqli -> eror;
        } else {
            if ($result -> num_rows == 0) {
                echo 'No existeixen registres a la BBDD';
            } else {
                echo '<table border=1>';
                echo '<tr><td>Nom Soci</td><td>Professió</td></tr>';
                while ($row = $result -> fetch_array()) {
                    echo '<tr><td>' .$row["nom_soci"]. '</td><td>' .$row["nom_professio"] .'</td></tr>';
                }

                echo '</table>';
            }
        }
    ?>    

</body>
</html>
<?php
    require_once("inc/funcions.php");
    require_once("inc/constant.php");

    $operacio = isset($_POST["operacio"]) ? $_POST["operacio"] : "pas1";
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
?>
<?php
    if ($operacio == "pas1") { //Mostrem desplegable per escollir soci
?>
    <form action="update.php" method="post">
        <?php
            echo getSelectDataSocis($mysqli, "idUpdateSoci", "idUpdateSoci");
        ?>
        <input type="hidden" name="operacio" value="pas2">
        <button type="submit">Seleccionar</button>
    </form>

<?php 
    } else if ($operacio == "pas2") { //Formulari per modificar
        $idSoci = recollirDades("idUpdateSoci");
        $sql = "SELECT nom_soci, id_professio FROM ". _TABLESOCIS." WHERE id_soci = ".$idSoci;
        $result = $mysqli -> query($sql);

        if (!$result) {
            echo 'Error en la SQL INSERT' . $mysqli -> errno. ' - ' .$mysqli -> eror;
            exit();
        }
        if ($result -> num_rows == 0) {
            echo 'No existeixen registres a la BBDD';
            exit();
        } 
        
        $row = $result -> fetch_array();
?>  
        <form action="update.php" method="POST">
            <input type="text" name="nomSoci" id="nomSoci" value="<?=$row["nom_soci"]?>">
            <?php
                echo getSelectDataProfessions($mysqli, "idProfessio", "idProfessio", $row["id_professio"]);
            ?>
            <input type="hidden" name="idSoci" value="<?=$idSoci?>">
            <input type="hidden" name="operacio" value="pas3">
            <button type="submit">Guardar</button>
        </form>

<?php    
    } else if ($operacio == "pas3") {
        $nomSoci = recollirDades("nomSoci");
        $idProfessio = recollirDades("idProfessio");
        $idSoci = recollirDades("idSoci");
        $sql = "UPDATE "._TABLESOCIS.
            " SET nom_soci = '$nomSoci', id_professio = $idProfessio".
            " WHERE id_soci = $idSoci";
        
        $result = $mysqli -> query($sql);
        if (!$result) {
            echo 'Error en la SQL INSERT' . $mysqli -> errno. ' - ' .$mysqli -> errno;
        } else {
            echo "El registre s'ha modificat correctament";
            echo "<br><a href='index.html'>Tornar a inici</a>";
        }
    } 

?>
</body>
</html>
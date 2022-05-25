<?php
    session_start();
    require_once("inc/funcions.inc");
    require_once("inc/constant.inc");

    $inici = recollirDades("inici");

    if ($inici == 1) {
        $_SESSION["jug"] = recollirDades("jug");
        $_SESSION["nTirada"] = 0;
        $_SESSION["partida"] = array();
    }

    $jugador = $_SESSION["jug"];

    $mysqli = new mysqli(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);

    $sql = "SELECT * FROM " . _TABLEUSUARIS . " WHERE alias = '$jugador' AND actiu = 1";

    $result = $mysqli->query($sql);

    if ($result -> num_rows == 0) {
        header("location:index.php?error=1");
        exit();
    } else {
        while ($row = $result->fetch_array(MYSQLI_ASSOC)) {
            $_SESSION['idJugador'] = $row['id'];
        }
    }


    comprovarUserExistent($mysqli);

    $reiniciar = recollirDades("reiniciar");
    $enviar = recollirDades("enviar");

    if ($reiniciar != "") {
        $_SESSION["nTirada"] = 0;
        reiniciarPuntuacio($mysqli);
        $_SESSION["partida"] = array();
    }

    $idCorredorSeleccionat = recollirDades("idCorredor");
    // echo $idCorredorSeleccionat;
    if ($enviar != "") {
        $_SESSION["partida"][0][$_SESSION["nTirada"]] = $idCorredorSeleccionat;
        // echo  $_SESSION["partida"][0][$_SESSION["nTirada"]];
        // echo $_SESSION["partida"][1][$_SESSION["nTirada"]];
        if ($_SESSION["partida"][0][$_SESSION["nTirada"]] == $_SESSION["partida"][1][$_SESSION["nTirada"]]) {
            sumarPunt($mysqli);
        }
        $_SESSION["nTirada"] = $_SESSION["nTirada"] + 1;
        
        if ($_SESSION["nTirada"] == 4) {
            header("location:final.php");
            exit();
        }
    }
    // echo $_SESSION["nTirada"]; 
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="estils.css">
    <title>Quiz Ciclisme</title>
</head>
<body>
    <center>
    <div class="container bg-dark text-light">
        <b>Hola Iván, </b> a veure quants ciclistes encertes!<br><br>

        <?php
            echo "<p>Tirada número: ".($_SESSION["nTirada"]+1)."</p>";
            echo "<p>Actualment portes ".getPuntuacio($mysqli)." punts</p>";    
        ?>
                    
        <form action="partida.php" method="post" style="display:inline">
            <?php
                
                $num = numRandom(1, 15, $_SESSION["partida"][0]);
                $_SESSION["partida"][1][$_SESSION["nTirada"]] = $num;

                $sql = "SELECT * FROM ". _TABLECORREDORS . " WHERE id = $num";

                $result = $mysqli->query($sql);

                while ($row = $result -> fetch_array()) {
                    echo $row["id"].' - '.$row["nom"];
                    echo '<img src="img/' . $row["foto"] . '"><br><br>';
                }

            ?>
            <?php 
                echo getSelectCorredors($mysqli, "idCorredor", "idCorredor");
            ?>
            <br>
            <br>
            <input type='submit' value='Enviar' name="enviar"> - 
            <input type="submit" value="Tornar a l'inici" name="reiniciar"> -
        </form>


        <form action="mostrarinformacio.php" method="post" style="display:inline">
            <input type="submit" value="Mostrar puntuació">
        </form>
        
        
    </div>
    </center>
    
</body>
</html>
 
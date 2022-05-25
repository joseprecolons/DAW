<?php
session_start();
require_once("inc/functions.php");
require_once("inc/constants.php");

$mysqli = new mysqli(_SERVIDORBBDD, _USERBBDD, _PASSWDBBDD, _NOMBBDD);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
    <link rel="stylesheet" href="styles/style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js">
    <script type='text/javascript' src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'></script>
    <title>Panell</title>
</head>

<body oncontextmenu='return false' class='snippet-body'>
    <nav class="navbar navbar-dark bg-dark" style="padding-left: 1rem; padding-right: 1rem;">
        <h2 class="text-white">Benvingut 
        <?php
            if ($_SESSION['nom'] != "Ivan") {
                echo $_SESSION['nom'] . " " . $_SESSION['cognom1'];
            } else {
                echo "ciclista profesional i millor profe de tots";
            }
            ?>
        </h2>
        <form action="logoff.php" method="post">
            <button class="btn btn-outline-light" type="submit">LogOut</button>
        </form>
    </nav>


    <?php

    $id = $_SESSION['id'];
    $vot;
    $sql = "SELECT vota_a FROM " . _TABLEALUMNES . " WHERE id = $id";
    $result = $mysqli->query($sql);
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_array()) {
            if ($row["vota_a"] == "") {
                $vot = false;
            } else {
                $vot = true;
            }
        }
    }

    if ($vot == true) {
        $fullVot = true;
        $sql =  "SELECT vota_a FROM " . _TABLEALUMNES . " WHERE actiu = 1";
        $result = $mysqli->query($sql);
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_array()) {
                if ($row["vota_a"] == "") {
                    $fullVot = false;
                    break;
                }
            }
        }
        if ($fullVot == true) {

            $sql = "SELECT vota_a, count(*) 'vots' FROM " . _TABLEALUMNES . " WHERE actiu = 1 GROUP BY vota_a ORDER BY vots DESC";
            $result = $mysqli->query($sql);

    ?>
            <div class="leaderboard">
                <h1>
                    Resultats votació delegat
                </h1>
                <?php
                echo '<ol>';
                while ($row = $result->fetch_array()) {

                    $sql = "SELECT nom, cognom1 FROM " . _TABLEALUMNES . " WHERE actiu = 1 AND id = " . $row["vota_a"];
                    $resultNames = $mysqli->query($sql);

                    while ($row2 = $resultNames->fetch_array()) {
                        echo '<li><mark>' . $row2["nom"] . ' ' . $row2["cognom1"] . '</mark><small>' . $row["vots"] . '</small></li>';
                    }
                }
                echo '</ol>';
                ?>
            </div>
    <?php
        } else {
            echo "<p>Ja has votat</p>";
        }
    } else {


        $sql = "SELECT id, nom, cognom1 FROM " . _TABLEALUMNES . " WHERE candidat = 'SÍ' AND actiu = '1'";

        $result = $mysqli->query($sql);

        if ($result->num_rows == 0) {
        } else {
            echo "<form action='votar.php' method='POST'>";
            echo '<div class="container mt-2 mb-4 p-3 d-flex">';
            $stylecard = 0;
            while ($row = $result->fetch_array()) {
                if ($stylecard == 6) {
                    echo "</div>";
                    echo '<div class="container mt-2 mb-4 p-3 d-flex">';
                    $stylecard = 0;
                }
                if ($row["id"] != $_SESSION['id']) {
                    echo '<div class="card p-4" style="margin: 0 2rem">
                                <div class=" image d-flex flex-column justify-content-center align-items-center">
                                        <img src="https://picsum.photos/200/300" height="100" width="100" />';
                    echo '<span class="name mt-3">' . $row["nom"] . ' ' . $row["cognom1"] . '</span>';
                    echo '          <div class=" d-flex mt-2"> 
                                        <button class="btn1 btn-dark" type="submit" value="' . $row["id"] . '" name="vot">Votar</button> 
                                    </div>
                                </div>
                            </div>';
                }
                $stylecard++;
            }
            
            echo "</div></form>";
        }
    }
    ?>
</body>

</html>
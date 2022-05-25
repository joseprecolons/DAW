<?php
include("inc/funcions.php");
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>Dades personals (Formulari Complert)</h1>
    <form action="recollirDades.php" method="post">
        <table>
            <tbody>
                <tr>
                    <td>
                        <label>
                            <b>Nom:</b><br>
                            <input type="text" name="nom" id="nom" size="20" maxlength="20">
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Cognom:</b><br>
                            <input type="text" name="cognom" id="cognom" size="20" maxlength="20">
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Edat:</b><br>
                            <?php
                            $valors = array(
                                "0" => ".....",
                                "1" => "Menys de 20 anys",
                                "2" => "Entre 20 i 39 anys",
                                "3" => "Entre 40 i 59 anys",
                                "4" => "60 anys o més"
                            );

                            echo getDesplegable("edat", "edat", $valors);
                            ?>
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Aficions:</b><br>
                            <?php
                            $valors = array(
                                "0" => ".....",
                                "1" => "Videojocs",
                                "2" => "Handbol",
                                "3" => "Footbol",
                                "4" => "Altres"
                            );

                            echo getDesplegable("aficions", "aficions", $valors);
                            ?>
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Pes:</b><br>
                            <input type="number" name="pes" id="pes" min="1" max="150">
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Sexe:</b><br>
                            <input type="radio" name="sexe" id="sexe" value="home"> Home
                            <input type="radio" name="sexe" id="sexe" value="dona"> Dona
                        </label>
                    </td>
                    <td>
                        <label>
                            <b>Religiós:</b><br>
                            <input type="checkbox" name="religios" id="religios">
                        </label>
                    </td>
                </tr>
            </tbody>
        </table>

        <button type="submit">Enviar informació</button>
    </form>
</body>

</html>
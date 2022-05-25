<?php
session_start();
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

    <?php
    $contador = isset($_SESSION["contador"]) ? $_SESSION["contador"] : 0;
    $contador = intval($contador);
    ?>

    <form action="gestiona.php" method="post" style="text-align: center;">

        <button type="submit" name="accio" value="baixar" style="font-size: 50px; width: 100px;">-</button>
        <span style="font-size: 300px; color:blue;"><?= $contador ?></span>
        <button type="submit" name="accio" value="pujar" style="font-size: 50px; width: 100px;">+</button>

        <br><br>
        <button type="submit" name="accio" value="1" style="font-size: 20px; width: 100px;">Reset</button>

    </form>

</body>

</html>
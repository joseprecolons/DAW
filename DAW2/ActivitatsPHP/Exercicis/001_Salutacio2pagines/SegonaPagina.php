<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="estils.css">
    <title>Document</title>
</head>

<body>
    <h1>Pàgina 2. Día i Hora</h1>
    <?php
    echo "Avui som " . date('d-m-Y-h:i:s') . "<br><br> ";
    ?>

    <button onclick="window.location.href='index.php'">Primera pagina</button>
    <br><br>

    <?php
    echo "<a href='index.php'>Anar a la Primera pàgina";
    ?>
</body>

</html>
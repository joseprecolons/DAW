<?php
session_start();
$contador = isset($_SESSION["contador"]) ? $_SESSION["contador"] : 0;
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv    ="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
<h1>El contingut de la variable de sessió és <?=$contador?></h1>

<?php
    $contador = $contador + 1;
    $_SESSION["contador"] = $contador;
?>
</body>

<a href="tancarSessio.php">kk</a>

</html>
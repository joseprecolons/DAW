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
    echo "<p>Inici bucle FOR</p>";

    for($i=0; $i < 10; $i++) {
        echo "<p>" .$i."</p>";
    }

    echo "<p>Final bucle FOR</p>";

    //-----------

    echo "<p>Inici bucle While</p>";

    $contador = 0;
    while ($contador < 10) {
        echo "<p>" .$contador."</p>";
        $contador++;
    }
    
    echo "<p>Final bucle While</p>";

    //-----------

    echo "<p>Inici bucle FOREACH per array NO ASSOCIATIUS</p>";

    $array = array();
    $array[0] = 85;
    $array[1] = 41;
    $array[2] = 54;

    foreach ($array as $key => $value) {
        echo "<p>Contingut de l'array a la posició " .$key." = " .$value."</p>";
    }

    echo "<p>Final bucle FOREACH per array NO ASSOCIATIUS</p>";
    ?>
    
</body>
</html>
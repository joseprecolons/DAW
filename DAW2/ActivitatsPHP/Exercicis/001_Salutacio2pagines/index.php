<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="estils.css">
    <title>Benvinguda</title>
</head>

<body>
    <h1>Pàgina 1. Salutació</h1>

    <button onclick="window.location.href='SegonaPagina.php'">Segona pagina</button>
    <br><br>
    <?php
    /*
        ENUNCIAT: 
        Fer dues pagines, on la primera tindra un enllaç, que dirigirar a la segona, mostrant la data actual.
        En aquesta segona pàgina, també es posará un enllaç cap a la primera.
        Recordeu que per mostrar la data actual en php és, date("d-m-Y").
        */

    echo "<a href='SegonaPagina.php'>Anar a la Segona pàgina";
    ?>

</body>

</html>
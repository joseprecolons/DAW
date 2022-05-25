<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="styles/styleIndex.css" rel="stylesheet" type="text/css">
    <title>El trilero</title>
</head>
<body>
    
    <form action="taulell.php" method="POST" class="form">
    <h1>El Trilero</h1>
        <input type="text" name="nom" id="nom" placeholder="Nom" required> 
        <input type="number" name="tirades" id="tirades" placeholder="Número de tirades" required>
        <button type="submit">Començar el joc</button>
    </form>
</body>
</html>
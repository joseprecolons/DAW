<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularis</title>
</head>
<body>
    <h1>Formulari Salutació</h1>
    <form action="recollirDades.php" method="POST">
        Nom: <input type="text" name="nom" id="nom">
        <select name="hora" id="hora">
            <?php
            for($i = 0; $i < 24; $i++) {
                if ($i < 10) {
                    echo "<option value=$i>0$i</option> ";
                } else {
                    echo "<option value=$i>$i</option> ";
                }
            }
            
            ?>
        </select>

        <select name="minuts" id="minuts">
        <?php
            for($i = 0; $i < 60; $i++) {
                if ($i < 10) {
                    echo "<option value=$i>0$i</option> ";
                } else {
                    echo "<option value=$i>$i</option> ";
                }
            }
            
            ?>
        </select>
        <button type="submit">Enviar informació</button>
    </form>
    
</body>
</html>
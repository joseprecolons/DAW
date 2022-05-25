<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        th {
            width: 8rem;
            text-align: left;
            border-bottom: 1px solid black;
        }

        td {
            width: 8rem;
        }
    </style>
</head>

<body>
    <h1>Llistat de cotxes</h1>
    <form action="index.php?modificar/<?=$cotxe->getId()?>" method="post">
        <label>Marca</label>
        <input type="text" name="marca" value="<?php echo $cotxe->getMarca()?>"></input>
        <label>Model</label>
        <input type="text" name="model" value="<?php echo $cotxe->getModel()?>"></input>
        <label>Color</label>
        <input type="text" name="color" value="<?php echo $cotxe->getColor()?>"></input>
        <label>Propietari</label>
        <input type="text" name="propietari" value="<?php echo $cotxe->getPropietari()?>"></input>
        <input type="submit">
        <input type="button" value="Cancelar" onClick="document.location.href='index.php'"/>
    </form>


</body>

</html>
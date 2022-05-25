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

    <table>
        <tr>
            <th>Marca</th>
            <th>Model</th>
            <th>Color</th>
            <th>Propietari</th>
            <th>Informació</th>
            <th>Modificar</th>
        </tr>
        <?php foreach ($rowset as $row) { ?>
            <tr>
                <td><?php echo $row -> getMarca() ?></td>
                <td><?php echo $row -> getModel() ?></td>
                <td><?php echo $row -> getColor() ?></td>
                <td><?php echo $row -> getPropietari() ?></td>
                <td><?php echo "<a href='index.php?veure/".$row -> getId()."'>Veure</a>" ?></td>
                <td><?php echo "<a href='index.php?frmmodifica/".$row -> getId()."'>Veure</a>" ?></td>
            </tr>

        <?php } ?>
    </table>
</body>
</html>
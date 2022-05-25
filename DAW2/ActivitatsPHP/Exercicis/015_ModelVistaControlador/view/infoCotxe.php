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
        </tr>
        <tr>
            <td><?php echo $cotxe->getMarca() ?></td>
            <td><?php echo $cotxe->getModel() ?></td>
            <td><?php echo $cotxe->getColor() ?></td>
            <td><?php echo $cotxe->getPropietari() ?></td>

        </tr>
    </table>

    <br>
    <input type="button" value="Tornar" onClick="document.location.href='index.php'" />
</body>

</html>
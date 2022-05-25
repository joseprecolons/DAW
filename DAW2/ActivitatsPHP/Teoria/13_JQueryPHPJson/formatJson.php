<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Format JSON</title>
</head>
<body>
    <?php
        //Format JSON normalitzat
        //{key: value, key2: value2, key3: value3, ......}

        //Format JSON Arrays multidimensionals
        // [{key: value, key2: value2, key3: {key31: value31, key32: value32}}]


        $jsonArray = array();

        $jsonArray["succes"] = true;
        $jsonArray["message"] = "Missatge dins de l'array";

        $valorRetorn = json_encode($jsonArray);
        echo $valorRetorn;

        $jsonData = json_decode($valorRetorn);
        echo $jsonData -> message;

        //retorna en array associatiu
        // $jsonData = json_decode($valorRetorn, true);
        // echo $jsonData["message"];
    ?>

</body>
</html>
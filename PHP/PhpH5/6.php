<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        for ($teller = 1; $teller <= 5; $teller++) {
            for ($teller2 = 1; $teller2 <= $teller; $teller2++) {
                echo $teller;
            }
            echo '<br />';
        }
        ?>
    </body>
</html>

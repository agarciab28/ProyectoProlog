<?php
    $output=`swipl -s holamundo.pl -g "holaMundo." -t halt.`;
    echo($output);

    //No funciona!
    $match=`swipl -s matching.pl -g "pareja(H,M,50,Mar)." -t halt.`;
    var_dump($match);
?>
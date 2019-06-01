<?php
    $output=`swipl -s holamundo.pl -g "holaMundo." -t halt.`;
    echo($output);
?>
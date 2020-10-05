<?php
/**
 * This script produces a report on how much a 
 * a tax payer can expect for their child tax
 * credits.
 * 
 */
 
include_once("Child.php");

$tom = new Child("Tommy", 14); 
$dick = new Child("Richard", 12);
$harry = new Child("Harold", 21);

$kids = array($tom, $dick, $harry);

//TODO: compute the credits and output a table

?>
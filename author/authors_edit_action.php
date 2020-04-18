<?php
require_once('../connection.php');
$id=$_POST['id'];
$name=$_POST['name'];
$email=$_POST['email'];
$password=$_POST['password'];
$status=$_POST['status'];
$query_edit="UPDATE authors set name='".$name."',email='".$email."',password='".$password."',
status='".$status."'where id=".$id;
 

$result_edit=$corn->query($query_edit);
if($result_edit==true){
    setcookie("msg","Update thành công!",time()+5);
    header("Location: authors.php");
}
else{
    setcookie("msg","Update không thành công",time()+5);
    header("Location: authors_edit.php");
}
?>
<?php
require_once('../connection.php');
$name=$_POST['name'];
$email=$_POST['email'];
$password=($_POST['password']);

$status=0;
if(isset($_POST['status'])){
    $status=$_POST['status'];
}

$query="INSERT INTO authors(name ,email,password,status) VALUES ('".$name."','".$email."',
'".$password."','".$status."');";
$result_status=$corn->query($query);
if($result_status==true){
    setcookie("msg","Thêm mới thành công",time()+5);
    header("Location: authors.php");
}
else{
    setcookie("msg","Thêm mới không thành công",time()+5);
    header("Location: authors_add.php");

}

?>
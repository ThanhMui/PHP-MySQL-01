<?php
require_once('../connection.php');
if(isset($_GET['id'])){
    $id=$_GET['id'];
}


$query=" DELETE FROM categories where id=".$id ;
$status=$corn->query($query);

if($status==true){
    setcookie("msg","Xóa thành công",time()+5);
    
}
else{
    setcookie("msg","Xóa không thành công",time()+5);
   

}
header("Location: categories_list.php");
?>
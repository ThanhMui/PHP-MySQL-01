<?php
    require_once('../connection.php');
    if(isset($_GET['id'])){
        $id=$_GET['id'];
    }
    $query="DELETE FROM authors where id=".$id;
    $result_delete=$corn->query($query);
    if($result_delete==true){
        setcookie("msg","Xóa thành công!",time()+5);
       
    }else
    {
        setcookie("msg","Xóa không thành công!",time()+5);
    }
    header("Location:authors.php");
?>
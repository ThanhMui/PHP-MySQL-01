<?php
require_once('../connection.php');
$id=$_POST['id'];
$title=$_POST['title'];
$description=$_POST['description'];
$query="UPDATE categories set title='".$title."',description='".$description."' where id=".$id;
$status=$corn->query($query);

if($status==true){
    setcookie('msg','Cập nhật thành công',time()+5);
    header('Location: categories_list.php');
}
else{
    setcookie('msg',"Cập nhật không thành công",time()+5);
    header('Location: categories_edit.php?id='.$id );

}

?>
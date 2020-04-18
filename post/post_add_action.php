<?php
require_once('../connection.php');
date_default_timezone_set('Asia/Ho_Chi_Minh');
$target_dir="../img/";
$thumbnail="";
$target_file = $target_dir.basename($_FILES["thumbnail"]["name"]);

$status = move_uploaded_file($_FILES["thumbnail"]["tmp_name"],$target_file);
if($status){
    $thumbnail=basename($_FILES["thumbnail"]["name"]);
}
$title=$_POST['title'];
$description=$_POST['description'];
$contents=$_POST['contents'];
$category_id=$_POST['category_id'];
$author_id=1;
$status=0;
if(isset($_POST['status'])){
$status=$_POST['status'];}
$created_at=date('Y-m-d H-i-s');
$query="INSERT INTO posts(title ,decription,contents,thumbnail,author_id,category_id,status,created_at) 
VALUES ('".$title."','".$description."','". $contents."','".$thumbnail."',".$author_id.",".$category_id.",".$status. ",'". $created_at."');";
//die($query);
$status=$corn->query($query);
//var_dump($status);
if($status==true){
    setcookie("msg","Thêm mới thành công",time()+5);
    header("Location: posts.php");
}
else{
    setcookie("msg","Thêm mới không thành công",time()+5);
    header("Location: post_add.php");
}
?>
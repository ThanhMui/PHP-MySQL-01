<?php
require_once('../connection.php');
$query_cate = " SELECT * From categories ";
$result_cate=$corn->query($query_cate);
$categories_cate=array();
while($rows1=$result_cate->fetch_assoc()){
  $categories_cate[]=$rows1;
}
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Zent - Education And Technology Group</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
    <h3 align="center">Zent - Education And Technology Group</h3>
    <h3 align="center">Category List</h3>
    <a href="categories_add.php" type="button" class="btn btn-primary">Thêm mới</a>
    <?php if( isset($_COOKIE['msg'])){  ?>
    <div class="alert alert-success">
  <strong>Thông báo!</strong><?= $_COOKIE['msg']?>
</div>
    <?php }?>
    <hr>
    <table class="table">
      <thead>
      <th scope="col">#</th>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Title</th>
          <th scope="col">Description</th>
       
        </tr>
      </thead>
      <tbody>
      <?php  foreach ($categories_cate as $cate) {
           
          ?>
        <tr>
          <th scope="row"><?= $cate['id']?></th>
          <td><?= $cate['title']?></td>
          <td><?= $cate['description']?></td>
          <td>
            <a href="categories_detail.php?id=<?= $cate['id']?>" type="button" class="btn btn-default">Xem</a>
            <a href="categories_edit.php?id=<?= $cate['id']?>" type="button" class="btn btn-success">Sửa</a>
            <a href="categories_delete.php?id=<?= $cate['id']?>" type="button" class="btn btn-warning">Xóa</a>
          </td>
        </tr>
        <?php } ?>
      </tbody>
     
    </table>
    </div>
</body>
</html>
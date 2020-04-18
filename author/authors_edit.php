<?php
    require_once('../connection.php');
    if (isset($_GET['id'])){
        $id = $_GET['id'];
    }
    $query_author="SELECT * from authors where id=".$id;
    $result_edit=$corn->query($query_author)->fetch_assoc();
   
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
    <h3 align="center">Update Authors</h3>
    <hr>
    <?php
    if(isset($_COOKIE['msg'])) {?>
    <div class="alert alert-warning">
    <strong>Thông báo!</strong> <?=$_COOKIE['msg'] ?>
  </div>
   <?php } ?>
        <form action="authors_edit_action.php" method="POST" role="form" enctype="multipart/form-data">
         <input type="hidden" name="id" value="<?= $result_edit['id']?>">
            <div class="form-group">
                <label for="">Name</label>
                <input type="text" class="form-control" id="" placeholder="" name="name" value="<?= $result_edit['name']?>">
            </div>
            <div class="form-group">
                <label for="">Email</label>
                <input type="text" class="form-control" id="" placeholder="" name="email" value="<?= $result_edit['email']?>">
            </div>
            <div class="form-group">
                <label for="">Password</label>
                <input type="text" class="form-control" id="" placeholder="" name="password" value="<?= $result_edit['password']?>">
            </div>
            <div class="form-group">
                <label for="">Status</label>
                <input type="text" class="form-control" id="" placeholder="" name="status" value="<?= $result_edit['status']?>">
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
        </form>
    </div>
</body>
</html>
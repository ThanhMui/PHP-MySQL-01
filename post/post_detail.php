<?php
    require_once('../connection.php');
    if (isset($_GET['id'])){
        $id = $_GET['id'];
    }
    $query_post="SELECT * from posts where id=".$id;
    $result_post=$corn->query($query_post)->fetch_assoc();
    
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
    <h3 align="center">Detail Category</h3>
    <hr>
       <h2>Title: <?=$result_post['title'] ?></h2>
       <h2>Description:<?=$result_post['decription'] ?></h2>
       <h2>Thumbnail:<img src="<?= $result_post['thumbnail'] ?> "  width="100px" height="100px"  ></h2>
       <h2>Created_at:<?=$result_post['created_at'] ?></h2>
       <p><?=$result_post['contents'] ?></p>
       
    </div>
</body>
</html>
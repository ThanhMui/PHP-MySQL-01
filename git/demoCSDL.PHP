<?php
    //Thông số kết nối
    $servername="localhost";//địa chỉ IP của máy chủ
    $username="root";//Tên đăng nhập
    $password="";//mật khẩu truy cập 
    $dbname="blogs";//tên CSDL muốn kết nối
    //Tạo kết nối đến CSDL
    $corn=new mysqli($servername,$username,$password,$dbname);
    $query=" SELECT * FROM posts";
    //die ($query);
    $result=$corn->query($query);
    $categories=array();
    while($rows=$result->fetch_assoc()){
        $categories[]=$rows;
    }
    foreach($categories as $cate)
    {
        echo "<pre>";
        print_r ($cate);
        echo "</pre>";
    }
?>
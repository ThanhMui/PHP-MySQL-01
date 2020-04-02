<!DOCTYPE html>
<head>
    <meta http-equiv="content-type"content="text/html";charset="utf-8">
    <title>Hình ảnh</title>
    <link rel="stylesheet" type="text/css"href="../Laptrinhweb/style8.css">
</head>
<body>
   <div class="content">
       <?php
       $group=array("1"=>"Admin","2"=>"Manager","3"=>"Member","4"=>"Guest");
       function createSelect($name,$atribute,$array,$keyselect){
        $xhtml="";
        if(!empty($group)){
 $xhtml.= '<select name='.$name.' id='.$name.' style ='.$atribute.'>';
 foreach ($group as $key => $value) {
     # code...
     if($key==$keyselect){
     $xhtml.= '<option value=".$key." selected="selected">".$value."</option>';
 }
 else{
     $xhtml.= '<option value=".$key." >".$value."</option>';
 }
 }
 $xhtml.= '</select>';
       }
       return  $xhtml;
    }
$grouplect=createSelect('group','width:200px',$group,4);
echo $grouplect;
       ?>
    
    </div>
</body>
</html>

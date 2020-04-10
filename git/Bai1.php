<?php
    (float)$a= 1;
    (float)$b=5;
    (float)$c=2;
   if($a==0)
   {//Phương trình trở thành bậc nhất
                    if($b==0){
                        if($c==0){
                                echo "Phương trình vô số nghiệm!";}
                        else 
                              {  echo "Phương trình vô nghiệm!!";}
                        
                    }else{
                        echo "Phương trình có nghiệm duy nhất x= ".(float)-$c/$b;
                    }
   }
   else{
    $deTa=pow($b,2)-4*$a*$c;
    if($deTa>0){
        $x1=(-$b+sqrt($deTa))/(2*$a);
        $x2=(-$b-sqrt($deTa))/(2*$a);
        echo "Phương trình có nghiệm x1= ".$x1.'<br>';
        echo "Phương trình có nghiệm x2= ".$x2;
    }
    else if($deTa==0){
        echo "Phương trình có nghiệm kép x1=x2= ".(float)-$b/2*$a;
    }
    else{
        echo "Phương trình vô nghiệm!!";
    }
//     switch($deTa){
       
//         case $deTa=0:
//             {
//                 $x0=-$b/2*$a;
//                 $x00=(float)$x0;
//                 echo 'Phương trình có 1 nghiệm duy nhất x1=x2= '.$x00;
//             break;
//             }
//             case $deTa>0:
//                { $x1=(-$b+sqrt($deta))/2*$a;
//                 $x2=(-$b-sqrt($deta))/2*$a;
//                 $x11=(float)$x1;
//                 $x12=(float)$x2;
//                 echo 'Phương trình có nghiệm x1= '.$x11.'<br>';
//                 echo 'Phương trình có nghiệm x2= '.$x12.'<br>';
//                break;}
//                default:
//                {
//                    echo 'Phương trình vô nghiệm!';break;
//                }
//     }
// }
}
function tinhGiaithua($n) {
 $giai_thua = 1;
 if ($n == 0 || $n == 1) {
     return $giai_thua;
 } else {
     for($i = 2; $i <= $n; $i ++) {
         $giai_thua *= $i;
     }
     return $giai_thua;
 }
}
 function tinhTong($n){
     $Tong=0;
     for($i=1;$i<=$n;$i++){
         $Tong=$Tong+$i/tinhGiaithua($i);
     }
     return $Tong;
 }
 
echo tinhTong(3);
?>
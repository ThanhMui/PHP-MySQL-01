<?php
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
 
echo "Tổng là: ".tinhTong(3);
?>
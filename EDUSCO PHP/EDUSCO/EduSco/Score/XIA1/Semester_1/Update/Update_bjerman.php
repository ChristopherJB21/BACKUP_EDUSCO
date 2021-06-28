<?php 
 
 /*
Christopher JB'21
 */
	if($_SERVER['REQUEST_METHOD']=='POST'){
		//MEndapatkan Nilai Dari Variable
		$id = $_POST['id'];
		$name = $_POST['Nama'];
		$kd1 = $_POST['KD1'];
		$kd2 = $_POST['KD2'];
		$kd3 = $_POST['KD3'];
		$kd4 = $_POST['KD4'];
		$kd5 = $_POST['KD5'];
		$uts = $_POST['UTS'];
		$uas = $_POST['UAS'];
		$comment = $_POST['Comment'];
		//import file koneksi database 
		require_once('koneksi.php');
		
		//Membuat SQL Query
		$sql = "UPDATE tb_siswa_bjerman_xia1_semester1 SET KD1 = '$kd1', KD2 = '$kd2', KD3 = '$kd3', KD4 = '$kd4', KD5 = '$kd5', UTS = '$uts', UAS = '$uas', Comment = '$comment'
		WHERE id = $id;";
		
		//Meng-update Database 
		if(mysqli_query($con,$sql)){
		echo 'Berhasil Update Data';
		}else{
		echo 'Gagal Update';
		}
		
		mysqli_close($con);
	}
?>
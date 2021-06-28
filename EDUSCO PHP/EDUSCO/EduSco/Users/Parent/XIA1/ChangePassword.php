<?php 
 
 /*
Christopher JB'21
 */
	if($_SERVER['REQUEST_METHOD']=='POST'){
		//MEndapatkan Nilai Dari Variable
		$id = $_POST['id'];
		$Password = $_POST['Password'];
		
		//import file koneksi database 
		require_once('koneksi.php');
		
		//Membuat SQL Query
		$sql = "UPDATE tb_ortu_xia1 SET id = '$id', Password = '$Password' WHERE id = $id;";
		
		//Meng-update Database 
		if(mysqli_query($con,$sql)){
		echo 'Berhasil Update Data';
		}else{
		echo 'Gagal Update';
		}
		
		mysqli_close($con);
	}
?>
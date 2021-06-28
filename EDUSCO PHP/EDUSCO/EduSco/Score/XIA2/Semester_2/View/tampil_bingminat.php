<?php 
 
 /*
    By: Christopher JB'21 
*/
	
	//Mendapatkan Nilai Dari Variable ID Pegawai yang ingin ditampilkan
	$id = $_GET['id'];
	
	//Importing database
	require_once('koneksi.php');
	
	//Membuat SQL Query dengan pegawai yang ditentukan secara spesifik sesuai ID
	$sql = "SELECT * FROM tb_siswa_bingminat_xia2_semester2 WHERE id=$id";
	
	//Mendapatkan Hasil 
	$r = mysqli_query($con,$sql);
	
	//Memasukkan Hasil Kedalam Array
	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
		"id"=>$row['id'],
		"Nama"=>$row['Nama'],
		"KD1"=>$row['KD1'],
		"KD2"=>$row['KD2'],
		"KD3"=>$row['KD3'],
		"KD4"=>$row['KD4'],
		"KD5"=>$row['KD5'],
		"UTS"=>$row['UTS'],
		"UAS"=>$row['UAS'],
		"Comment"=>$row['Comment']
		));
 
	//Menampilkan dalam format JSON
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>
<?php 
	$id = $_GET['id'];

	require_once('koneksi.php');
	
	$sql = "SELECT * FROM tb_ortu_xia4 WHERE id=$id";
	
	$r = mysqli_query($con,$sql);
	
	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
		"id"=>$row['id'],
		"Password"=>$row['Password']
		));
 
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>
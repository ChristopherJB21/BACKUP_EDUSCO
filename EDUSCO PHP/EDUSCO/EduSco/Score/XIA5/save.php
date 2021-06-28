<?php 
 
 /*
    By: Christopher JB'21 
*/
	
	//Mendapatkan Nilai Dari Variable ID Pegawai yang ingin ditampilkan
	$id = $_GET['id'];
	
	//Importing database
	require_once('koneksi.php');
	
	//Membuat SQL Query dengan pegawai yang ditentukan secara spesifik sesuai ID
	// Semester 1
	$sql1 = "SELECT * FROM tb_siswa_agama_xia5_semester1 WHERE id=$id";
	$sql2 = "SELECT * FROM tb_siswa_pkn_xia5_semester1 WHERE id=$id";
	$sql3 = "SELECT * FROM tb_siswa_indo_xia5_semester1 WHERE id=$id";
	$sql4 = "SELECT * FROM tb_siswa_math_xia5_semester1 WHERE id=$id";
	$sql5 = "SELECT * FROM tb_siswa_sejarah_xia5_semester1 WHERE id=$id";
	$sql6 = "SELECT * FROM tb_siswa_bing_xia5_semester1 WHERE id=$id";
	$sql7 = "SELECT * FROM tb_siswa_art_xia5_semester1 WHERE id=$id";
	$sql8 = "SELECT * FROM tb_siswa_or_xia5_semester1 WHERE id=$id";
	$sql9 = "SELECT * FROM tb_siswa_pkwu_xia5_semester1 WHERE id=$id";
	$sql10 = "SELECT * FROM tb_siswa_mathminat_xia5_semester1 WHERE id=$id";
	$sql11 = "SELECT * FROM tb_siswa_biologi_xia5_semester1 WHERE id=$id";
	$sql12 = "SELECT * FROM tb_siswa_fisika_xia5_semester1 WHERE id=$id";
	$sql13 = "SELECT * FROM tb_siswa_kimia_xia5_semester1 WHERE id=$id";
	$sql14 = "SELECT * FROM tb_siswa_bingminat_xia5_semester1 WHERE id=$id";
	$sql15 = "SELECT * FROM tb_siswa_bjerman_xia5_semester1 WHERE id=$id";
	
	// Semester 2
	$sql16 = "SELECT * FROM tb_siswa_agama_xia5_semester2 WHERE id=$id";
	$sql17 = "SELECT * FROM tb_siswa_pkn_xia5_semester2 WHERE id=$id";
	$sql18 = "SELECT * FROM tb_siswa_indo_xia5_semester2 WHERE id=$id";
	$sql19 = "SELECT * FROM tb_siswa_math_xia5_semester2 WHERE id=$id";
	$sql20 = "SELECT * FROM tb_siswa_sejarah_xia5_semester2 WHERE id=$id";
	$sql21 = "SELECT * FROM tb_siswa_bing_xia5_semester2 WHERE id=$id";
	$sql22 = "SELECT * FROM tb_siswa_art_xia5_semester2 WHERE id=$id";
	$sql23 = "SELECT * FROM tb_siswa_or_xia5_semester2 WHERE id=$id";
	$sql24 = "SELECT * FROM tb_siswa_pkwu_xia5_semester2 WHERE id=$id";
	$sql25 = "SELECT * FROM tb_siswa_mathminat_xia5_semester2 WHERE id=$id";
	$sql26 = "SELECT * FROM tb_siswa_biologi_xia5_semester2 WHERE id=$id";
	$sql27 = "SELECT * FROM tb_siswa_fisika_xia5_semester2 WHERE id=$id";
	$sql28 = "SELECT * FROM tb_siswa_kimia_xia5_semester2 WHERE id=$id";
	$sql29 = "SELECT * FROM tb_siswa_bingminat_xia5_semester2 WHERE id=$id";
	$sql30 = "SELECT * FROM tb_siswa_bjerman_xia5_semester2 WHERE id=$id";
	

	//Mendapatkan Hasil 
	$r1 = mysqli_query($con,$sql1);
	$r2 = mysqli_query($con,$sql2);
	$r3 = mysqli_query($con,$sql3);
	$r4 = mysqli_query($con,$sql4);
	$r5 = mysqli_query($con,$sql5);
	$r6 = mysqli_query($con,$sql6);
	$r7 = mysqli_query($con,$sql7);
	$r8 = mysqli_query($con,$sql8);
	$r9 = mysqli_query($con,$sql9);
	$r10 = mysqli_query($con,$sql10);
	$r11 = mysqli_query($con,$sql11);
	$r12 = mysqli_query($con,$sql12);
	$r13 = mysqli_query($con,$sql13);
	$r14 = mysqli_query($con,$sql14);
	$r15 = mysqli_query($con,$sql15);
	$r16 = mysqli_query($con,$sql16);
	$r17 = mysqli_query($con,$sql17);
	$r18 = mysqli_query($con,$sql18);
	$r19 = mysqli_query($con,$sql19);
	$r20 = mysqli_query($con,$sql20);
	$r21 = mysqli_query($con,$sql21);
	$r22 = mysqli_query($con,$sql22);
	$r23 = mysqli_query($con,$sql23);
	$r24 = mysqli_query($con,$sql24);
	$r25 = mysqli_query($con,$sql25);
	$r26 = mysqli_query($con,$sql26);
	$r27 = mysqli_query($con,$sql27);
	$r28 = mysqli_query($con,$sql28);
	$r29 = mysqli_query($con,$sql29);
	$r30 = mysqli_query($con,$sql30);
	
	// Membuat Array
	$result = array();
	
	// Membuat row pada Array
	$row1 = mysqli_fetch_array($r1);
	$row2 = mysqli_fetch_array($r2);
	$row3 = mysqli_fetch_array($r3);
	$row4 = mysqli_fetch_array($r4);
	$row5 = mysqli_fetch_array($r5);
	$row6 = mysqli_fetch_array($r6);
	$row7 = mysqli_fetch_array($r7);
	$row8 = mysqli_fetch_array($r8);
	$row9 = mysqli_fetch_array($r9);
	$row10 = mysqli_fetch_array($r10);
	$row11 = mysqli_fetch_array($r11);
	$row12 = mysqli_fetch_array($r12);
	$row13 = mysqli_fetch_array($r13);
	$row14 = mysqli_fetch_array($r14);
	$row15 = mysqli_fetch_array($r15);
	$row16 = mysqli_fetch_array($r16);
	$row17 = mysqli_fetch_array($r17);
	$row18 = mysqli_fetch_array($r18);
	$row19 = mysqli_fetch_array($r19);
	$row20 = mysqli_fetch_array($r20);
	$row21 = mysqli_fetch_array($r21);
	$row22 = mysqli_fetch_array($r22);
	$row23 = mysqli_fetch_array($r23);
	$row24 = mysqli_fetch_array($r24);
	$row25 = mysqli_fetch_array($r25);
	$row26 = mysqli_fetch_array($r26);
	$row27 = mysqli_fetch_array($r27);
	$row28 = mysqli_fetch_array($r28);
	$row29 = mysqli_fetch_array($r29);
	$row30 = mysqli_fetch_array($r30);
	
	//Memasukkan Hasil Kedalam Array
	array_push($result,array(
		    "id_1"=>$row1['id'],
		"Nama_1"=>$row1['Nama'],
		"KD1_1"=>$row1['KD1'],
		"KD2_1"=>$row1['KD2'],
		"KD3_1"=>$row1['KD3'],
		"KD4_1"=>$row1['KD4'],
		"KD5_1"=>$row1['KD5'],
		"UTS_1"=>$row1['UTS'],
		"UAS_1"=>$row1['UAS'],
		"COMMENT_1"=>$row1['Comment'],
		
		    "id_2"=>$row2['id'],
		"Nama_2"=>$row2['Nama'],
		"KD1_2"=>$row2['KD1'],
		"KD2_2"=>$row2['KD2'],
		"KD3_2"=>$row2['KD3'],
		"KD4_2"=>$row2['KD4'],
		"KD5_2"=>$row2['KD5'],
		"UTS_2"=>$row2['UTS'],
		"UAS_2"=>$row2['UAS'],
		"COMMENT_2"=>$row2['Comment'],
		
			"id_3"=>$row3['id'],
		"Nama_3"=>$row3['Nama'],
		"KD1_3"=>$row3['KD1'],
		"KD2_3"=>$row3['KD2'],
		"KD3_3"=>$row3['KD3'],
		"KD4_3"=>$row3['KD4'],
		"KD5_3"=>$row3['KD5'],
		"UTS_3"=>$row3['UTS'],
		"UAS_3"=>$row3['UAS'],
		"COMMENT_3"=>$row3['Comment'],
		
		    "id_4"=>$row4['id'],
		"Nama_4"=>$row4['Nama'],
		"KD1_4"=>$row4['KD1'],
		"KD2_4"=>$row4['KD2'],
		"KD3_4"=>$row4['KD3'],
		"KD4_4"=>$row4['KD4'],
		"KD5_4"=>$row4['KD5'],
		"UTS_4"=>$row4['UTS'],
		"UAS_4"=>$row4['UAS'],
		"COMMENT_4"=>$row4['Comment'],
		
			"id_5"=>$row5['id'],
		"Nama_5"=>$row5['Nama'],
		"KD1_5"=>$row5['KD1'],
		"KD2_5"=>$row5['KD2'],
		"KD3_5"=>$row5['KD3'],
		"KD4_5"=>$row5['KD4'],
		"KD5_5"=>$row5['KD5'],
		"UTS_5"=>$row5['UTS'],
		"UAS_5"=>$row5['UAS'],
		"COMMENT_5"=>$row5['Comment'],
		
			"id_6"=>$row6['id'],
		"Nama_6"=>$row6['Nama'],
		"KD1_6"=>$row6['KD1'],
		"KD2_6"=>$row6['KD2'],
		"KD3_6"=>$row6['KD3'],
		"KD4_6"=>$row6['KD4'],
		"KD5_6"=>$row6['KD5'],
		"UTS_6"=>$row6['UTS'],
		"UAS_6"=>$row6['UAS'],
		"COMMENT_6"=>$row6['Comment'],
		
			"id_7"=>$row7['id'],
		"Nama_7"=>$row7['Nama'],
		"KD1_7"=>$row7['KD1'],
		"KD2_7"=>$row7['KD2'],
		"KD3_7"=>$row7['KD3'],
		"KD4_7"=>$row7['KD4'],
		"KD5_7"=>$row7['KD5'],
		"UTS_7"=>$row7['UTS'],
		"UAS_7"=>$row7['UAS'],
		"COMMENT_7"=>$row7['Comment'],
		
			"id_8"=>$row8['id'],
		"Nama_8"=>$row8['Nama'],
		"KD1_8"=>$row8['KD1'],
		"KD2_8"=>$row8['KD2'],
		"KD3_8"=>$row8['KD3'],
		"KD4_8"=>$row8['KD4'],
		"KD5_8"=>$row8['KD5'],
		"UTS_8"=>$row8['UTS'],
		"UAS_8"=>$row8['UAS'],
		"COMMENT_8"=>$row8['Comment'],
		
			"id_9"=>$row9['id'],
		"Nama_9"=>$row9['Nama'],
		"KD1_9"=>$row9['KD1'],
		"KD2_9"=>$row9['KD2'],
		"KD3_9"=>$row9['KD3'],
		"KD4_9"=>$row9['KD4'],
		"KD5_9"=>$row9['KD5'],
		"UTS_9"=>$row9['UTS'],
		"UAS_9"=>$row9['UAS'],
		"COMMENT_9"=>$row9['Comment'],
		
			"id_10"=>$row10['id'],
		"Nama_10"=>$row10['Nama'],
		"KD1_10"=>$row10['KD1'],
		"KD2_10"=>$row10['KD2'],
		"KD3_10"=>$row10['KD3'],
		"KD4_10"=>$row10['KD4'],
		"KD5_10"=>$row10['KD5'],
		"UTS_10"=>$row10['UTS'],
		"UAS_10"=>$row10['UAS'],
		"COMMENT_10"=>$row10['Comment'],
		
			"id_11"=>$row11['id'],
		"Nama_11"=>$row11['Nama'],
		"KD1_11"=>$row11['KD1'],
		"KD2_11"=>$row11['KD2'],
		"KD3_11"=>$row11['KD3'],
		"KD4_11"=>$row11['KD4'],
		"KD5_11"=>$row11['KD5'],
		"UTS_11"=>$row11['UTS'],
		"UAS_11"=>$row11['UAS'],
		"COMMENT_11"=>$row11['Comment'],
		
		    "id_12"=>$row12['id'],
		"Nama_12"=>$row12['Nama'],
		"KD1_12"=>$row12['KD1'],
		"KD2_12"=>$row12['KD2'],
		"KD3_12"=>$row12['KD3'],
		"KD4_12"=>$row12['KD4'],
		"KD5_12"=>$row12['KD5'],
		"UTS_12"=>$row12['UTS'],
		"UAS_12"=>$row12['UAS'],
		"COMMENT_12"=>$row12['Comment'],
		
			"id_13"=>$row13['id'],
		"Nama_13"=>$row13['Nama'],
		"KD1_13"=>$row13['KD1'],
		"KD2_13"=>$row13['KD2'],
		"KD3_13"=>$row13['KD3'],
		"KD4_13"=>$row13['KD4'],
		"KD5_13"=>$row13['KD5'],
		"UTS_13"=>$row13['UTS'],
		"UAS_13"=>$row13['UAS'],
		"COMMENT_13"=>$row13['Comment'],
		
		    "id_14"=>$row14['id'],
		"Nama_14"=>$row14['Nama'],
		"KD1_14"=>$row14['KD1'],
		"KD2_14"=>$row14['KD2'],
		"KD3_14"=>$row14['KD3'],
		"KD4_14"=>$row14['KD4'],
		"KD5_14"=>$row14['KD5'],
		"UTS_14"=>$row14['UTS'],
		"UAS_14"=>$row14['UAS'],
		"COMMENT_14"=>$row14['Comment'],
		
			"id_15"=>$row15['id'],
		"Nama_15"=>$row15['Nama'],
		"KD1_15"=>$row15['KD1'],
		"KD2_15"=>$row15['KD2'],
		"KD3_15"=>$row15['KD3'],
		"KD4_15"=>$row15['KD4'],
		"KD5_15"=>$row15['KD5'],
		"UTS_15"=>$row15['UTS'],
		"UAS_15"=>$row15['UAS'],
		"COMMENT_15"=>$row15['Comment'],
		
				    "id_16"=>$row16['id'],
		"Nama_16"=>$row16['Nama'],
		"KD1_16"=>$row16['KD1'],
		"KD2_16"=>$row16['KD2'],
		"KD3_16"=>$row16['KD3'],
		"KD4_16"=>$row16['KD4'],
		"KD5_16"=>$row16['KD5'],
		"UTS_16"=>$row16['UTS'],
		"UAS_16"=>$row16['UAS'],
		"COMMENT_16"=>$row16['Comment'],
		
		    "id_17"=>$row17['id'],
		"Nama_17"=>$row17['Nama'],
		"KD1_17"=>$row17['KD1'],
		"KD2_17"=>$row17['KD2'],
		"KD3_17"=>$row17['KD3'],
		"KD4_17"=>$row17['KD4'],
		"KD5_17"=>$row17['KD5'],
		"UTS_17"=>$row17['UTS'],
		"UAS_17"=>$row17['UAS'],
		"COMMENT_17"=>$row17['Comment'],
		
			"id_18"=>$row18['id'],
		"Nama_18"=>$row18['Nama'],
		"KD1_18"=>$row18['KD1'],
		"KD2_18"=>$row18['KD2'],
		"KD3_18"=>$row18['KD3'],
		"KD4_18"=>$row18['KD4'],
		"KD5_18"=>$row18['KD5'],
		"UTS_18"=>$row18['UTS'],
		"UAS_18"=>$row18['UAS'],
		"COMMENT_18"=>$row18['Comment'],
		
		    "id_19"=>$row19['id'],
		"Nama_19"=>$row19['Nama'],
		"KD1_19"=>$row19['KD1'],
		"KD2_19"=>$row19['KD2'],
		"KD3_19"=>$row19['KD3'],
		"KD4_19"=>$row19['KD4'],
		"KD5_19"=>$row19['KD5'],
		"UTS_19"=>$row19['UTS'],
		"UAS_19"=>$row19['UAS'],
		"COMMENT_19"=>$row19['Comment'],
		
			"id_20"=>$row20['id'],
		"Nama_20"=>$row20['Nama'],
		"KD1_20"=>$row20['KD1'],
		"KD2_20"=>$row20['KD2'],
		"KD3_20"=>$row20['KD3'],
		"KD4_20"=>$row20['KD4'],
		"KD5_20"=>$row20['KD5'],
		"UTS_20"=>$row20['UTS'],
		"UAS_20"=>$row20['UAS'],
		"COMMENT_20"=>$row20['Comment'],
		
			"id_21"=>$row21['id'],
		"Nama_21"=>$row21['Nama'],
		"KD1_21"=>$row21['KD1'],
		"KD2_21"=>$row21['KD2'],
		"KD3_21"=>$row21['KD3'],
		"KD4_21"=>$row21['KD4'],
		"KD5_21"=>$row21['KD5'],
		"UTS_21"=>$row21['UTS'],
		"UAS_21"=>$row21['UAS'],
		"COMMENT_21"=>$row21['Comment'],
		
			"id_22"=>$row22['id'],
		"Nama_22"=>$row22['Nama'],
		"KD1_22"=>$row22['KD1'],
		"KD2_22"=>$row22['KD2'],
		"KD3_22"=>$row22['KD3'],
		"KD4_22"=>$row22['KD4'],
		"KD5_22"=>$row22['KD5'],
		"UTS_22"=>$row22['UTS'],
		"UAS_22"=>$row22['UAS'],
		"COMMENT_22"=>$row22['Comment'],
		
			"id_23"=>$row23['id'],
		"Nama_23"=>$row23['Nama'],
		"KD1_23"=>$row23['KD1'],
		"KD2_23"=>$row23['KD2'],
		"KD3_23"=>$row23['KD3'],
		"KD4_23"=>$row23['KD4'],
		"KD5_23"=>$row23['KD5'],
		"UTS_23"=>$row23['UTS'],
		"UAS_23"=>$row23['UAS'],
		"COMMENT_23"=>$row23['Comment'],
		
			"id_24"=>$row24['id'],
		"Nama_24"=>$row24['Nama'],
		"KD1_24"=>$row24['KD1'],
		"KD2_24"=>$row24['KD2'],
		"KD3_24"=>$row24['KD3'],
		"KD4_24"=>$row24['KD4'],
		"KD5_24"=>$row24['KD5'],
		"UTS_24"=>$row24['UTS'],
		"UAS_24"=>$row24['UAS'],
		"COMMENT_24"=>$row24['Comment'],
		
			"id_25"=>$row25['id'],
		"Nama_25"=>$row25['Nama'],
		"KD1_25"=>$row25['KD1'],
		"KD2_25"=>$row25['KD2'],
		"KD3_25"=>$row25['KD3'],
		"KD4_25"=>$row25['KD4'],
		"KD5_25"=>$row25['KD5'],
		"UTS_25"=>$row25['UTS'],
		"UAS_25"=>$row25['UAS'],
		"COMMENT_25"=>$row25['Comment'],
		
			"id_26"=>$row26['id'],
		"Nama_26"=>$row26['Nama'],
		"KD1_26"=>$row26['KD1'],
		"KD2_26"=>$row26['KD2'],
		"KD3_26"=>$row26['KD3'],
		"KD4_26"=>$row26['KD4'],
		"KD5_26"=>$row26['KD5'],
		"UTS_26"=>$row26['UTS'],
		"UAS_26"=>$row26['UAS'],
		"COMMENT_26"=>$row26['Comment'],
		
		    "id_27"=>$row27['id'],
		"Nama_27"=>$row27['Nama'],
		"KD1_27"=>$row27['KD1'],
		"KD2_27"=>$row27['KD2'],
		"KD3_27"=>$row27['KD3'],
		"KD4_27"=>$row27['KD4'],
		"KD5_27"=>$row27['KD5'],
		"UTS_27"=>$row27['UTS'],
		"UAS_27"=>$row27['UAS'],
		"COMMENT_27"=>$row27['Comment'],
		
			"id_28"=>$row28['id'],
		"Nama_28"=>$row28['Nama'],
		"KD1_28"=>$row28['KD1'],
		"KD2_28"=>$row28['KD2'],
		"KD3_28"=>$row28['KD3'],
		"KD4_28"=>$row28['KD4'],
		"KD5_28"=>$row28['KD5'],
		"UTS_28"=>$row28['UTS'],
		"UAS_28"=>$row28['UAS'],
		"COMMENT_28"=>$row28['Comment'],
		
		    "id_29"=>$row29['id'],
		"Nama_29"=>$row29['Nama'],
		"KD1_29"=>$row29['KD1'],
		"KD2_29"=>$row29['KD2'],
		"KD3_29"=>$row29['KD3'],
		"KD4_29"=>$row29['KD4'],
		"KD5_29"=>$row29['KD5'],
		"UTS_29"=>$row29['UTS'],
		"UAS_29"=>$row29['UAS'],
		"COMMENT_29"=>$row29['Comment'],
		
			"id_30"=>$row30['id'],
		"Nama_30"=>$row30['Nama'],
		"KD1_30"=>$row30['KD1'],
		"KD2_30"=>$row30['KD2'],
		"KD3_30"=>$row30['KD3'],
		"KD4_30"=>$row30['KD4'],
		"KD5_30"=>$row30['KD5'],
		"UTS_30"=>$row30['UTS'],
		"UAS_30"=>$row30['UAS'],
		"COMMENT_30"=>$row30['Comment'],
		));

 
	//Menampilkan dalam format JSON
	echo json_encode(array('result'=>$result));
	
	
	mysqli_close($con);
?>
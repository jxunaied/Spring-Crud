/**
 * 
 */

function inputFocus(i){
	if(i.value==i.defaultValue){ i.value=""; i.style.color="#000"; }
}
function inputBlur(i){
	if(i.value==""){ i.value=i.defaultValue; i.style.color="#848484"; }
}
 
 $(document).ready(function(){
 
 	$('.table .updateButton').on('click', function(event) {
 		event.preventDefault();

 		var href = $(this).attr('href');
 		$.get(href ,function(student, status) {
 			$('#editId').val(student.id);
			$('#fullName').val(student.fullName);
			$('#address').val(student.address);
			$('#phoneNo').val(student.phoneNo);
			$('#updatedBy').val(student.updatedBy);
			$('#updatedOn').val(student.updatedOn.substr(0, 10));
		});
 		$('#updateModal').modal();
 	});
 	
 	
 	$('.table .deleteStudent').on('click', function(event) {
 		event.preventDefault();

 		var href = $(this).attr('href');
 		$('#deleteModal #deleteStudent').attr('href', href);
 		$('#deleteModal').modal();
 	});
 
 });

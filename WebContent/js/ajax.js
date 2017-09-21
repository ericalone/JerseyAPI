$(document).ready(function() {
	$('#listUsers').click(function(event) {
		var uri = "rest/users";
		var name = $('#listUsers').val();
		
		$.getJSON(uri, function(data) {
			$("#ajaxResponse").text(JSON.stringify(data));
		});
	});
});

$(document).ready(function() {
	$('#showUser').click(function(event) {
		var uid = $('#userId').val();
		var uri = "rest/users/" + uid;
		
		$.getJSON(uri, function(data) {
			if(data == null)	{
				$("#ajaxResponse").text("No record found for UID: " + uid);
			} else {
				$("#ajaxResponse").text(JSON.stringify(data));
			}	
		});
	});
});

$(document).ready(function() {
	$('#addUser').click(function(event) {
		var uri = "rest/users";
		var data = { 
				firstName : $('#fname').val(),
				lastName: $('#lname').val(),
				avatar: $('#avatar').val(),
				id: $('#addUserId').val()
		};
				
		$.ajax({
		    type: "POST",
		    url: uri,
		    data: JSON.stringify(data),
		    contentType: "application/json",
		    dataType: "json",
		    success: function (result) {
		    		if(result == null)	{
					$("#ajaxResponse").text("Invalid data or user exists");
				} else {
					$("#ajaxResponse").text(JSON.stringify(result));
				}
		    }
		});
		
	});
});

$(document).ready(function() {
	$('#deleteUser').click(function(event) {
		var uid = $('#delUserId').val();
		var uri = "rest/users/" + uid;
		
		$.ajax({
		    type: "DELETE",
		    url: uri,
		    dataType: "json",
		    success: function (result) {
		    		if(result == null)	{
					$("#ajaxResponse").text("Invalid data");
				} else {
					$("#ajaxResponse").text(JSON.stringify(result));
				}
		    }
		});
	});
});
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
$("form").submit(function(event) {
event.preventDefault(); 

var formData = {
name: $("#name").val(),
email: $("#email").val()
};

$.ajax({
type: "POST",
url: "passinout",
data: formData,
success: function(response) {
$("#nameResult").text("Name: " + formData.name);
$("#emailResult").text("Email: " + formData.email);
},
error: function(error) {
console.log(error);
}
});
});
});
</script>
</head>
<body>
<h2>Hello World!</h2>
<form>
<label for="name">Name:</label>
<input type="text" name="name" id="name" required>


<label for="email">Email:</label>
<input type="email" name="email" id="email" required>


<input type="submit" value="Submit">
</form>

<div id="nameResult"></div> <!— Имя пользователя —>
<div id="emailResult"></div> <!— Email пользователя —>
</body>
</html>

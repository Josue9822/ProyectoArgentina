// Call the dataTables jQuery plugin
$(document).ready(function() {
	//on ready
});

async function registrarUsuario(){
	
	let datos = {};
	
	datos.nombre = document.getElementById('txtnombre').value;
	datos.apellido = document.getElementById('txtapellido').value;
	datos.email = document.getElementById('txtemail').value;
	datos.password = document.getElementById('txtpassword').value;
	
	let repetirPassword = document.getElementById('txtRepetirPassword').value;
	
	if(repetirPassword != datos.password){
		alert('La contraseña es diferente');
		return;
	}

  const request = await fetch('api/usuario', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  const usuarios = await request.json();
  
  
  
  
}


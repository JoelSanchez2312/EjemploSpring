function eliminar(id){
	swal({
		  title: "Desea eliminar el area?",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				  url:"/eliminar/"+id,
				  success: function(res) {
					console.log(res);
				}
			  });
		    swal("Eliminado exitoso", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listar";
		    	}
		    });
		  } else {
		    swal("No se eliminó el area!");
		  }
		});
}
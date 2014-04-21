jQuery(document).ready(function(){
	
jQuery("#options").click(function(){
		
		if($("input:radio[name=options]:checked" ).val() == 1){
			/**id input e label de ida e volta**/
			jQuery("#calendarVolta").show();
			jQuery("#dataVolta").show();
		}else{
			/**id input e label de ida e volta**/
			jQuery("#calendarVolta").hide();
			jQuery("#dataVolta").hide();
			
		}
	});
	
});

function validaForm(){
	
	var selecionadoForm1 = 0;
	var selecionadoForm2 = 0;
	
	jQuery("#form_1").each(function(){
		if(jQuery('input:radio').is(":checked")){
			if($("#tabela1 input:checked").size() ==  1){
				selecionadoForm1 = 1;
			}
		 }
		
	});
	
	jQuery("#form_1").each(function(){
		if(jQuery('input:radio').is(":checked")){
			if($("#tabela2 input:checked").size() ==  1){
				selecionadoForm2 = 1;
			}
		 }
		
	});
	
	
	if(selecionadoForm1 == 0 && selecionadoForm2 == 0){
		alert("Selecione duas Passagens");
		return false;
	}else if(selecionadoForm1 == 1 && selecionadoForm2 == 0){
		alert("Selecione mais uma  Passagem");
		return false;
	}else if(selecionadoForm1 == 0 && selecionadoForm2 == 1){
		alert("Selecione mais uma  Passagem");
		return false;
	}else{
		return true;
	}
}
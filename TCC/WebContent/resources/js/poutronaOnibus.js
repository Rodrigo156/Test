jQuery(document).ready(function(){
var cont = 0;

  	
jQuery("#tabela tr td").click(function(){
			if(jQuery(this).text() != ""  &&  !jQuery(this).hasClass("selecionado") && cont <= 2){
				jQuery(this).css("background-color","red");
				jQuery(this).addClass("selecionado");
				cont++;
			}else if(jQuery(this).text() != "" && jQuery(this).hasClass("selecionado")){
				jQuery(this).css("background-color","#4169E1");
				jQuery(this).removeClass("selecionado");
				cont--;
			}else if(!jQuery(this).hasClass("linha") && !jQuery(this).hasClass("frenteOnibus")){
				alert("O maximo para Comprar, é de 3 Passagem ");
			}
	});	
});
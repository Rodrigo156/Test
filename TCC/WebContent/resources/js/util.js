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
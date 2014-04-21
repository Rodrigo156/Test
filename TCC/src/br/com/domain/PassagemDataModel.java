package br.com.domain;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class PassagemDataModel extends ListDataModel<Passagem> implements SelectableDataModel<Passagem>{

	
	public PassagemDataModel(){
		
	}
	
	public PassagemDataModel(List<Passagem>data){
		super(data);
	}
	
	
	@Override
	public Passagem getRowData(String rowKey) {
		List<Passagem> Passagems = (List<Passagem>)getWrappedData();
		
		for(Passagem passagem : Passagems){
			if(passagem.getIdPassagem().equals(rowKey)){
				return passagem;
			}
		}
		
		return null;
	}

	@Override
	public Object getRowKey(Passagem Passagem) {
		return Passagem.getIdPassagem();
	}

}

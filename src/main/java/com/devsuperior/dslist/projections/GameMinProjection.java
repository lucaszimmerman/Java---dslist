package com.devsuperior.dslist.projections;

public interface GameMinProjection {
	//Aula 2 - Consulta SQL, projection, busca de gamespor lista

	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}

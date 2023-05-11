package com.devsuperior.dslist.projections;

public interface GameMinProjection {
	//Aula 2 - Consulta SQL, projection, busca de gamespor lista

	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}

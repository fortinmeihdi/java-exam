package examen;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Resultat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String Code;
	@Temporal(TemporalType.DATE)
	private Calendar dateDePassage;
	@Basic
	private String Nom;

}

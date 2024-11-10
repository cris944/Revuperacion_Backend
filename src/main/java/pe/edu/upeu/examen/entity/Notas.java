package pe.edu.upeu.examen.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="notas")
@CrossOrigin
public class Notas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nota1")
	private String nota1;
	
	@Column(name="nota2")
	private String nota2;
	
	@Column(name="nota3")
	private String nota3;
	
	@Column(name="promedio")
	private String promedio;
	
	@ManyToOne
	@JoinColumn(name="curso_id", nullable = false)
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name="alumno_id", nullable = false)
	private Alumno alumno;
}


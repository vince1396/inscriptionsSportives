package hibernate;

import javax.persistence.*;
import org.hibernate.*;

@Entity
@Table(name = "equipe")
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_e")
	private int id_e;
	
	public Equipe(int id_e)
	{
		this.id_e = id_e;
	}
}

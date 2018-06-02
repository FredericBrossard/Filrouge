package co.simplon.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FOODSGROUP")
public class FoodsGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_generator")
	@SequenceGenerator(name = "group_generator", sequenceName = "group_sequence", allocationSize = 1)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;
	
	@OneToMany //(cascade = CascadeType.ALL)
	//@OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	//@JoinColumn(name = "group_id")
	private Set<Foods> f;

	public FoodsGroup () {};
	
	public FoodsGroup (String string) {};
	
	public FoodsGroup(String name, Set<Foods> f) {
		super();
		this.name = name;
		this.f = f;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Foods> getF() {
		return f;
	}

	public void setF(Set<Foods> f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "FoodsGroup [id=" + id + ", name=" + name + ", f=" + f + "]";
	}


		
}

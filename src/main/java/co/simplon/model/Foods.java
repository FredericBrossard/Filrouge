package co.simplon.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "FOODS")
public class Foods {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foods_generator")
	@SequenceGenerator(name = "foods_generator", sequenceName = "foods_sequence", allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "NAME", nullable = true, length = 255)
	private String name;

	@ManyToOne // (fetch = FetchType.LAZY)
	@JoinColumn(name = "foodsGroup")
	// private FoodsGroup group;
	private FoodsGroup foodsGroup;

	@Column(name = "GLYCINDEX")
	public float glycIndex;

	@Column(name = "ENERGY")
	public float energy;

	// Glucides
	@Column(name = "CARBOHYDRATES")
	public float carbohydrates;

	@Column(name = "PROTEINS")
	public float proteins;

	@Column(name = "LIPIDS")
	public float lipids;

	@Column(name = "COMMENT")
	private String comment;

	@Column(name = "CREATDATE")
	@CreatedDate
	private final Calendar createDate = Calendar.getInstance();
	
	public Foods() {};

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

	public FoodsGroup getFoodsGroup() {
		return foodsGroup;
	}

	public void setFoodsGroup(FoodsGroup foodsGroup) {
		this.foodsGroup = foodsGroup;
	}

	public float getGlycIndex() {
		return glycIndex;
	}

	public void setGlycIndex(float glycIndex) {
		this.glycIndex = glycIndex;
	}

	public float getEnergy() {
		return energy;
	}

	public void setEnergy(float energy) {
		this.energy = energy;
	}

	public float getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(float carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public float getProteins() {
		return proteins;
	}

	public void setProteins(float proteins) {
		this.proteins = proteins;
	}

	public float getLipids() {
		return lipids;
	}

	public void setLipids(float lipids) {
		this.lipids = lipids;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	@Override
	public String toString() {
		return "Foods [id=" + id + ", name=" + name + ", glycIndex=" + glycIndex + ", energy=" + energy
				+ ", carbohydrates=" + carbohydrates + ", proteins=" + proteins + ", lipids=" + lipids + ", comment="
				+ comment + ", createDate=" + createDate + "]";
	}

	
	
}

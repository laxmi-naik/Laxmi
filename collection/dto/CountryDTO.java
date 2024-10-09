package com.xworkz.collection.dto;



import java.io.Serializable;

import com.xworkz.collection.run.Code;
import com.xworkz.collection.run.Continent;

public class CountryDTO  <A,B,L> {
	private A name;
	private Code code;
	private B population;
	private L presidentName;
	private Continent continent;
	
	public CountryDTO() {
		
	}

	public CountryDTO(A name, Code code, B population, L presidentName, Continent continent) {
		super();
		this.name = name;
		this.code = code;
		this.population = population;
		this.presidentName = presidentName;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", code=" + code + ", population=" + population + ", presidentName="
				+ presidentName + ", continent=" + continent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		if (code != other.code)
			return false;
		if (continent != other.continent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}

	public A getName() {
		return name;
	}

	public void setName(A name) {
		this.name = name;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public B getPopulation() {
		return population;
	}

	

	public L getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(L presidentName) {
		this.presidentName = presidentName;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	
	
}

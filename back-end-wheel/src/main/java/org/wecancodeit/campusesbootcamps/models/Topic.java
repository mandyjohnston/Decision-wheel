package org.wecancodeit.campusesbootcamps.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Topic {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;

	protected Topic() {
	} // why jpa why???

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getChoice1() {
		return choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public Topic(String name, String choice1, String choice2, String choice3, String choice4) {
		this.name = name;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
	}

	@Override
	public String toString() {
		return "Campus [name=" + name + "]";
	}

}

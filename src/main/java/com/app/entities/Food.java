package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "foods")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Food extends BaseEntity {

//	private Long foodId;

	private String name;

	private String description;

	private String Category;

	private Double price;
	
	@OneToMany
	private List<Restaurant> restaurantId = new ArrayList<>();

}

package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order extends BaseEntity{

	@OneToMany
	private List<Food> foods = new ArrayList<>();
	
	private Long quantity;
	
	private Double price;
	
	@ManyToOne
//	@JoinColumn(name = "")
	private User userId;
	
}

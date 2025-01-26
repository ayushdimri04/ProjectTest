package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tables")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tables extends BaseEntity {

	private Long tableNumber;

	private Long seatingCapacity;

	private String status;

	@ManyToOne
	private Restaurant restaurantId;

}

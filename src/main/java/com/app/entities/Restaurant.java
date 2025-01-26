package com.app.entities;

import java.time.LocalTime;
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
@Table(name = "restaurants")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Restaurant extends BaseEntity {

	private String name;

	private String address;

	private LocalTime openingTime;

	private LocalTime closingTime;

	private String fassaiId;

	private String status;

	private String foodType;

	@OneToMany(mappedBy = "restaurantId")
	private List<Tables> tableId = new ArrayList<>();

	@OneToMany
	private List<Staff> staffId = new ArrayList<>();

}

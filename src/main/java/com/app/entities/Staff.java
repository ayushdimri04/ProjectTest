package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "staffs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Staff extends BaseEntity {

	private Long id;

	private String Name;

	private String role;

	private String phoneNumber;

	private LocalDate hireDate;
	
	@OneToOne
	private Restaurant restrauntId;
}

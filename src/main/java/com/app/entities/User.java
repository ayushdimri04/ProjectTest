package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{

    private String email;
	
	private String FirstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String password;
	
	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<Order> orderId = new ArrayList<>();
	
}

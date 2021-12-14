package com.springBootAnt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "user_details")
public class UserEntity {

	@Id
	@GeneratedValue
	private int userId;

	private String firstName;

	private String lastName;

	private String emailId;
}

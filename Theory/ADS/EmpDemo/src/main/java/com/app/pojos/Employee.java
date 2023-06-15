package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ems")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(exclude = "passwd")
public class Employee extends BaseEntity{
	@Column(name="fname", length=20)
	private String firstName;
	@Column(name="lname", length=20)
	private String lastName;
	@Column(name="email_id", length=200, unique = true)
	@NotBlank(message = "Email can not be blank")
	@Email(message = "Invalid Email id...")
	private String email;
	@Column(name="sal")
	private double salary;
	private LocalDate joinDate;
	@Column(length=30)
	private String department;
	private String passwd;
	
	@ManyToOne
	private Department dept;
	
	
	
}

/*

{
        "firstName": "Adi",
        "lastName": "Pande",
        "email": "hjfhjhrj@gmail.com",
        "password": "123",
        "salary": 10000.0,
        "joinDate": "2023-07-23",
        "department": "RNDI"
    }

*/
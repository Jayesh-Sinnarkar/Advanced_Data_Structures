package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="dept")
@NoArgsConstructor
@Getter
@Setter
public class Department extends BaseEntity {
	
	@Column(name="DeptName", length=30, unique = true)
	private String dname;
	
	@OneToMany
	private List<Employee> employee = new ArrayList<Employee>();
	
	
	
	
	

}

package com.app.dtos;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponce {
	private String message;
	private LocalDate timeStamp;
	
	public ApiResponce(String msg)
	{
		this.message=msg;
		this.timeStamp=LocalDate.now();
	}

}

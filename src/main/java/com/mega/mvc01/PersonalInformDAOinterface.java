package com.mega.mvc01;

public interface PersonalInformDAOinterface {

	int create(PersonalInformDTO informDTO);

	PersonalInformDTO checkid(PersonalInformDTO informDTO);

	boolean login(PersonalInformDTO dto);

	PersonalInformDTO findid(PersonalInformDTO informDTO);

	PersonalInformDTO readinform(PersonalInformDTO informDTO);

	int edittel(PersonalInformDTO informDTO);

	int editemail(PersonalInformDTO informDTO);

	int editpw(PersonalInformDTO informDTO);

	int withdraw(PersonalInformDTO informDTO);

}
package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ecodation.dto.RegisterDto;
import com.ecodation.utils.IDbInterfaces;

public class RegisterDao implements IDbInterfaces<RegisterDto> {

	@Override
	public void create(RegisterDto registerDto) {
	try(Connection connection=dbConnection()) {
		String sql="insert into admin5(name,surname,password,email_address) values(?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, registerDto.getName());
		preparedStatement.setString(2, registerDto.getSurname());
		preparedStatement.setString(3, registerDto.getPassword());
		preparedStatement.setString(4, registerDto.getEmailAddress());
		int rows= preparedStatement.executeUpdate();
		if(rows>0) {
			System.out.println("başarılı bir şekilde eklendi");
		}else {
			System.out.println("başarısız  EKLENEMEDi...");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

	@Override
	public void update(RegisterDto registerDto) {
		try(Connection connection=dbConnection()) {
			String sql="update  admin5  set name=?,surname=?,password=?,email_address=? where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getName());
			preparedStatement.setString(2, registerDto.getSurname());
			preparedStatement.setString(3, registerDto.getPassword());
			preparedStatement.setString(4, registerDto.getEmailAddress());
			preparedStatement.setLong(5, registerDto.getId());
			int rows= preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("başarılı bir şekilde güncellendi");
			}else {
				System.out.println("başarısız  GÜNCELLENMEDİ...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(RegisterDto registerDto) {
		try(Connection connection=dbConnection()) {
			String sql="delete  from admin5  where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, registerDto.getId());
			int rows= preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("başarılı bir şekilde silindi");
			}else {
				System.out.println("başarısız  SİLİNMEDİ...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<RegisterDto> list() {
		RegisterDto dto;
		ArrayList<RegisterDto> registerList=new ArrayList<RegisterDto>();
		
		try(Connection connection=dbConnection()) {
			String sql="select *  from admin5";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				dto=new RegisterDto();
				dto.setId(resultSet.getLong("id"));
				dto.setName(resultSet.getString("name"));
				dto.setSurname(resultSet.getString("surname"));
				dto.setPassword(resultSet.getString("password"));
				dto.setEmailAddress(resultSet.getString("email_address"));
				dto.setCreationDate(resultSet.getDate("creation_date"));
				registerList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

}

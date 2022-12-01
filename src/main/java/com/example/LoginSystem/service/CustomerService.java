package com.example.LoginSystem.service;

import java.io.IOException;

public interface CustomerService {
	public boolean checkId(int id) throws IOException;
	public boolean checkPswd(int id,int password) throws IOException;
	public int checkaccount(int id,int password)throws IOException;
	public int checkvip(int iMoney,String type)throws IOException;
	public int checkuser(int id)throws IOException;
}

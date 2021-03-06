package com.bit.sts06.emp.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.sts06.emp.model.EmpDao;
import com.bit.sts06.emp.model.entity.EmpVo;

@Service
public class EmpServiceImpl implements Empservice {
	@Autowired
	EmpDao empDao;

	@Override
	public void list(HttpServletRequest req) throws SQLException {
		System.out.println("list(HttpServletRequest)");
		if(req.getParameter("page")==null)
			req.setAttribute("list", empDao.selectAll());
		else
			req.setAttribute("list"
					, empDao.selectAll(Integer.parseInt(req.getParameter("page"))));
	}

	@Override
	public void list(Model model) throws SQLException {
		System.out.println("list(Model)");
		model.addAttribute("list", empDao.selectAll());
	}

	@Override
	public void list(Model model, int page) throws SQLException {
		System.out.println("list(Model,page)");
		model.addAttribute("list", empDao.selectAll(page));
	}

	@Override
	public void insert(EmpVo bean) throws SQLException {
		empDao.insertOne(bean);
	}

}
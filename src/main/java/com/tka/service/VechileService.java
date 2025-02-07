package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.VechileDao;
import com.tka.entity.Vechile;

@Service
public class VechileService {

	@Autowired
	VechileDao dao;

	public String insertData(Vechile v) {
		String msg = dao.insertData(v);
		return msg;
	}

	public String deleteData(String vechile_no) {
		String msg = dao.deleteData(vechile_no);
		return msg;
	}

	public String updateData(Vechile v, String vechile_no) {
		String msg = dao.updateData(v, vechile_no);
		return msg;
	}

	public Vechile getSingleRecord(String vechile_no) {
		Vechile v1 = dao.getSinglRecord(vechile_no);
		return v1;
	}

	public List<Vechile> getAllRecord() {
		List<Vechile> list = dao.getAllRecord();
		return list;
	}

}

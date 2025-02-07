package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Vechile;
import com.tka.service.VechileService;

@RestController
public class VechileController {

	@Autowired
	VechileService service;

	@PostMapping("/VechileRecord")
	public String insertData(@RequestBody Vechile v) {
		String msg = service.insertData(v);
		return msg;
	}

	@DeleteMapping("/deletedata/{vechile_no}")
	public String deleteData(@PathVariable String vechile_no) {
		String msg = service.deleteData(vechile_no);
		return msg;
	}

	@PutMapping("/updatedata/{vechile_no}")
	public String updateData(@RequestBody Vechile v, @PathVariable String vechile_no) {
		String msg = service.updateData(v, vechile_no);
		return msg;
	}

	@GetMapping("/getsingledata/{vechile_no}")
	public Vechile getSingleRecord(@PathVariable String vechile_no) {
		Vechile v1 = service.getSingleRecord(vechile_no);
		return v1;
	}
	
	@GetMapping("/getalldata")
	public List<Vechile> getAllRecord() {
		List<Vechile> list = service.getAllRecord();
		return list;
	}
	
}

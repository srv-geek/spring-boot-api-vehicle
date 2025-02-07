package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Vechile;

@Repository
public class VechileDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Vechile v) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(v);
		tr.commit();
		ss.close();
		return "Data is inserted successufully!";
	}

	public String deleteData(String vechile_no) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Vechile v = ss.get(Vechile.class, vechile_no);
		ss.remove(v);
		tr.commit();
		ss.close();
		return "Data is deleted successufully!";
	}

	public String updateData(Vechile v, String vechile_no) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Vechile v1 = ss.get(Vechile.class, vechile_no);
		v1.setModel(v.getModel());
		v1.setType(v.getType());
		v1.setPrice(v.getPrice());
		ss.merge(v1);
		tr.commit();
		ss.close();
		return "Data is updated successfully!";

	}

	public Vechile getSinglRecord(String vechile_no) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "From Vechile where vechile_no =:vno";
		Query<Vechile> query = ss.createQuery(hqlquery, Vechile.class);
		query.setParameter("vno", vechile_no);
		Vechile v1 = query.uniqueResult();

		tr.commit();
		ss.close();
		return v1;
	}

	public List<Vechile> getAllRecord() {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "From Vechile";
		Query<Vechile> query = ss.createQuery(hqlquery, Vechile.class);
		List<Vechile> list = query.list();

		tr.commit();
		ss.close();
		return list;
	}

}

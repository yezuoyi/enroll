package com.eda.enroll.domain.controll;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eda.enroll.domain.model.ExamineeBaseInfo;
import com.eda.enroll.domain.model.Husband;
import com.eda.enroll.domain.model.Wife;
import com.eda.enroll.domain.repository.ExamineeBaseInfoRepository;
import com.eda.enroll.domain.repository.HusbandRepository;

@Controller
public class ExamineeControll {
	@Autowired
	ExamineeBaseInfoRepository examineeBaseInfoRepository;
	
	@Autowired
    HusbandRepository husbandRepo;
	
	 @RequestMapping("/getbyname")
	 @ResponseBody
	 public ExamineeBaseInfo getByName(String name) {
	     return examineeBaseInfoRepository.findByName(name);
	    }
	 @RequestMapping("/getall")
	 @ResponseBody
	 public List<ExamineeBaseInfo> getAll(){
		 return examineeBaseInfoRepository.getAll();
	 }
	 
	 @RequestMapping("/generatespouse")
	 @ResponseBody
	 public Husband generatehusband(){
			// 加入级联持久化，Husband可以直接把Wife保存，不需要先保存Wife
			Husband husband = new Husband("Tom "+UUID.randomUUID());
			Wife wife = new Wife("Jerry "+UUID.randomUUID());
			husband.setWife(wife);
			husbandRepo.save(husband);
			return husband;
	 }
	 
	 
	 @RequestMapping("/deletespouse")
	 @ResponseBody
	 public Husband deleteHusband(int id){
			// 加入级联持久化，Husband可以直接把Wife保存，不需要先保存Wife
		 	Husband husband = husbandRepo.findOne(id);
		 	if (null!=husband) {
		 		husbandRepo.delete(husband.getHid());
			}
			return husband;
	 }
	 
	 @RequestMapping("/findallspouce")
	 @ResponseBody
	 public List<Husband> findAllHusband(){
			return (List<Husband>) husbandRepo.findAll();
	 }
	 
	 
}

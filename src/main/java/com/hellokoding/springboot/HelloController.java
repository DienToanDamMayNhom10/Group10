package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import connectDB.adapter;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/webapp")
    public String hello2(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "NewFile";
    }
    @RequestMapping("/edit")
    public String edit(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	adapter get =new adapter();
    	String noidung = get.layNoidung();
        model.addAttribute("noidung", noidung);
        return "Edit";
    }
   /* @RequestMapping("/EDIT")
    public String edit(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("message", "hello");
        return "ckeditor";
    }*/
    
    @RequestMapping(value ="/upload")
    @ResponseBody 
    public String uploadck(Model model,@RequestParam("noidung") String noidung) {
    	try{
	    	adapter set = new adapter();
	    	set.CapNhat(noidung);
	    	//System.out.println(noidung);
	    	return "thanhcong";
    	}
    	catch (Exception e) {
    		return "thatbai";
		}
        
    }
    

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PayRoll;
import com.example.demo.service.PayRollService;


@RestController
public class PayRollController {
	
	@Autowired
	PayRollService prs;
	
	@PostMapping("addpay")
	public PayRoll add(@RequestBody PayRoll pr)
	{
		return prs.saveinfo(pr);
	}
	
	//to store n profiles *temporary*
	@PostMapping("addnpay")
	public List<PayRoll> addndetails(@RequestBody List<PayRoll> pr)
	{
		return prs.savedetails(pr);
	}
	
	@GetMapping("showpayroll")
    public List<PayRoll> show()
    {
    	return prs.showinfo();
    }
	@GetMapping("prshowbyid/{id}")
	public Optional<PayRoll> showid(@PathVariable int id)
	{
		return prs.showbyid(id);
	}
	@PutMapping("prupdatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody PayRoll pr )
	{
		return prs.updateinfobyid(id, pr);
	}
	@DeleteMapping("prdelid/{id}")
	public String deleteinfo(@PathVariable int id)
	{
		prs.deletepvid(id);
		return "Salary details removed successfully";
	}

}

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

import com.example.demo.model.PersonalProfile;
import com.example.demo.service.PersonalProfileService;
@RestController
public class PersonalProfileController {
	
	@Autowired
	PersonalProfileService pps;
	
	@PostMapping("addprofile")
	public PersonalProfile add(@RequestBody PersonalProfile pp)
	{
		return pps.saveinfo(pp);
	}
	
	//to store n profiles *temporary*
	@PostMapping("addnprofile")
	public List<PersonalProfile> addndetails(@RequestBody List<PersonalProfile> pp)
	{
		return pps.savedetails(pp);
	}
	
	@GetMapping("showprofiles")
    public List<PersonalProfile> show()
    {
    	return pps.showinfo();
    }
	@GetMapping("ppshowbyid/{id}")
	public Optional<PersonalProfile> showid(@PathVariable int id)
	{
		return pps.showbyid(id);
	}
	@PutMapping("ppupdatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody PersonalProfile pp )
	{
		return pps.updateinfobyid(id, pp);
	}
	@DeleteMapping("ppdelid/{id}")
	public String deleteinfo(@PathVariable int id)
	{
		pps.deletepvid(id);
		return "Removed successfully";
	}

}

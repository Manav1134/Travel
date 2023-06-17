package com.spirale.TourPackages.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirale.TourPackages.entity.TravelPackages;
import com.spirale.TourPackages.response.ResponseObject;
import com.spirale.TourPackages.service.TravelPackageService;


@RestController
@RequestMapping("/packages")
public class TravelPackageController {
	@Autowired
	TravelPackageService service;
	
	
	
	@GetMapping("/hi")
	public String hii()
{
	 return "radhe krishna";	 
}
	
	
@PostMapping("/create")

public TravelPackages addPackage(@RequestBody TravelPackages pack ) {
	
	 TravelPackages create = service.create(pack);

	 
	 return create;
}




@GetMapping("/getAll")
public List<TravelPackages> getAllPackage() {
	return service.getAll();
}






@PatchMapping("/update/{packageId}")
public ResponseObject updatePackaGE(@PathVariable Integer packageId,@RequestBody TravelPackages pack) {
//	if(cus.getRole()==UserRole.Admin) {
		 pack.setPackageId(packageId);
			return service.updatepack(pack);  
		
	
}
	



@GetMapping("/getOne/{packageId}")
public Optional<TravelPackages> getOne(@PathVariable Integer packageId) {
	return service.getOne(packageId);
}




@DeleteMapping("/deletePack/{packageId}")
public ResponseObject delete( @PathVariable Integer packageId) {
	return service.deletePackage(packageId);
}

//@GetMapping("/findFiled")
//public Integer getJoinInformation() {
//	return service.getinfo();
//}

}


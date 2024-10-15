package in.arjun.controller;

import in.arjun.model.entity.Address;
import in.arjun.model.request.AddressRequest;
import in.arjun.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/save")
    public Address addAddress(@RequestBody AddressRequest addressRequest){
        return addressService.saveAddress(addressRequest);
    }
}

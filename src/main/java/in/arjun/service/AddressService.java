package in.arjun.service;

import in.arjun.model.entity.Address;
import in.arjun.model.request.AddressRequest;
import in.arjun.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(AddressRequest addressRequest){
        Address address=Address.builder()
                .houseNo(addressRequest.getHouseNo())
                .street(addressRequest.getStreet())
                .city(addressRequest.getCity())
                .state(addressRequest.getState())
                .zipcode(addressRequest.getZipcode())
                .country(addressRequest.getCountry())
                .build();
        return addressRepository.save(address);
    }
}

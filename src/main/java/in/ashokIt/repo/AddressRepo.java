package in.ashokIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokIt.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}

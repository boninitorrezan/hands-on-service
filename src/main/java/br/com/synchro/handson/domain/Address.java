package br.com.synchro.handson.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tb_address")
@XmlRootElement
@SuppressWarnings("serial")
public class Address implements Serializable {
    @Id
    @SequenceGenerator(name = "SYN_SEQ_ADDRESS", sequenceName = "SYN_SEQ_ADDRESS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SYN_SEQ_ADDRESS")
    @Column(name = "id", unique = true, nullable = false)
	private Long id;
    
    @Column(name = "number_id")
    private Integer number;
    
    @Column(name = "district")
    private String district;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "street")
    private String street;

	@Column(name = "zipcode")
    private String zipcode;
  
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
	    this.street = street;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", number=" + number + ", district="
				+ district + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}

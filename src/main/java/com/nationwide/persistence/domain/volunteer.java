package com.nationwide.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class volunteer {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String orgname;
	private String aboutorg;
	private String location;
	private String areaofwork;
	private String skillset;
	private String weblink;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getAboutorg() {
		return aboutorg;
	}
	public void setAboutorg(String aboutorg) {
		this.aboutorg = aboutorg;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAreaofwork() {
		return areaofwork;
	}
	public void setAreaofwork(String areaofwork) {
		this.areaofwork = areaofwork;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public String getWeblink() {
		return weblink;
	}
	public void setWeblink(String weblink) {
		this.weblink = weblink;
	}
	
	
}

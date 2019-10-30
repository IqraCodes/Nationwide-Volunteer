package com.nationwide.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Volunteer {

	@Id
	@GeneratedValue
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
	public Volunteer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Volunteer(Long id, String orgname, String aboutorg, String location, String areaofwork, String skillset,
			String weblink) {
		super();
		this.id = id;
		this.orgname = orgname;
		this.aboutorg = aboutorg;
		this.location = location;
		this.areaofwork = areaofwork;
		this.skillset = skillset;
		this.weblink = weblink;
	}
	
	
}

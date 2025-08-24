package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String id;
    private String name;
    private String email;
    private String profile;

    public User(String id, String name, String profile) {
    	this.id = id;
        this.name = name;
        this.profile = profile;
    }

    public String getId() { return id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getProfile() { return profile; }
    public void setProfile(String profile) { this.profile = profile; }
}

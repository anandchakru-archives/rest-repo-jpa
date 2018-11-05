package com.anandchakru.app.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "app")
@SuppressWarnings("serial")
public class App implements Serializable {
	@Id
	@Column(name = "app_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appId;
	private String name;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "app", cascade = CascadeType.PERSIST)
	private Set<History> history = new HashSet<>();

	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<History> getHistory() {
		return history;
	}
	public void setHistory(Set<History> history) {
		this.history = history;
	}
}
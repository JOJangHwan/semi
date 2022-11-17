package com.git.model.vo;

import java.util.Objects;

public class Member {
	private String memberId;
	private String membername;
	private String memberpwd;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String membername, String memberpwd) {
		super();
		this.memberId = memberId;
		this.membername = membername;
		this.memberpwd = memberpwd;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberpwd() {
		return memberpwd;
	}

	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", membername=" + membername + ", memberpwd=" + memberpwd + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId, membername, memberpwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberId, other.memberId) && Objects.equals(membername, other.membername)
				&& Objects.equals(memberpwd, other.memberpwd);
	}
	
	   

}

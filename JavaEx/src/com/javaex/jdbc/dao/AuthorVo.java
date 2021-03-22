package com.javaex.jdbc.dao;

// DTO(VO) : �ڹ��� ��ü�� ������ ������ ���� �� ��ü
//�Ϲ������� ������ ��� ���� �ʴ�
//�ʵ�,getter/setter, toString(), equals() ������ ������ �ִ�
public class AuthorVo {
	private Long id;	// DTO ��ü������ �⺻Ÿ���� �� ������� �ʴ´�(null�� �����ؾ� �Ѵ�)
	private String name;
	private String bio;
	
	public AuthorVo() {
		//�⺻ ������
	}
	//getters/setters
	public AuthorVo(String name, String bio) {
		this.name = name;
		this.bio = bio;
	}
	public AuthorVo(Long id, String name, String bio) {
		this(name, bio);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	//��ü ���
	@Override
	public String toString() {
		return "AuthorVo [id=" + id + ", name=" + name + ", bio=" + bio + "]";
	}
	
	
}

package com.javaex.jdbc.dao;

import java.util.List;

//���� �Ծ�
// 	Interface�� implements �� ��� ��ü�� ������ �߻�޼��带 ���  Override�ؾ��Ѵ�
public interface AuthorDao {
	public List<AuthorVo> getList();
	public List<AuthorVo> search(String keyword);
	public AuthorVo get(Long id);
	public boolean insert(AuthorVo vo);
	public boolean update(AuthorVo vo);
	public boolean delete(Long id);
}

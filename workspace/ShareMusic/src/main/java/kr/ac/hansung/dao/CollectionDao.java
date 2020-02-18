package kr.ac.hansung.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Song;

@Repository
public class CollectionDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);//dataSource를 인자로 한 JdbcTemplate객체를 생성	
	}
	
	public boolean insert(Song song) {
		
		String id = song.getId();
		String titleofsong = song.getTitleofsong();
		String singer = song.getSinger();
		
		String sqlStatement = "insert into collection (id,titleofsong,singer) values(?,?,?)";
		return (jdbcTemplate.update(sqlStatement, new Object[] {id,titleofsong,singer}) == 1); //update된 레코드갯수가 리턴됨
		
	}
}

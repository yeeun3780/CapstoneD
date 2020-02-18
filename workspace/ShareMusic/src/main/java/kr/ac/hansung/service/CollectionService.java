package kr.ac.hansung.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CollectionDao;
import kr.ac.hansung.model.Song;

@Service
public class CollectionService {
	@Autowired
	private CollectionDao collectionDao;
	
	public void insert(List<String> collectionList) {
		Iterator<String> it = collectionList.iterator();
		String id = "asdf";
		while(it.hasNext()) {
			String titleofsong = it.next();
			String singer = it.next();
			Song s = new Song(id,titleofsong,singer);
			System.out.println(titleofsong);
			System.out.println(singer);
			collectionDao.insert(s);
		}
	}
	
	
	
}

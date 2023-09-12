package com.kh.youtube.service;

import com.kh.youtube.domain.Subscribe;
import com.kh.youtube.domain.Subscribe;
import com.kh.youtube.repo.MemberDAO;
import com.kh.youtube.repo.SubscribeDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SubscribeService {

    @Autowired
    private SubscribeDAO subscribeDAO;

    @Autowired
    private MemberDAO memberDAO;

    public List<Subscribe> showAll() {
        return subscribeDAO.findAll();
    }

    public Subscribe show(int id){
        return subscribeDAO.findById(id).orElse(null);
    }

    public Subscribe create(Subscribe vo) {
        return subscribeDAO.save(vo);
    }

    public Subscribe update(Subscribe vo) {
        Subscribe target = subscribeDAO.findById(vo.getSubsCode()).orElse(null);
        if(target != null) {
            return subscribeDAO.save(vo);
        }
        return null;
    }

    public Subscribe delete(int id) {
        Subscribe target = subscribeDAO.findById(id).orElse(null);
        subscribeDAO.delete(target);
        return target;
    }

    public List<Subscribe> findByMemberId(String id) {
        return subscribeDAO.findByMemberId(id);
    }
}

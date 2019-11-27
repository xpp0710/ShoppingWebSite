package com.xpp.service;

import com.xpp.dao.StatusDao;
import com.xpp.po.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XPP
 * @create 2019-11-21-15:00
 */
@Service
public class StatusServiceimpl implements StatusService {

    @Autowired
    private StatusDao statusDao;
    public List<Status> selectAll() {
        return statusDao.selectAll();
    }

    public Status selectId(int statusId) {
        return statusDao.selectId(statusId);
    }


}

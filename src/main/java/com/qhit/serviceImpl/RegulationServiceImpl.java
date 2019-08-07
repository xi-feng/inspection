package com.qhit.serviceImpl;

import com.qhit.mapper.RegulationDao;
import com.qhit.pojo.Regulation;
import com.qhit.service.RegulationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RegulationServiceImpl implements RegulationService {
    @Resource
    RegulationDao regulationDao;
    @Override
    public List<Regulation> getRegulationList() {
        return regulationDao.selectByExample(null);
    }

    @Override
    public int mgzadd(String sensitive, String id) {

        return 0;
    }
}

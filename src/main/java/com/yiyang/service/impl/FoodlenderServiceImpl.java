package com.yiyang.service.impl;

import com.yiyang.dao.FoodlenderMapper;
import com.yiyang.entity.Foodlender;
import com.yiyang.entity.FoodlenderExample;
import com.yiyang.service.FoodlenderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodlenderServiceImpl implements FoodlenderService {
    private FoodlenderMapper fdlMapper;
    @Override
    public int add(Foodlender fdl) {
        return fdlMapper.insert(fdl);
    }

    @Override
    public int delete(int id) {
        return fdlMapper.deleteByPrimaryKey((byte) id);
    }

    @Override
    public int edit(Foodlender fdl) {
        return fdlMapper.updateByPrimaryKey(fdl);
    }

    @Override
    public List<Foodlender> getfoods(FoodlenderExample example) {
        return fdlMapper.selectByExample(example);
    }

    @Override
    public Foodlender selectByPrimaryKey(byte id) {
        return fdlMapper.selectByPrimaryKey(id);
    }
}

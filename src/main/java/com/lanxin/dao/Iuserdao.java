package com.lanxin.dao;

import com.lanxin.util.Resout;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 曼珠沙华 on 2019/9/26.
 */
@Mapper
public interface Iuserdao {

    public String selctpassbyusername(String username);

    public String  selectjuesebyusername(String username);

    public List<String> slectquanxibyjuese(String juese);
}

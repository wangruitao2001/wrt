package com.lanxin;

import static org.junit.Assert.assertTrue;

import com.lanxin.bean.users;
import com.lanxin.dao.Iuserdao;
import com.lanxin.util.Resout;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Autowired
    private Iuserdao iuserdao;


    @Test
    public void shouldAnswerWithTrue()
    {
       //Resout pass=iuserdao.selectjuesebyusername();

        //System.out.println(pass);
    }
}

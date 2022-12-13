
package com.example.admin_fintech.mapper;

import com.example.admin_fintech.buy.dto.Buy;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
@Mapper
public interface BuyMapper {
    public ArrayList<Buy> SelectBuy();

}

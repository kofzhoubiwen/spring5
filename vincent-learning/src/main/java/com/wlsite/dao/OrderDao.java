package com.wlsite.dao;

import com.wlsite.anno.VincentSelect;

public interface OrderDao {
    @VincentSelect("SELECT * FROM T_ORDER")
    void query(String sql);
}

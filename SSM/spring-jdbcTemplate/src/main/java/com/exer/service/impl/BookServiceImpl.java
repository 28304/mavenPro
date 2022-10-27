package com.exer.service.impl;

import com.exer.dao.BookDao;
import com.exer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional(
//          设置只读：当事务中全是查询操作时，可将readOnly设置成true提升数据库效率
//            readOnly = false
//          设置超时时间，当事务超出贵定的时间时，将强制回滚并抛出异常
//        timeout = -1
    )
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书库存
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId,price);
    }
}

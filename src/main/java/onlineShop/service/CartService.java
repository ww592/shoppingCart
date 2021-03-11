package onlineShop.service;

import onlineShop.dao.CartDao;
import onlineShop.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    public Cart getCart(int cartId) { return cartDao.getCart(cartId);}

}

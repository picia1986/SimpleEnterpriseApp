package com.kgroup;

import javax.ejb.Stateless;

/**
 *
 * @author picia
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

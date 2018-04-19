/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kgroup;

import javax.ejb.Local;

/**
 *
 * @author picia
 */
@Local
public interface CalcBeanLocal {

    Integer addition(int a, int b);
    
}

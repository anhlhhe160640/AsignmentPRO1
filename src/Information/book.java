/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

/**
 *
 * @author admin
 */
public class book {
    private String code;
    private String title;
    private int qua;
    private double price;

    public book() {

    }
    public book(String code, String name, int qua, double price) {
        this.code = code;
        this.title = title;
        this.qua = qua;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getQua() {
        return qua;
    }
    public void setQua(int qua) {
        this.qua = qua;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return code + " , " + title + " , " + qua + " , " + price;
    }
    
  
}

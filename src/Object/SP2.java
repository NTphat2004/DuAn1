/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author phong
 */
public class SP2 {

    private String name;
    private float gia;
    private String ImgUrl;
    private int soluong;

    public String getName() {
        return name;
    }

    public float getGia() {
        return gia;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public SP2(String name, float gia, String ImgUrl,int Soluong) {
        this.name = name;
        this.gia = gia;
        this.ImgUrl = ImgUrl;
        this.soluong= Soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public SP2() {
    }

}

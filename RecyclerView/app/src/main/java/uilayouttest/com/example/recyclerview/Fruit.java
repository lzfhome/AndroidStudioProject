/**
 * Created by Administrator on 2023/4/17 0017.
 */
package uilayouttest.com.example.recyclerview;

public class Fruit {
    private  String name;
    private  int imageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }

}

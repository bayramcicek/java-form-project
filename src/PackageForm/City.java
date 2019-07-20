/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageForm;

/**
 * created on Jul 20, 2019 1:01:52 PM
 * @author bayramcicek
 */
public class City {
    private int city_id, city_population;
    private String city_name;

    public City(int city_id, String city_name, int city_population) {
        this.city_id = city_id;
        this.city_population = city_population;
        this.city_name = city_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public int getCity_population() {
        return city_population;
    }

    public String getCity_name() {
        return city_name;
    }
    
    

}

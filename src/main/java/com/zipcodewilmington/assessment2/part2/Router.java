package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    HashMap<String, String> map = new HashMap<>();
    StringBuilder routerString = new StringBuilder();


    public void add(String path, String controller) {
        map.put(path, controller);
        routerString.append(path);
        routerString.append(controller).append("\n");
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    public String toString(){
        return routerString.toString();
    }
}

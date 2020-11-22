package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    LinkedHashMap<String, String> map = new LinkedHashMap<>();

    public void add(String path, String controller) {
        map.put(path, controller);
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
        StringBuilder routerString = new StringBuilder();

        for(Map.Entry<String, String> entry : map.entrySet()){
            routerString.append(entry.getKey()).append(entry.getValue()).append("\n");
        }
        return routerString.toString();
    }
}

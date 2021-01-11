package kz.edu.astanait;

import java.util.Map;

public class DTO {
    private Integer frequency;
    private Map<String,Integer> map;

    public DTO(Integer frequency, Map<String, Integer> map) {
        this.frequency = frequency;
        this.map = map;
    }

    public DTO() {
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}

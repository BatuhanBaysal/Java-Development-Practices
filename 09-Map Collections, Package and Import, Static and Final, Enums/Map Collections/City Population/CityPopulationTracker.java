import java.util.HashMap;

public class CityPopulationTracker {
    
    private HashMap<String, City> cityPopulation;

    public CityPopulationTracker() {
        this.cityPopulation = new HashMap<>();
    }

    public City getCity(String cityName) {
        return new City(cityPopulation.get(cityName));
    }

    public void setCity(City city) {
        cityPopulation.put(city.getName(), new City(city));
    }

    public void addCity(City city) {
        cityPopulation.put(city.getName(), new City(city));
    }
}
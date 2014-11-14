package weather.service;

import weather.model.TemperatureInfo;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface WeatherService {
	@WebMethod(operationName="getQsTemps")
    public List<TemperatureInfo> getTemperatures(String city, List<Date> dates);
}
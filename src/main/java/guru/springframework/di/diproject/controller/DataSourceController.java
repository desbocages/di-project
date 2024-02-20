package guru.springframework.di.diproject.controller;

import guru.springframework.di.diproject.services.DataSourceService;
import org.springframework.stereotype.Controller;


@Controller
public class DataSourceController {

    private final DataSourceService service;

    public DataSourceController(DataSourceService service) {
        this.service = service;
    }

    public String getDataSource(){
        return service.getDataSource();
    }
}

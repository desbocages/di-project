package guru.springframework.di.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Dev","default"})
@Service("dataSource")
public class DevDataSourceServiceImpl implements DataSourceService{

    @Override
    public String getDataSource() {
        return "Dev";
    }
}
